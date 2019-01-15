package helper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import editer.HidePack;

public class PackChecker {
	public static void checkAll() {

	}

	public static List<NameD> checkNames() {
		Map<String, List<String>> map = new HashMap<>();
		HidePack.GunList.forEach(data -> {
			if (!map.containsKey(data.ITEM_SHORTNAME))
				map.put(data.ITEM_SHORTNAME, new ArrayList<>());
			map.get(data.ITEM_SHORTNAME).add("Gun " + data.ITEM_SHORTNAME);
		});
		HidePack.MagazineList.forEach(data -> {
			if (!map.containsKey(data.ITEM_SHORTNAME))
				map.put(data.ITEM_SHORTNAME, new ArrayList<>());
			map.get(data.ITEM_SHORTNAME).add("Gun " + data.ITEM_SHORTNAME);
		});
		return null;
	}

	public static abstract class PackError {
		public abstract String getName();
	}

	public static class NameD extends PackError {
		public List<String> names = new ArrayList<>();

		@Override
		public String getName() {
			return "shortName not allow : [";
		}

	}
}
