package iodemos;

import java.io.File;
import java.io.IOException;

public class demo2 {
	private int cid;
	private String cname;
	private String caddress;
	
	public static void main(String[] args) throws IOException {
		
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
