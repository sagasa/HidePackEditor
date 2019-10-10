package types.model;

public interface IBone extends IRenderProperty {
	abstract public void update();

	abstract void loadIdentity();

	abstract void setPivot(float x, float y, float z);

	abstract void setRotate(float yaw, float pitch);

	abstract void setTranslate(float x, float y, float z);

	abstract void setScale(float x, float y, float z);

	abstract void setVisible(boolean visible);
}
