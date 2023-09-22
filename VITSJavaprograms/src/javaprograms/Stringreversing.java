package javaprograms;

public class Stringreversing {

	public static void main(String[] args) {
		String str = "Aloha", revstr="";
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			revstr=ch+revstr;
		}
		System.out.println("Reversed string: "+revstr);
	}

}
