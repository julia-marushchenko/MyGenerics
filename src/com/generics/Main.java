// Java program to create objects with generic type

package com.generics;

// Class Box with any data type
class Box<T> {

    T value; // Place holder for any data type

    // Method set
    void set(T value){
        this.value = value;
    }

    // Method get
    T get(){
        return value;
    }
}

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating Box to hold a String
        Box<String> box = new Box<>();
        box.set("String value");
        // Printing value of box
        System.out.println("Value of box: " + box.get());

        // Creating Box to hold an Integer
        Box<Integer> box1 = new Box<>();
        box1.set(17);
        // Printing value of box1
        System.out.println("Value of box1: " + box1.get());

        // Creating Box to hold a Float
        Box<Float> box2 = new Box<>();
        box2.set(18.7f);
        // Printing value of box1
        System.out.println("Value of box2: " + box2.get());
    }
}