/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.interfaces.staticmethods.Inheritance;

/**
 *
 * @author andre
 */
public class InterfaceInheritanceExample {
    
    public static void execute() {
        
    }
    
}


class SuperCatFish implements Swimmable {

    @Override
    public void dig() {
        System.out.println("diggin diggin...");
    }

    @Override
    public void swim() {
        System.out.println("swim swam swum");
    }

    @Override
    public void fly() {
        System.out.println("flyeeeee");
    }
    
}

interface Swimmable extends Flyable, Diggable {
    void swim();
}

interface Flyable {
    void fly();
}

interface Diggable {
    void dig();
}