/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.streams;

import gift.goblin.streams.collections.SortedCollectionsExample;
import gift.goblin.streams.collectors.CollectorsExample;
import gift.goblin.streams.collectors.GroupingByExample;
import gift.goblin.streams.optional.OptionalExample;
import gift.goblin.streams.terminate.TerminationExample;

/**
 *
 * @author andre
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        OptionalExample.execute();
        TerminationExample.execute();
        SortedCollectionsExample.execute();
        CollectorsExample.execute();
        GroupingByExample.execute();
    }
    
}
