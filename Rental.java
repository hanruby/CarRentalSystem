
public class Rental{
	DataManagement d = new DataManagement();
	private int daysRequested;
	private String model;
	private double costPerDay;
	private String type;
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getEML() {
		return EML;
	}
	public void setEML(String eML) {
		EML = eML;
	}
	private String owner;
	private String EML;
	public Rental(String _owner,String _EML,int days,String _model,double cost,String _type)
	{
		owner = _owner;
		EML = _EML;
		daysRequested = days;
		model = _model;
		costPerDay = cost;
		type = _type;
	}
	public int getDaysRequested() {
		return daysRequested;
	}
	public void setDaysRequested(int daysRequested) {
		this.daysRequested = daysRequested;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void saveRental()
	{
		d.saveRental(this.getOwner(), this.getEML(), this.getDaysRequested(),this.getModel(),this.getCostPerDay(),this.getType());
	}

}
