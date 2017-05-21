package com;

public class Spider extends Animal{
	protected double danger = 2;
	private Spider() {
		
	}
	protected static Spider spider;
	
	public static Spider getSpider() {
		if (spider == null){
			spider = new Spider();
		}
		return spider;
	}
	public double poison(double kg) {
		return Math.random()*danger/kg;
	}

	public double getDanger() {
		return danger;
	}

	public void setDanger(double danger) {
		this.danger = danger;
	}
}
