package com.srkr.assignments;

public abstract class Smartwatch {
	String model;

	Smartwatch(String model) {
		this.model = model;
	}

	abstract void showHealthStatus();
}

class Boat extends Smartwatch implements FiveG{
	boolean music;

	Boat(String model, boolean music) {
		super(model);
		this.music = music;
	}

	@Override
	void showHealthStatus() {
		System.out.println("Health Status OK");
	}

	@Override
	public void enable5G() {
		System.out.println("5G Powered");
	}
}
