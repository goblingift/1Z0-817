/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.interfaces.staticmethods;

/**
 *
 * @author andre
 */
public interface Washable {
    private static void privateWash() {
        System.out.println("Private wash started!");
    }
    static void publicWash() {
        System.out.println("Public wash started!");
        Washable.privateWash();
    }
}
