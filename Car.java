
public class Car extends Vehicle
{
	InfoV1 gh = new InfoV1();
	public Car(String model)
	{
		super("car",model);
	}
	@Override
	public String[] info() {

		return this._infoRetrieval();
	}
	
	protected String[] _infoRetrieval()
	{
		return gh.carData(this);
	}

}
