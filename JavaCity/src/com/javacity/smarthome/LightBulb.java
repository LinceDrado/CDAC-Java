/**
 * 
 */
package com.javacity.smarthome;

/**
 * 
 */
public class LightBulb {
	private boolean isOn = false;

    public void toggle() {

        isOn = !isOn;

        if(isOn)
            System.out.println("Light is ON");
        else
            System.out.println("Light is OFF");

    }
}
