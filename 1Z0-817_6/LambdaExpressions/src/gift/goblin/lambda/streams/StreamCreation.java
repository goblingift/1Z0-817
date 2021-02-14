/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.lambda.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 *
 * @author andre
 */
public class StreamCreation {
    
    public static void execute() {
        
        System.out.println("Start Stream Creation code...");
        
        Stream<String> emptyStream = Stream.empty();
        
        Stream<String> easyStream = Stream.of("Test");
        
        Stream<Integer> multiStream = Stream.of(29, 89, 201);
        
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Peter");
        nameList.add("Max");
        nameList.add("Laureen");
        Stream<String> streamFromList = nameList.stream();
        
        // infinite stream!
        Stream<Long> timestampStream = Stream.generate(() -> System.currentTimeMillis());
        
        Stream<Integer> squareStream = Stream.iterate(new Integer(2), (Integer i) -> i * i);
        Stream<Integer> squareStreamLimit = Stream.iterate(new Integer(2), (i) -> i < 1000,  (i) -> i * i);
        squareStreamLimit.forEach(System.out::println);
    }
    
}
