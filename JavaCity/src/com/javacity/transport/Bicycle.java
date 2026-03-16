/**
 * 
 */
package com.javacity.transport;

/**
 * 
 */
public class Bicycle extends Vehicle {
	@Override
    public void move() {
        speed = 20;
        System.out.println("Pedaling at " + speed + " km/h");
    }
}
