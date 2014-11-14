import java.io.FileWriter;


public class BasicStatement extends StatementWrapper {
	private static final BasicStatement singletonInstance = new BasicStatement();
	
	private BasicStatement()
	{
		
	}
	
	public static BasicStatement getSingletonInstance()
	{
		return singletonInstance;
	}
	
	
	public void generateStatement(Rental r) {
		try
		{
			FileWriter writer = new FileWriter(r.getOwner() + "\'s Basic Statement.txt",false);
			writer.append("This is your Basic Rental Statement"+System.lineSeparator());
			writer.append(r.getOwner()+"\'s Rental" + System.lineSeparator());
			writer.append("Rental Duration: " + r.getDaysRequested() + " days" + System.lineSeparator());
			writer.append("Cost Per Day: " + r.getCostPerDay() + System.lineSeparator());
			writer.append("Total Paid: " + (r.getCostPerDay()*r.getDaysRequested()) + System.lineSeparator());
			writer.close();
		}
		catch(Exception e)
		{
			
		}

	}

}
