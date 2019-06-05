package types.base;

import java.io.Serializable;

import javafx.beans.property.Property;
import types.Info;

public interface IEditData extends Serializable, Cloneable {
	public abstract Class<? extends IEditData> getType();

	public abstract Property<?> getProperty(String path);

	public abstract Info getInfo();
}
