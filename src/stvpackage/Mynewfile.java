package stvpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mynewfile {

	public static void main(String[] path) throws FileNotFoundException {
		
		
		String fname = "C:\\Users\\Dell\\Desktop\\Mynewfile.txt";
		File f = new File(fname);
		Scanner scan = new Scanner(f);
		
		while(scan.hasNextLine()) {
			System.out.println(scan.nextLine());
		}
		
		if (f.exists()) {
			System.out.println("file exists");
		}
		else {System.out.println("file doesnt exists");
		
		
		
			
		}
	}

}
