/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.interfaces.privatemethods;

/**
 *
 * @author andre
 */
public interface Tameable {
    private boolean isTameable() {
        return false;
    }
    default void tame() {
        System.out.println("taming succesfull:" + isTameable());
    }
}
