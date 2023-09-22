package javaprograms;
import java.util.HashMap;

public class Hashmapcountry {

	public static void main(String[] args) {
		HashMap<String,String> countrycity=new HashMap<String,String>();
		countrycity.put("Delhi","India");
		countrycity.put("Washington Dc","US");
		countrycity.put("Beijing","China");
		countrycity.put("tokyo","japan");
		countrycity.put("london","England");
		
		for(String i :countrycity.keySet())
		{
			System.out.println(i);
		}
	}

}
