package com.composition;

public class Main {
	public static void main(String[] args) {
		Dimensions dimensions= new Dimensions (20,20,5);
		Case theCase= new Case("220B","Dell","240V", dimensions);
		Monitor theMonitor= new Monitor("27inch beast", "Acer",27, new Resolution(2540,1440));
		Motherboard theMotherBoard= new Motherboard("83-200", "Asus", 4, 6, "v2.44");
		
		PC thePC = new PC(theCase,theMonitor,theMotherBoard);
		
		thePC.powerUp();
			}
}
