/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.streams.collections;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author andre
 */
public class SortedCollectionsExample {
    
    public static void execute() {
        
        ArrayList<String> names = new ArrayList<String>();
        names.add("Peter5");
        names.add("Paul8");
        names.add("Peterson2");
        
        Comparator<String> compareByLastCharacter = (s1, s2) -> String.valueOf(s1.charAt(s1.length() -1))
                .compareTo(String.valueOf(s2.charAt(s2.length() -1)));
        
        names.sort(compareByLastCharacter);
        System.out.println(names);
    }
    
    
}
