public class Bus extends Vehicle
{
	private int maxCapacity;
	InfoV1 ghs = new InfoV1();
	public Bus(String model,int capacity)
	{
		super("bus",model);
		maxCapacity = capacity;
		
	}
	public int getMaxCapacity() {
		return maxCapacity;
	}
	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}
	@Override
	public String[] info() {
		return this._infoRetrieval();
		
	}
	protected String[] _infoRetrieval() {
		// TODO Auto-generated method stub
		return ghs.busData(this);
	}
	

}
