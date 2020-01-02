package iodemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class exercixe2 {

	public static void main(String[] args) throws Exception {

		System.out.println("Enter filename here : ");

		String sWhatever, rfile;

		Scanner scanIn = new Scanner(System.in);
		sWhatever = scanIn.nextLine();

		scanIn.close();
		System.out.println(sWhatever);

		FileInputStream Fread = new FileInputStream(sWhatever);

		File f = new File(sWhatever);

		if (f.exists()) {
			System.out.println("file is there");

			Scanner scanr = new Scanner(System.in);
			rfile = scanr.nextLine();

			scanr.close();
			System.out.println(rfile);

			FileOutputStream Fwrite = new FileOutputStream(rfile);
			System.out.println("File is Copied");
			int c;
			while ((c = Fread.read()) != -1)
				Fwrite.write((char) c);
			Fread.close();
			Fwr ite.close();
		}
		
else
{}

	}
}