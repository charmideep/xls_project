package xls_project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadfileWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream f=new FileInputStream("C:\\testing\\pro.properties");
		Properties pro=new Properties();
		pro.load(f);
	      String browser=pro.getProperty("browser");
	
	      System.out.println(browser);
	      
	      System.out.println(pro.getProperty("url"));
	      System.out.println(pro.getProperty("correctEmail"));
	      pro.setProperty("bug", "jira");
	      System.out.println(pro.getProperty("bug"));
	      
	      FileOutputStream fo=new FileOutputStream("C:\\\\testing\\\\pro.properties");
	      pro.store(fo,"Adding to propeties file");
	      
	      
	}

}
