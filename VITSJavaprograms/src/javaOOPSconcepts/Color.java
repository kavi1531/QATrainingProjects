package javaOOPSconcepts;

 class Color {
public void whichobj()
{
	System.out.println("Every Object has a color");
}
}
 class Tree extends Color{
	 public void whichobj()
	 {
		 System.out.println("Tree is Green");
	 }
 }

 class Water extends Color{
	 public void whichobj()
	 {
		 System.out.println("Water is Blue");
	 }
 }
 class Hair extends Color{
	 public void whichobj()
	 {
		 System.out.println("Hair is Both black and/or White");
	 }
 }