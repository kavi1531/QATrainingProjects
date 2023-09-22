package javaprograms;


public class Randomnumgen {

	public static void main(String[] args) {
		int minlimit = 1, maxlimit =100;
		int rand =(int) (Math.random()*(maxlimit-minlimit+1)+minlimit);
        System.out.println(rand);
	}

}
