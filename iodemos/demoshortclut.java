package iodemos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;

public class demoshortclut {

	public static void main(String[] args) {
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("mohan.txt")));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("sharma.txt")));
		
		
		int i=0;
		
		while((i=bufferedReader.read())!=-1)
		{
			bufferedWriter.write((char)i);
		}
		
		bufferedWriter.close();
		bufferedReader.close();
		
	}
}
