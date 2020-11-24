package com.enetbank.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readconfig {
	Properties prop;

	public Readconfig() {
		File src= new File("./configuraton/Config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			try {
				prop.load(fis);
			} catch (IOException e) {
				System.out.println("Exception is "+ e.getMessage());
			}
		} catch (FileNotFoundException e) {		
			e.printStackTrace();
		}
		
		
	}
	public String getApplicationUrl(){
		String url=prop.getProperty("baseUrl");
		return url;
		
	}
	public String getUsername()
	{
	String usr=prop.getProperty("username");
	return usr;	
	}
	public String getpassword()
	{
	String pwd=prop.getProperty("password");
	return pwd;	
	}
	public String getChromepath()
	{
	String chro=prop.getProperty("Chromepath");
	return chro;	
	}
	
	

}
