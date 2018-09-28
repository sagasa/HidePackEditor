package helper;

import java.util.List;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.CodeSource;
import java.security.PermissionCollection;
import java.security.Permissions;
import java.security.Policy;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.ProtectionDomain;
import java.util.Date;

import javax.script.Compilable;
import javax.script.CompiledScript;
import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;

/** Java と JavaScript の連携 */
public class JavaScriptTest {
	protected static ScriptEngine scriptEngine = new ScriptEngineManager().getEngineByName("JavaScript");
	static void timetest(){
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("JavaScript");
		System.out.println(manager.getEngineByName("JavaScript"));
		System.out.println(manager.getEngineByName("JavaScript"));
		long time = System.nanoTime();
		time = System.nanoTime() - time;
		System.out.println(time/1000000d);
	}

	public static void test() throws Exception {
		timetest();

		Compilable compilingEngine = (Compilable) scriptEngine;
		System.out.println(compilingEngine+" "+scriptEngine);
		CompiledScript cscript = compilingEngine.compile("print('Hello')");


		System.out.println("java.version: " + System.getProperty("java.version"));


		// JavaScript の実行
		scriptEngine.eval("var message = 'Hello, I am JavaScript.'");
		scriptEngine.eval("print('#1: ' + message)");

		// Java のオブジェクトを JavaScript に渡してみる
		scriptEngine.put("message2", "Hello, I am Java8.");
		scriptEngine.put("today", new Date());
		scriptEngine.eval("print('#2: ' + message2 + ' now : ' + today.toString())");

		// JavaScript から Java のメソッドを使用
		scriptEngine.eval("var obj = Java.type('helper.JavaScriptTest');" + "print('#3: ' + obj.getMessage());");
		scriptEngine.eval("obj.printMessage('Good afternoon.');");

		// Java から JavaScript の値を取得
		scriptEngine.eval("var message3 = 'Good evening.';");
		Object message3 = scriptEngine.get("message3");
		System.out.println("#5: " + message3);

		// Java から JavaScript の関数を呼び出し
		if (scriptEngine instanceof Invocable) {
			Invocable invocable = (Invocable) scriptEngine;
			scriptEngine.eval("var func = function(arg) { print('#6: ' + arg);}");
			invocable.invokeFunction("func", "Good night.");
		}
	}

	/** メッセージを返す */
	public static String getMessage() {
		return "Good morning.";
	}

	/** メッセージを出力 */
	public static void printMessage(String message) {
		System.out.println("#4: " + message);
	}

	public static void init() {
		System.out.println("start");

		// 外側のコードのセキュリティポリシー
		// このサンプルではデフォルト設定を使う
		Policy policy = new Policy() {

		};
		Policy.setPolicy(policy);

		// setSecurityManagerをするとセキュリティマネージャが有効になる
		// System.setSecurityManager(new SecurityManager());

		PermissionCollection permissions = new Permissions();
		// ここで必要なパーミッションがあれば追加する
		// permissions.add(new RuntimePermission("createClassLoader"));

		// AccessControlContextを作る
		CodeSource codeSource = JavaScriptTest.class.getProtectionDomain().getCodeSource();
		ProtectionDomain domain = new ProtectionDomain(codeSource, permissions);
		ProtectionDomain[] domains = new ProtectionDomain[] { domain };
		AccessControlContext context = new AccessControlContext(domains);

		System.out.println();

		// 権限を絞って動作させる処理のラッパー
		PrivilegedExceptionAction<Void> action = new MyPrivilegedExceptionAction();

		// 引数で渡したAccessControlContextがもつパーミッションと、
		// 現在のパーミッションとの共通部分のパーミッションで実行される
		try {
			AccessController.doPrivileged(action, context);
		} catch (PrivilegedActionException e) {
			// 例外が発生した場合
			e.printStackTrace();
		}
	}

	/** 権限を絞って動作させる処理のラッパー */
	static class MyPrivilegedExceptionAction implements PrivilegedExceptionAction<Void> {

		/** このメソッドが指定の権限で動作する */
		@Override
		public Void run() throws Exception {
			System.out.println("in MyPrivilegedAction");

			ScriptEngineManager manager = new ScriptEngineManager();
			ScriptEngine engine = manager.getEngineByName("js");

			// スクリプト内でSystem.exit()を呼ぶ
	//		engine.eval("java.lang.System.exit(0)");

			// exit()されるのでここは実行されない
			System.out.println("end");
			return null;
		}
	}
}