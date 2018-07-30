package helper;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.swing.TransferHandler;
import editer.Window;
import io.PackIO;

/**
 * ドロップ操作の処理を行うクラス
 */
public class DropFileHandler extends TransferHandler {
	private static final long serialVersionUID = -4562293143459069971L;

	public static final int GUNS = 1;
	public static final int MAGAZINES = 2;
	public static final int ICONS = 3;
	public static final int SOUNDS = 4;
	public static final int SCOPE = 5;
	public static final int ARMOR = 6;
	public static final int ATTACHMENT = 7;

	int Mode;
	/**モードを指定する*/
	public DropFileHandler(int mode) {
		Mode = mode;
	}

	/**
	 * ドロップされたものを受け取るか判断 (ファイルのときだけ受け取る)
	 */
	@Override
	public boolean canImport(TransferSupport support) {
		if (!support.isDrop()) {
			// ドロップ操作でない場合は受け取らない
			return false;
		}else if (!support.isDataFlavorSupported(DataFlavor.javaFileListFlavor)) {
			// ドロップされたのがファイルでない場合は受け取らない
			return false;
		}else if(Window.Pack==null){
			return false;
		}
		return true;
	}

	/**
	 * ドロップされたファイルを受け取る
	 */
	@Override
	public boolean importData(TransferSupport support) {
		// 受け取っていいものか確認する
		if (!canImport(support)) {
			return false;
		}

		// ドロップ処理
		Transferable t = support.getTransferable();
		try {
			// ファイルを受け取る
			@SuppressWarnings("unchecked")
			List<File> files = (List<File>) t.getTransferData(DataFlavor.javaFileListFlavor);
			for (File file : files) {
				if (file.getName().endsWith(".json")) {
					if(Mode== GUNS){
						PackIO.inportGun(file);
					}else if(Mode== MAGAZINES){
						PackIO.inportMagazine(file);
					}
				}else if (file.getName().endsWith(".png")||file.getName().endsWith(".bmp")||file.getName().endsWith(".jpg")) {
					if(Mode== ICONS){
						PackIO.inportIcon(file);
					}else if(Mode== SCOPE){
						PackIO.inportScope(file);
					}
				}else if (file.getName().endsWith(".ogg")) {
					if(Mode== SOUNDS){
						PackIO.inportSound(file);
					}
				}
			}
		} catch (UnsupportedFlavorException | IOException e) {
			e.printStackTrace();
		}
		return true;
	}
}
