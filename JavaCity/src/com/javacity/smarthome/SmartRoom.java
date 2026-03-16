/**
 * 
 */
package com.javacity.smarthome;

/**
 * 
 */
public class SmartRoom {
	private LightBulb roomLight;
    private Speaker speaker;

    public SmartRoom() {
        roomLight = new LightBulb();
        speaker = new Speaker();
    }

    public void pressWallSwitch() {
        roomLight.toggle();
    }

    public void partyMode() {

        roomLight.toggle();
        speaker.playMusic();

    }
}
