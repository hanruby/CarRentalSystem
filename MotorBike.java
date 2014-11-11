public class MotorBike extends Vehicle
{
	private int maxSpeed;
	public MotorBike(double cost,String model, int topSpeed)
	{
		super("bike", cost, model);
		setMaxSpeed(topSpeed);
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

}
