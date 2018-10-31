package com.ogcg.facade;

public class Car {
	private Battery bat = new Battery();
	private Engine en = new Engine();
	private Piston piston = new Piston();
	private Pump p = new Pump();
	private Radiator rad = new Radiator();
	
	public void start() {
		bat.spark();
		en.start();
		piston.doWhateverPistonsDo();
		p.pump();
		rad.cool();
		System.out.println("Car started");
	}
}
