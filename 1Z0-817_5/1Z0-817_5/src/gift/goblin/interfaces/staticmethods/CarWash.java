/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.interfaces.staticmethods;

/**
 *
 * @author andre
 */
public class CarWash implements Washable {
    public void startWashProgram() {
        System.out.println("Car entered the car wash!");
        Washable.publicWash();
    }
}
