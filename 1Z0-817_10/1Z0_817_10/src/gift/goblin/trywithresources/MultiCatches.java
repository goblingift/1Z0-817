/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.trywithresources;

import java.io.IOException;

/**
 *
 * @author andre
 */
public class MultiCatches {
    
    public void execute() {
        
        try {
            doStuff();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e = null;
        }
        
        
    }
    
    private void doStuff() throws IOException {
        throw new IOException("code red");
    }
    
    
}
