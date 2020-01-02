package iodemos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readfiledemo {

	
	public static void main(String[] args) throws IOException {
		
		
		
		File f=new File("E:\\deloitte\\batch\\batchmates.txt");
	
	FileReader r= new FileReader(f);
	
	int i=0;
	while((i=r.read())!=-1)
		
	{
		System.out.println((char)i);
		
	}
	r.close();
	}
	
	
	
}
