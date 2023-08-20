package com.neotech.lesson33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Homework {
	/*
	 * Create a PROPERTY file to store following configurations:
        browser=
        url=
        username=
        password=
	 */

	public static void main(String[] args) throws IOException {
		//create a path for file
		String path="/Users/dogukandoganci/eclipse-workspace/neotechAcademy/configs/homework.txt";
				
		
		
		//to avoid file location issues
		String projectPath=System.getProperty("user.dir");
		System.out.println(projectPath);
		
		String fullPath =projectPath+ "/configs/homework.txt";
		System.out.println(fullPath);
		
		//create an object to read the file (FileInputSystem)
		FileInputStream fis=new FileInputStream(fullPath);
		
		//load the data from the stream
		Properties p=new Properties();
		p.load(fis);
		
		//what is inside the project object?
		System.out.println(p);
		
		//get parameters individually
		String browser=p.getProperty("browser");
		System.out.println(browser);
		
		browser=p.getProperty("BROWSER");
		System.out.println(browser);
		
		//how do i get all the values
		Set<Object> keys=p.keySet();
		
		for(Object o: keys) {
			System.out.println(o+" ==> "+ p.get(o));
		}
		
		
		
	}

}
