import java.io.FileWriter;


public class CarStatement extends StatementWrapper
{
	@Override
	public void generateStatement(Rental r)
	{
		//super.generateStatement(r); 
		try
		{
			FileWriter writer = new FileWriter(r.getOwner() + "Statement.txt",false);
			writer.append("This is your Car Rental Statement"+System.lineSeparator());
			writer.append(r.getOwner()+"\'s Car Rental" + System.lineSeparator());
			writer.append("Vehicle type: " + r.getType()+System.lineSeparator());
			writer.append("Rental Duration: " + r.getDaysRequested() + " days" + System.lineSeparator());
			writer.append("Cost Per Day: " + r.getCostPerDay() + System.lineSeparator());
			writer.append("Total Paid: " + (r.getCostPerDay()*r.getDaysRequested()) + System.lineSeparator());
			writer.append("We hope you enjoyed driving our " + r.getModel() + System.lineSeparator());
			writer.close();
		}
		catch(Exception e)
		{
			System.out.println("Failed to make Car Statement");
		}
		
	}
}
