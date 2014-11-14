
public class StatementWrapper implements Statement {

	private StatementWrapper successor;
	
	StatementWrapper getSuccessor()
	{
		return successor;
	}
	
	void setSuccessor(StatementWrapper successor) {
		this.successor = successor;
		}
	
	protected Boolean canGenerate(Rental r,String test)
	{
		if(r.getType().equalsIgnoreCase(test))
			return true;
		else
			return false;
	}
	
	public void generateStatement(Rental r) {
		System.out.println("Your Statement is being generated");
		if ( getSuccessor() != null ){
			if(r.getType().equalsIgnoreCase("car"))
			{
				CarStatement c = CarStatement.getSingletonInstance(this);
				c.generateStatement(r);
			}
			if(r.getType().equalsIgnoreCase("bike"))
			{
				BikeStatement b = BikeStatement.getSingletonInstance(this);
				b.generateStatement(r);
			}
			if(r.getType().equalsIgnoreCase("bus"))
			{
				BusStatement b = BusStatement.getSingletonInstance(this);
				b.generateStatement(r);
			}
			else
			{
				BasicStatement b = BasicStatement.getSingletonInstance();
				b.generateStatement(r);
			}
		}

	}

}
