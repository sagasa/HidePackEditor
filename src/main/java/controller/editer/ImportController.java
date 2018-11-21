package controller.editer;

import java.lang.reflect.Executable;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

import editer.HasDisplayName;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SplitPane;

public class ImportController {

	public ListView<ImportEntry> gunList;
	public ListView<ImportEntry> magazineList;


	public void Import() {

	}

	private static class ImportEntry implements HasDisplayName{
		Runnable doImport;
		boolean use;

		/**インポートを実行 useがtrueなら実行*/
		public boolean doImport() {
			if(use) {
				doImport.run();
			}
			return use;
		}

		@Override
		public String getDisplayName() {
			return null;
		}
	}
}
