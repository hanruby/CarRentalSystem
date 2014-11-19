public class InfoV1 extends VehicleData {
	ShortInfo s = new ShortInfo();

	@Override
	public String[] carData(Vehicle v) {
		// TODO Auto-generated method stub
		return s.details(v);
	}

	@Override
	public String[] busData(Vehicle v) {
		// TODO Auto-generated method stub
		return s.details(v);
	}

	@Override
	public String[] bikeData(Vehicle v) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}

