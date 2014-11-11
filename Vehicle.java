
public class Vehicle
{
	private String type;
	private double costPerDay;
	private String model;
	
	public Vehicle(String theType, double cost, String theModel)
	{
		type = theType;
		costPerDay = cost;
		model = theModel;
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

}
