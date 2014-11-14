import java.io.FileWriter;


public class BusStatement extends StatementWrapper
{
	private static final BusStatement singletonInstance = new BusStatement();
	private static StatementWrapper successor;
	
	private BusStatement()
	{
		this.setSuccessor(successor);
	}
	
	public static BusStatement getSingletonInstance(StatementWrapper s)
	{
		successor = s;
		return singletonInstance;
	}
	
	@Override
	public void generateStatement(Rental r)
	{
		if(canGenerate(r,"bus"))
		{
			try
			{
				FileWriter writer = new FileWriter(r.getOwner() + "Statement.txt",false);
				writer.append("This is your Bus Rental Statement"+System.lineSeparator());
				writer.append(r.getOwner()+"\'s Bus Rental" + System.lineSeparator());
				writer.append("Vehicle type: " + r.getType()+System.lineSeparator());
				writer.append("Rental Duration: " + r.getDaysRequested() + " days" + System.lineSeparator());
				writer.append("Cost Per Day: " + r.getCostPerDay() + System.lineSeparator());
				writer.append("Total Paid: " + (r.getCostPerDay()*r.getDaysRequested()) + System.lineSeparator());
				writer.append("We hope you enjoyed driving our " + r.getModel() +" Bus!"+ System.lineSeparator());
				writer.close();
			}
			catch(Exception e)
			{
				System.out.println("Failed to make Bus Statement");
			}
		}
		else{
			super.generateStatement(r);
		}
	}
}
