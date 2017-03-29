package com.automation.portal.generic.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class GetData {
	
	public static String fromProperties(String fileName, String key)
	{
		String data = null;
		try
		{
			File f = new File ("./appConfig/"+fileName+".properties");
			FileInputStream fis = new FileInputStream(f);
			Properties p = new Properties();
			p.load(fis);
			data = p.getProperty(key);
		}
		catch (Exception e)
		{
			System.out.println("exception in properties :"+e.getMessage());
		}
		
		return data;
	}
}
