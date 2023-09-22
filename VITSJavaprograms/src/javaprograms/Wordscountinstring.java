package javaprograms;

public class Wordscountinstring {

	public static void main(String[] args) {
		String str = " this is my silver laptop and it has 10 hours of battery life ";
       int count=0;
       for(int i=0;i<str.length()-1;i++)
       {
    	   if((str.charAt(i)== ' ') && (str.charAt(i+1)!= ' '))
    	   {
    		   count++;
    	   }
       }
       System.out.println("Total number of words in a string: "+count);
	}

}
