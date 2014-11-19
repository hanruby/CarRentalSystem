public class MotorBike extends Vehicle
{
	private int maxSpeed;
	public MotorBike(double cost,String model, int topSpeed)
	{
		super("bike", model);
		maxSpeed=topSpeed;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	@Override
	public String[] info() {
		
		return this._infoRetrieval();
	}
	protected String[] _infoRetrieval()
	{
		return vd.bikeData(this);
	}
}
