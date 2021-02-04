/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.interfaces;

import gift.goblin.interfaces.defaultmethods.SafeLock;
import gift.goblin.interfaces.functionalinterfaces.ReturnAnythingInterface;
import gift.goblin.interfaces.functionalinterfaces.SimpleFunctionalInterface;
import gift.goblin.interfaces.staticmethods.CarWash;
import java.util.function.Predicate;

/**
 *
 * @author andre
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainClass mainClass = new  MainClass();
        
        // default methods
        new SafeLock().doStuff();
        
        // static methods
        new CarWash().startWashProgram();
        
        
        // functional interface
        ReturnAnythingInterface<String> impl = s -> s.toLowerCase();
        String a = mainClass.returner(impl, "AaAaa");
        String b = mainClass.returner((String s) -> s.toLowerCase(), "BbBbb");
        System.out.println(a + b);
        
    }
    
    public String returner(ReturnAnythingInterface<String> interfaceImpl, String text) {
        return interfaceImpl.giveItToMe(text);
    }
    
}
