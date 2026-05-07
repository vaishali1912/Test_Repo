package IO_Filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Delete_file {

	public static void main(String[] args) throws IOException {
		File file=new File("Test.txt");
		if(file.createNewFile())
		{
			System.out.println("File created successfully");
		}
		else
		{
			System.out.println("Unable to create file");
		}
		 FileWriter wr=new FileWriter("Test.txt");
	        wr.write("Let's learn JAva Prgraming\n, Selenium Automation\n");// override  line
	       // wr.write("");
	        wr.close();
	        BufferedReader br=new BufferedReader(new FileReader("Text.txt"));
	        String l1;
	        while((l1=br.readLine())!=null)
	        {
	        	System.out.println(l1);
	        }
	        br.close();
		
		if(file.delete())
		{
			System.out.println("File deleted");
		}
		else
		{
			System.out.println("Failed to delete");
		}
		if(file.exists())
		{
			System.out.println(file);
		}
		else
			System.out.println("File not found");

	}

}
// write a program to count number of lines
// ............ replace word
// ............ count number of words from para
//............ count number of characters from line
// ............copy text from one file to another
//............return largest word from line
// ............combine two files(join)
//...........read file from last(reverse reading)
