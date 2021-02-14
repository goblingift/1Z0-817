/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.streams.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author andre
 */
public class GroupingByExample {
    
    public static void execute() {
        
        
        Stream<String> nameStream = Stream.of("Jim", "Jeff", "Mike", "Alfred");
        Map<String, List<String>> groupedMap = nameStream
                .collect(Collectors.groupingBy(s -> String.valueOf(s.charAt(2))));
        System.out.println(groupedMap);
        
        Stream<String> nameStream2 = Stream.of("Jim", "Jeff", "Mike", "Alfred");
        Map<String, Long> resultMap2 = nameStream2
                .collect(Collectors.groupingBy(s -> String.valueOf(s.charAt(2)), Collectors.counting()));
        System.out.println(resultMap2);
        
        Stream<String> nameStream3 = Stream.of("Jim", "Jeff", "Mike", "Alfred");
        Map<Boolean, List<String>> splittedByBig3 = nameStream3.collect(Collectors.partitioningBy(s -> s.length() > 3));
        System.out.println(splittedByBig3);
        
        Stream<String> nameStream4 = Stream.of("Jim", "Jeff", "Mike", "Alfred");
        Map<Boolean, String> splittedAndJoined = nameStream4.collect(Collectors.partitioningBy(s -> s.length() > 3, 
                Collectors.joining("_")));
        System.out.println(splittedAndJoined);
        
        
    }
    
}
