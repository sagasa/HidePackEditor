package model;

public interface IBone {
	public void update();

	void setPivot(float x, float y, float z);

	void setRotate(float yaw, float pitch);

	void setTranslate(float x, float y, float z);

	void setScale(float x, float y, float z);
}
