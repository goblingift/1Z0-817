/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin;

import gift.goblin.trywithresources.MultiCatches;
import gift.goblin.trywithresources.OwnTryWithResourceImpl;

/**
 *
 * @author andre
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OwnTryWithResourceImpl ownTryWithResourceImpl = new OwnTryWithResourceImpl();
        ownTryWithResourceImpl.execute();
        ownTryWithResourceImpl.executeTwo();
        
        new MultiCatches().execute();
    }
    
}
