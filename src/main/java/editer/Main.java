package editer;

import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import editer.mainWindow.MainWindow;
import io.PackIO;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import localize.LocalizeHandler;
import types.PackInfo;
import types.guns.BulletData;
import types.guns.GunData;

public class Main extends Application{
	/**開いているpath*/
	public static String packPath;

	/** パック */
	public static PackInfo Pack;
	/** 銃のMAP DisplayName-GunData */
	public static Map<String, GunData> GunList = new HashMap<String, GunData>();
	/** 弾のMAP DisplayName-BulletData */
	public static Map<String, BulletData> BulletList = new HashMap<String, BulletData>();
	/** IconのMAP Name - BufferedImage */
	public static Map<String, BufferedImage> IconMap = new HashMap<String, BufferedImage>();
	/** ScopeのMAP Name - BufferedImage */
	public static Map<String, BufferedImage> ScopeMap = new HashMap<String, BufferedImage>();
	/** SoundのMAP Name - byte[] */
	public static Map<String, byte[]> SoundMap = new HashMap<String, byte[]>();

	public static void main(String[] arg){
		LocalizeHandler.init();
		LocalizeHandler.loadLang();
		PackIO.makePack();
	//	new MainWindow();
		launch(arg);
	}

	private static final Logger log = LoggerFactory.getLogger(Main.class);
	public void start(Stage stage) throws Exception {

        log.info("Starting Hello JavaFX and Maven demonstration application");

        String fxmlFile = "/fxml/editer.fxml";
        log.debug("Loading FXML for main view from: {}", fxmlFile);
        FXMLLoader loader = new FXMLLoader();
        Pane rootNode = (Pane) loader.load(getClass().getResourceAsStream(fxmlFile));
        log.debug("Showing JFX scene");
        Scene scene = new Scene(rootNode, 400, 200);
        scene.getStylesheets().add("/styles/styles.css");

        stage.setTitle("Hello JavaFX and Maven");
        stage.setScene(scene);
        stage.show();
    }

	/** パック初期化 */
	public static void clear() {
		packPath = null;
		Pack = null;
		BulletList = new HashMap<String, BulletData>();
		GunList = new HashMap<String, GunData>();
		IconMap = new HashMap<String, BufferedImage>();
		ScopeMap = new HashMap<String, BufferedImage>();
		SoundMap = new HashMap<String, byte[]>();
	}
}
