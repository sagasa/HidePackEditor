package types.base;

import java.util.Arrays;
import java.util.stream.Collectors;

import editer.DataEntityInterface;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public enum GunFireMode {
	SEMIAUTO, FULLAUTO, MINIGUN, BURST;
	public static GunFireMode getFireMode(String s) {
		switch (s) {
		case "fullauto":
			return FULLAUTO;
		case "semiauto":
			return SEMIAUTO;
		case "minigun":
			return MINIGUN;
		case "burst":
			return BURST;
		}
		return SEMIAUTO;
	}

	public static String getFireMode(GunFireMode mode) {
		switch (mode) {
		case BURST:
			return "burst";
		case FULLAUTO:
			return "fullauto";
		case MINIGUN:
			return "minigun";
		case SEMIAUTO:
			return "semiauto";
		}
		return "semiauto";
	}

	@Override
	public String toString() {
		return getFireMode(this);
	}

	/**エディタ用*/
	public static ObservableList<DataEntityInterface> getList() {
		return FXCollections.observableList(Arrays.asList(values()).stream().map(fire -> new DataEntityInterface() {
			@Override
			public long getPackUID() {
				return 0;
			}

			@Override
			public String getDisplayName() {
				return fire.toString();
			}
		}).collect(Collectors.toList()));
	}
}