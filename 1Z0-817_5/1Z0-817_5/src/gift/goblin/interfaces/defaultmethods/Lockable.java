/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.interfaces.defaultmethods;

/**
 *
 * @author andre
 */
public interface Lockable {
    public default void lock() {
        System.out.println("LOCKED!");
    }
    default void unlock() {
        System.out.println("UNLOCKED!");
    }
}
