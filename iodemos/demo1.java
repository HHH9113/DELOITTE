package iodemos;

import java.io.File;
import java.io.IOException;

public class demo1 {

	public static void main(String[] args) throws IOException {
		File f=new File("E:\\newyear.txt");
		
		if(f.exists())
		{
			System.out.println("file is there");
		}
		else
		{
			f.createNewFile();
			System.out.println("file created");
		}
		
		System.out.println("done");
	}
	
	
}
