package javaprograms;
import java.io.*;
import java.util.*;
public class Fileoperations {

	public static void main(String[] args) {
		try {
		File myfile1 = new File("filef3.txt");
		if(myfile1.createNewFile())
		{
			System.out.println(myfile1.getName()+ " file created");
			
		}else
		{
			System.out.println("File already exists");
		}
		} catch(IOException e)
		{
			System.out.println("Error occurred");
			e.printStackTrace();
		}
		try
		{
			FileWriter mywrite=new FileWriter("filef3.txt");
			mywrite.write("This is the content of this file");
			mywrite.close();
		} catch(IOException e1)
		{
			System.out.println("Error occurred");
			e1.printStackTrace();
		}
		
		

	}

}
