package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader 
{
	private Properties prop;
	private String propertyPath = "configs//Configurations.properties";
	
	public ConfigFileReader()
	{
		BufferedReader reader;
		try {
			reader=new BufferedReader(new FileReader(propertyPath));
			prop=new Properties();
			try {
				prop.load(reader);
				reader.close();
			}catch(IOException e)
			{
				e.printStackTrace();
			}
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
			throw new RuntimeException("Properties file not found");
		}
	}
	
	public String getDriverPath()
	{
		String driverPath=prop.getProperty("driverPath");
		if(driverPath!=null) return driverPath;
		else throw new RuntimeException("driver path not found");
		
	}
	
	public String getAppUrl()
	{
		String appUrl = prop.getProperty("url");
		if(appUrl!=null) return appUrl;
		else throw new RuntimeException("Url propertt is not found");
	}
	
	public String getUsename()
	{
		String uName = prop.getProperty("userName");
		if(uName!=null) return uName;
		else throw new RuntimeException("uName propertt is not found");
	}
	
	public String getPassword()
	{
		String pass = prop.getProperty("password");
		if(pass!=null) return pass;
		else throw new RuntimeException("Password propertt is not found");
	}

}
