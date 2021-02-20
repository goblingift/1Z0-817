/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.interfaces.staticmethods.Inheritance;

/**
 *
 * @author andre
 */
public class InterfaceInheritanceDefaultMethodExample {
    
    public static void execute() {
        
        Pupil p = new Pupil() {};
        p.draw();
    }
}

interface Teacher {
    public default void startSchool() {
        System.out.println("School starts now!");
    }
}

interface Student extends Teacher {
    public default void learn() {
        Teacher.super.startSchool();
    }
}

interface Pupil extends Student {
    public default void draw() {
        // Teacher.super.startSchool(); - WONT COMPILE
        Student.super.learn();
    }
}

