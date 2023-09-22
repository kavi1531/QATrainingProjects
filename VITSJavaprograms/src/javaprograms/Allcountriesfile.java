package javaprograms;
import java.io.*;


public class Allcountriesfile {

	public static void main(String[] args) {
		try
		{
		File myfileob = new File("countriesfile.txt");
		if(myfileob.createNewFile())
		{
			System.out.println(myfileob.getName()+ " file created");
			
		}else
		{
			System.out.println("File already exists");
		}
		}catch(IOException e1)
		{
			System.out.println("Error occurred");
			e1.printStackTrace();
		}
		
		
	}

}
