package iodemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class exercisefile {


		
			    public static void main(String[] args) throws IOException
			    {	
		
			    	    FileInputStream Fread =new FileInputStream("E:\\deloitte\\batch\\batchmates.txt"); 
			              FileOutputStream Fwrite=new FileOutputStream("E:\\deloitte\\batch\\batch.txt") ; 
			              System.out.println("File is Copied"); 
			              int c; 
			              while((c=Fread.read())!=-1) 
			              Fwrite.write((char)c); 
			              Fread.close(); 
			              Fwrite.close();}} 
			
			/*			
			
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
*/

