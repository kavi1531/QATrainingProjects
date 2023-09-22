package javaOOPSconcepts;

interface Lampcolors {
public void  lampon();
public void lampoff();

}
 class Studylamp implements Lampcolors
 {
	 public void lampon()
	 {
		 System.out.println("Lamp on: White color");
	 }
	 public void lampoff()
	 {
		 System.out.println("Lamp off: No color");
	 }
 }
 
