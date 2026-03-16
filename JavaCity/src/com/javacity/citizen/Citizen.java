package com.javacity.citizen;

/**
 * 
 */
public class Citizen {
	
	private String name;
    private int age;
    private int voterID;
    private String password;

    private static int citizenCount = 1;

    public Citizen(String name, int age, String password) {
        this.name = name;
        setAge(age);
        this.password = password;
        this.voterID = citizenCount++;
    }

    public void setAge(int newAge) {
        if(newAge < 0)
            System.out.println("Invalid age");
        else
            age = newAge;
    }

    public void changePassword(String oldPass, String newPass) {
        if(password.equals(oldPass)) {
            password = newPass;
            System.out.println("Password changed successfully");
        } else {
            System.out.println("Incorrect password");
        }
    }

    public void display() {
        System.out.println("Name: " + name + " Age: " + age + " ID: " + voterID);
    }
    
}
