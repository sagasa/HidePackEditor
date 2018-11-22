package controller.editer;

import editer.HasDisplayName;
import javafx.scene.control.ListView;

public class ImportController {

	public ListView<ImportEntry> gunList;
	public ListView<ImportEntry> magazineList;


	public void Import() {
		gunList.getItems().forEach(entry->entry.doImport());
		magazineList.getItems().forEach(entry->entry.doImport());

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
