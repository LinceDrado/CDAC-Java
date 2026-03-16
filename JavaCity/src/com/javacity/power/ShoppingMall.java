/**
 * 
 */
package com.javacity.power;

/**
 * 
 */
public class ShoppingMall extends Building implements PowerConsumer {
	public ShoppingMall(String address) {
        super(address);
    }

    public void consumeEnergy(int watts) {

        if(watts > 1000)
            System.out.println("High usage warning!");
        else
            System.out.println("Normal power usage");

    }
}
