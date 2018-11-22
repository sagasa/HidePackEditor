package controller.editer;

import java.util.ArrayList;
import java.util.List;

import editer.HasDisplayName;
import editer.HidePack;
import io.PackCash;
import javafx.scene.control.ListView;
import resources.Image;
import resources.Sound;

public class ImportController {

	public ListView<ImportEntry> gunList;
	public ListView<ImportEntry> magazineList;

	public ListView<ImportEntry> iconList;
	public ListView<ImportEntry> scopeList;
	public ListView<ImportEntry> soundList;

	public void setPack(PackCash pack) {
		pack.GunList.forEach(data->{
			gunList.getItems().add(new ImportEntry(new Runnable() {
				@Override
				public void run() {
					HidePack.GunList.add(data);
				}
			}));
		});
	}

	public void Import() {
		gunList.getItems().forEach(entry -> entry.doImport());
		magazineList.getItems().forEach(entry -> entry.doImport());

	}

	private static class ImportEntry implements HasDisplayName {
		Runnable doImport;
		boolean use;

		public ImportEntry(Runnable action) {
			doImport = action;
		}

		/** インポートを実行 useがtrueなら実行 */
		public boolean doImport() {
			if (use) {
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
