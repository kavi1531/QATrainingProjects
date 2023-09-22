package Arrays;

public class printallarrayvalues {

	public static void main(String[] args) {
		String[] fruits= {"Apple","Banana","Cherry","Durian"};
		for(int i=0;i<4;i++)
		{
			System.out.println(fruits[i]);
		}
		//for-each loop
		int[] nums= {3,6,9,12,15};
		for(int j : nums)
		{
			System.out.println(j);
		}

	}

}
