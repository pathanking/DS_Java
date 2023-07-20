package com.srkr.assignments;

public class SmartDevicesTest {
	public static void main(String[] args) {
		Smartphone smartphone = new OnePlus("Reno", 8, true);
		smartphone.call();
		
		
		Smartwatch smartwatch = new Boat("Retro", true);
		smartwatch.showHealthStatus();
	}
}
