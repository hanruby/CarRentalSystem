import java.io.FileWriter;


public class BikeStatement extends StatementWrapper
{
	private static final BikeStatement singletonInstance = new BikeStatement();
	private static StatementWrapper successor;
	
	private BikeStatement()
	{
		this.setSuccessor(successor);
	}
	
	public static BikeStatement getSingletonInstance(StatementWrapper s)
	{
		successor = s;
		return singletonInstance;
	}
	@Override
	public void generateStatement(Rental r)
	{
		if(canGenerate(r,"car"))
		{
			try
			{
				FileWriter writer = new FileWriter(r.getOwner() + "Statement.txt",false);
				writer.append("This is your Bike Rental Statement"+System.lineSeparator());
				writer.append(r.getOwner()+"\'s Bike Rental" + System.lineSeparator());
				writer.append("Vehicle type: " + r.getType()+System.lineSeparator());
				writer.append("Rental Duration: " + r.getDaysRequested() + " days" + System.lineSeparator());
				writer.append("Cost Per Day: " + r.getCostPerDay() + System.lineSeparator());
				writer.append("Total Paid: " + (r.getCostPerDay()*r.getDaysRequested()) + System.lineSeparator());
				writer.append("We hope you enjoyed driving our " + r.getModel() + System.lineSeparator());
				writer.close();
			}
			catch(Exception e)
			{
				System.out.print("Statement generation Failed");
			}
		}
		else{
			super.generateStatement(r);
		}
	}
	
}
