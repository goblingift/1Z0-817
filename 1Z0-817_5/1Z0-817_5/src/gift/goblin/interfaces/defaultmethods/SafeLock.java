/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.interfaces.defaultmethods;

/**
 *
 * @author andre
 */
public class SafeLock implements Lockable{
    public void doStuff() {
        new SafeLock().lock();
        new SafeLock().unlock();
    }
    @Override
    public void unlock() {
        System.out.println("Unlocked forever!");
    }
}
