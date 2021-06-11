package com.techlab.test;

import com.techlab.model.Bike;
import com.techlab.model.Car;
import com.techlab.model.IMovable;
import com.techlab.model.Truck;

public class MovableTest {

	public static void main(String[] args) {
		IMovable m[] = new IMovable[3];
		m[0] = new Bike();
		m[1] = new Car();
		m[2] = new Truck();
		startRace(m);
	}
	
	public static void startRace(IMovable[] imov) {
		for(int i = 0; i < imov.length; i++) {
			imov[i].move();
		}
		System.out.println("Race Stopped..");
	}

}
