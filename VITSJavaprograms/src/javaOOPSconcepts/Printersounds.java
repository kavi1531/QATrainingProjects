package javaOOPSconcepts;

abstract class Printersounds {
public abstract void printervoice();
public void printerror()
{
	System.out.println(" Printer error: beepbeep");
}
}

class Printeron extends Printersounds
{
	public void printervoice()
	{
		System.out.println("Printer is on: on on on");
	}
}
