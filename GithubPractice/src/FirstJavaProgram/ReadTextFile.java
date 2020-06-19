package FirstJavaProgram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {

	public static void main(String[] args) throws IOException
	{
		String TestFile = "D:\\temp1.txt";

		//Reading from file.
		//Create Object of java FileReader and BufferedReader class. 
		FileReader FR = new FileReader(TestFile);
		BufferedReader BR = new BufferedReader(FR);
		String Content = "";
		System.out.println(Content);

		//Loop to read all lines one by one from file and print It.
		while((Content = BR.readLine())!= null){
			System.out.println(Content);
		}
	}



}

