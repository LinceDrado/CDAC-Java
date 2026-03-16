package com.javacity.main;

import com.javacity.animal.*;
import com.javacity.citizen.*;
import com.javacity.power.*;
import com.javacity.smarthome.*;
import com.javacity.transport.*;
/**
 * this is the single main class with main function for the entire project Java City
 */
public class CityControllerMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---- Citizen System ----");
        Citizen c1 = new Citizen("Rahul",25,"1234");
        c1.display();
        c1.changePassword("1234","abcd");

        System.out.println("\n---- Transport System ----");
        Bicycle b = new Bicycle();
        b.move();
        b.soundHorn();

        Car car = new Car();
        car.move();
        car.soundHorn();

        System.out.println("\n---- Power System ----");
        ShoppingMall mall = new ShoppingMall("MG Road");
        mall.consumeEnergy(1500);

        TinyHouse house = new TinyHouse();
        house.consumeEnergy(200);

        System.out.println("\n---- Animal Shelter ----");

        Animal[] animals = new Animal[4];

        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Dog();
        animals[3] = new Cat();

        for(Animal a : animals) {
            a.makeSound();
        }

        System.out.println("\n---- Smart Home ----");

        SmartRoom room = new SmartRoom();
        room.pressWallSwitch();
        room.partyMode();
	}

}
