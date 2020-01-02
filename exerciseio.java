package iodemos;

import java.io.File;
import java.io.IOException;

public class exerciseio {

	static void RecursivePrint(File[] arr, int level) 
	{ 
		// for-each loop for main directory files 
		for (File f : arr) 
		{ 
			// tabs for internal levels 
			for (int i = 0; i < level; i++) 
				System.out.print("\t"); 
			
			if(f.isFile()) 
				System.out.println(f.getName()); 
			
			else if(f.isDirectory()) 
			{ 
				System.out.println("[" + f.getName() + "]"); 
			
				// recursion for sub-directories 
				RecursivePrint(f.listFiles(), level + 1); 
			} 
		} 
	} 
	
	public static void main(String[] args) throws IOException {
		
	
		File file=new File("E:\\deloitte\\batch");

		

		File f=new File("E:\\deloitte\\batch\\batchmates.txt");

		// Provide full path for directory(change accordingly) 
		String maindirpath = "E:\\deloitte"; 
				
		// File object 
		File maindir = new File(maindirpath); 
	
	if(file.exists())
	{
		System.out.println("folder is there");
		if(f.exists())
		{System.out.println("file is there");
}else
{
f.createNewFile()	;
System.out.println("file is created");


}

	
	}
	else
	{
		file.mkdirs();
		System.out.println("folder created");
	
		if(f.exists())
		{System.out.println("file is there");
}else
{
f.createNewFile()	;
System.out.println("file is created");


}

	
	}
	
	
	if(maindir.exists() && maindir.isDirectory()) 
	{ 
		// array for files and sub-directories 
		// of directory pointed by maindir 
		File arr[] = maindir.listFiles(); 
		
		System.out.println("**********************************************"); 
		System.out.println("Files from main directory : " + maindir); 
		System.out.println("**********************************************"); 
		
		// Calling recursive method 
		RecursivePrint(arr, 0); 
} 

	
	System.out.println("done");
}
}