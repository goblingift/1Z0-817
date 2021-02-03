/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.interfaces.abstractmethods;

/**
 *
 * @author andre
 */
public class Meat implements Eatable {

    @Override
    public void eat(int amount) {
        System.out.println("nom nom nom, ate them:" + amount);
    }

    @Override
    public void cook(int amount) {
        System.out.println("Cooked so many meat:" + amount);
    }
}
