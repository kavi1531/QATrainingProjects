
public class logicaloperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1,b=10,c=100;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("c: "+c);
		if(a<b && a<c)
		{
			System.out.println("a is smaller of all 3");
		}
        if(b>a || b>c)
        {
        	System.out.println("b is between a and c");
        }
        System.out.println("A is not greater than b: "+ (!(a>b)));
	}

}
