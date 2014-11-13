
public class StatementWrapper implements Statement {

	@Override
	public void generateStatement(Rental r) {
		System.out.println("Your Statement is being generated");
		if(r.getType().equalsIgnoreCase("car"))
		{
			CarStatement c = new CarStatement();
			c.generateStatement(r);
		}
		if(r.getType().equalsIgnoreCase("bike"))
		{
			BikeStatement b = new BikeStatement();
			b.generateStatement(r);
		}
		if(r.getType().equalsIgnoreCase("bus"))
		{
			BusStatement b = new BusStatement();
			b.generateStatement(r);
		}
		else
		{
			BasicStatement b = new BasicStatement();
			b.generateStatement(r);
		}
		
	}

}
