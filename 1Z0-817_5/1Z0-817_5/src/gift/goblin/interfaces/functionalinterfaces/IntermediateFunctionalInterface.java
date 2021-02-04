/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.interfaces.functionalinterfaces;

/**
 *
 * @author andre
 */
public interface IntermediateFunctionalInterface {
    private static void ping() { System.out.println("beep");}
    public static void call() { System.out.println("called!"); }
    void abstractMethod();
}
