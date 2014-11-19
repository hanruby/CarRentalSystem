
public abstract class Vehicle
{
	private String type;
	private double costPerDay;
	private String model;
	protected VehicleData vd;
	protected InfoV1 vf;
	abstract public String[] info();
	public Vehicle(String theType, String theModel)
	{
		type = theType;
		model = theModel;
		if(type.equalsIgnoreCase("car"))
		{
			if(model.equalsIgnoreCase("BMW"))
			{
				costPerDay = 50.00;
			}
			else if(model.equalsIgnoreCase("Audi"))
			{
				costPerDay = 45.00;
			}
			else if(model.equalsIgnoreCase("Mercedes"))
			{
				costPerDay = 60.00;
			}
			else
			{
				costPerDay = 0.00;
			}
		}
		else if(type.equalsIgnoreCase("bus"))
		{
			if(model.equalsIgnoreCase("minibus"))
			{
				costPerDay = 70.0;
			}
			else if(model.equalsIgnoreCase("Volkswagen"))
			{
				costPerDay = 90.0;
			}
			else if(model.equalsIgnoreCase("Renault"))
			{
				costPerDay = 100.0;
			}
			else
			{
				costPerDay = 0.00;
			}
		}
		else if(type.equalsIgnoreCase("bike"))
		{
			if(model.equalsIgnoreCase("suzuki"))
			{
				costPerDay = 100.0;
			}
			else if(model.equalsIgnoreCase("honda"))
			{
				costPerDay = 90.0;
			}
			else if(model.equalsIgnoreCase("toyota"))
			{
				costPerDay = 100.0;
			}
			else
			{
				costPerDay = 0.00;
			}
		}
		
		
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	protected String [] getCarDetails()
	{
		return vd.carData(this);
	}
	protected String [] getBikeDetails(Vehicle v)
	{
		return vd.bikeData(v);
	}
	protected String [] getBusDetails()
	{
		return vd.busData(this);
	}
}
