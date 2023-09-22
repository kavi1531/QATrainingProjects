package javaprograms;
import java.util.*;


import java.io.*;

public class Filereadandprint {

	public static void main(String[] args) {
		try {
			File myob = new File("filef3.txt");
			Scanner myread= new Scanner(myob);
			while(myread.hasNextLine())
			{
				String data=myread.nextLine();
				System.out.println(data);
			}
			myread.close();
			} catch(FileNotFoundException e2)
			{
				System.out.println("Error occurred");
				e2.printStackTrace();
			}

	}

}
