package resources;

import java.io.IOException;

import editor.HidePack;
import io.GltfInfoReader;
import io.GltfInfoReader.GltfException;
import io.ModelInfo;
import io.ObjInfoReader;
import io.PackIO.PackPattern;
import types.PackInfo;

public class Model extends Resource {

	public byte[] data;

	public PackPattern type;
	public ModelInfo info;

	public static Model from(String name, byte[] data, PackPattern pattern) {
		Model model = new Model(name);
		model.data = data;
		model.type = pattern;
		try {
			if (pattern == PackPattern.MODEL_GLB)
				model.info = GltfInfoReader.readInfo(data);
			else if (pattern == PackPattern.MODEL_OBJ)
				model.info = ObjInfoReader.readInfo(data);
		} catch (IOException | GltfException e) {
			e.printStackTrace();
			model.info = new ModelInfo();
		}
		return model;
	}

	public Model(String name) {
		this(name, HidePack.DefaultPack.get());
	}

	public Model(String name, PackInfo pack) {
		super(name, pack);
	}

}
