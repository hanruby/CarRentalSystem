
public class LongInfo
{
	public LongInfo()
	{
	}
	public String[] details(Vehicle v)
	{
		String [] result = new String[6];
		if(v.getType().equalsIgnoreCase("car"))
		{
			if(v.getModel().equalsIgnoreCase("BMW"))
			{
				result[0] = "This is a luxury BMW available at all times.";
				result[1] = "More information is available upon request.";
				result[2] = v.getModel();
				result[3] = v.getType();
				result[4] = String.valueOf(v.getCostPerDay());
				result[5] = " ";
			}
			else if(v.getModel().equalsIgnoreCase("Mercedes"))
			{
				result[0] = "This is a luxury Mercedes available at all times.";
				result[1] = "More information is available upon request.";
				result[2] = v.getModel();
				result[3] = v.getType();
				result[4] = String.valueOf(v.getCostPerDay());
				result[5] = " ";
			}
			else if(v.getModel().equalsIgnoreCase("Audi"))
			{
				result[0] = "This is a luxury Audi available at all times.";
				result[1] = "More information is available upon request.";
				result[2] = v.getModel();
				result[3] = v.getType();
				result[4] = String.valueOf(v.getCostPerDay());
				result[5] = " ";
			}
			else
			{
				result[0] = "There has been an internal error";
				result[1] = "More information is available upon request.";
			}
		}
		else if(v.getType().equalsIgnoreCase("bus"))
		{
			if(v.getModel().equalsIgnoreCase("Renault"))
			{
				result[0] = "This is a standard Renault bus available at all times.";
				result[1] = "More information is available upon request.";
				result[2] = v.getModel();
				result[3] = v.getType();
				result[4] = String.valueOf(v.getCostPerDay());
				result[5] = " ";
			}
			else if(v.getModel().equalsIgnoreCase("Volkswagen"))
			{
				result[0] = "This is a luxury VW bus available at all times.";
				result[1] = "More information is available upon request.";
				result[2] = v.getModel();
				result[3] = v.getType();
				result[4] = String.valueOf(v.getCostPerDay());
				result[5] = " ";
			}
			else if(v.getModel().equalsIgnoreCase("minibus"))
			{
				result[0] = "This is a standard minibus available at all times.";
				result[1] = "More information is available upon request.";
				result[2] = v.getModel();
				result[3] = v.getType();
				result[4] = String.valueOf(v.getCostPerDay());
				result[5] = " ";
			}
			else
			{
				result[0] = "There has been an internal error";
				result[1] = "More information is available upon request.";
			}
		}
		else if(v.getType().equalsIgnoreCase("bike"))
		{
			if(v.getModel().equalsIgnoreCase("Honda"))
			{
				result[0] = "This is a standard Honda bike available in summer.";
				result[1] = "More information is available upon request.";
				result[2] = v.getModel();
				result[3] = v.getType();
				result[4] = String.valueOf(v.getCostPerDay());
				result[5] = " ";
			}
			else if(v.getModel().equalsIgnoreCase("suzuki"))
			{
				result[0] = "This is a luxury suzuki sport available in select areas";
				result[1] = "More information is available upon request.";
				result[2] = v.getModel();
				result[3] = v.getType();
				result[4] = String.valueOf(v.getCostPerDay());
				result[5] = " ";
			}
			else if(v.getModel().equalsIgnoreCase("toyota"))
			{
				result[0] = "This is a standard toyota bike available at all times.";
				result[1] = "More information is available upon request.";
				result[2] = v.getModel();
				result[3] = v.getType();
				result[4] = String.valueOf(v.getCostPerDay());
				result[5] = " ";
			}
			else
			{
				result[0] = "There has been an internal error";
				result[1] = "More information is available upon request.";
			}
		}
		return result;
	}
}
