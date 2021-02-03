/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.interfaces;

import gift.goblin.interfaces.defaultmethods.SafeLock;
import gift.goblin.interfaces.staticmethods.CarWash;

/**
 *
 * @author andre
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // default methods
        new SafeLock().doStuff();
        
        // static methods
        new CarWash().startWashProgram();
    }
    
}
