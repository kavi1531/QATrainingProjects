
public class assignmentoperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=45,y=50;
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		x+=10;
		System.out.println("x after adding 10: "+x);
		System.out.println("x after multiplied by 2: "+(x*=2));
		System.out.println("x after divided by 11: "+(x/=11));
		x=y; //assigning y value to x
		System.out.println("x after assigning y: "+x);

	}

}
