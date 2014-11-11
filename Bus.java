public class Bus extends Vehicle
{
	private int maxCapacity;
	public Bus(double cost,String model,int capacity)
	{
		super("bus",cost,model);
		maxCapacity = capacity;
		
	}
	public int getMaxCapacity() {
		return maxCapacity;
	}
	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}
	

}
