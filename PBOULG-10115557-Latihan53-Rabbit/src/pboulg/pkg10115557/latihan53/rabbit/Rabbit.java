/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulg.pkg10115557.latihan53.rabbit;

/**
 *
 * @author RyanJuan
 */
public class Rabbit extends Animal {
    private String color;
    private String name;
    
    public Rabbit(String name, boolean veg, String food, int legs, String color) {
        this.name = name;
        this.color = color;
        this.vegetarian = veg;
        this.eats = food;
        this.noOfLegs = legs;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}
