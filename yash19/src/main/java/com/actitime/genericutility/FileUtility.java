package com.actitime.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {

	public String readDataFromFile(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./data/commondataactitime.property");
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}
}
