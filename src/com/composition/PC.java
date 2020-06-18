package com.composition;

public class PC {
	private Case theCase;
	private Monitor monitor;
	private Motherboard motherboard;
	public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}
	public void powerUp() {
		//Fancy graphics;
		theCase.pressPowerButton();
		drawLogo();
	}
	private void drawLogo() {
		monitor.drawPixelAt(1200, 50, "yellow");
	}
	
	
	
	
//	public Case getTheCase() {
//		return theCase;
//	}
//	public Monitor getMonitor() {
//		return monitor;
//	}
//	public Motherboard getMotherboard() {
//		return motherboard;
//	}
//	
	

}
