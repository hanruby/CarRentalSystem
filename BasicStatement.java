import java.io.FileWriter;


public class BasicStatement implements Statement {

	@Override
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
