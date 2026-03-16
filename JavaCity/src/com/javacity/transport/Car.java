/**
 * 
 */
package com.javacity.transport;

/**
 * 
 */
public class Car extends Vehicle {
	@Override
    public void move() {
        speed = 80;
        System.out.println("Driving at " + speed + " km/h");
    }

    @Override
    public void soundHorn() {
        System.out.println("Beep Beep");
    }
}
