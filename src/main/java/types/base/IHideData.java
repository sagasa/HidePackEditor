package types.base;

/** HideData型の許可される値はFloat,Integer,String,String[],DataBase */
public interface IHideData {
	Object getDefault();

	Info getInfo();

	@SuppressWarnings("rawtypes")
	Class<? extends DataBase> getContainer();

	// Class<? extends Enum<?>> getEnum();
}