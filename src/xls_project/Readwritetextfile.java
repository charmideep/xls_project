package xls_project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Readwritetextfile {
	
	public static void main(String[] args) throws IOException
	{
	//create new text file
	File f=new File("C:\\Testing\\temp.txt");
	f.createNewFile();
	
	//write into text file
	FileWriter fw=new FileWriter(f);
	BufferedWriter bw=new BufferedWriter(fw);
	bw.write("this line is ");
	bw.newLine();
	bw.write("chARMI");  // SAvw in java memory
	bw.flush();
	
	//read from text file
	
	FileReader fr=new FileReader(f);
	BufferedReader br=new BufferedReader(fr);
/*	System.out.println(br.readLine());//readone line
	System.out.println(br.readLine());
	System.out.println(br.readLine());*/
	String s;
	int i=0;
	while((s=br.readLine())!=null)
	{
		System.out.println(s);
		i++;
	
		
	}
	}
}
