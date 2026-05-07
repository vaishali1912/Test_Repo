package IO_Filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Append_file {

	public static void main(String[] args) throws IOException {
		// create file
//				File f1=new File("Append.txt");
//				f1.createNewFile();
				FileWriter wt=new FileWriter("Text.txt",true);
				wt.write("\nThis is appended text");
				wt.close();
				
	}

}
