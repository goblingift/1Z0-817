/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.parallelstreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author andre
 */
public class SimpleParallelStream {
    
    public static void execute() {
        
        Stream<String> names = Stream.of("Max", "Peter", "Tom");
        Stream<String> parallelNames = names.parallel();
        parallelNames.forEach(System.out::println); 
        //names.forEach(System.out::println); // WONT COMPILE!
        
        IntStream numbers = IntStream.of(1, 2, 3, 4);
        IntStream parallelNumbers = numbers.parallel();
        
        List<String> nameList = new ArrayList<>();
        nameList.add("Fritz");
        nameList.add("Lylo");
        Stream<String> nameListParallel = nameList.parallelStream();
        
        decompositionExample();
        foreachOrderedExample();
        reduceExample();
    }
    
    
    private static void decompositionExample() {
        
        Function<String, String> saveToDB = (String s) -> { 
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println(e);
            }
            return s;
        };
        
        Stream<String> serialStream = Stream.of("Luke", "Mike", "Jack");
        serialStream.map(saveToDB).forEach(System.out::println);
        // --> Takes about 3 seconds
        
        Stream<String> parallelStream = Stream.of("Luke", "Mike", "Jack").parallel();
        parallelStream.map(saveToDB).forEach(System.out::println);
        // --> Finishes after 1 second
        
    }
    
    private static void foreachOrderedExample() {
        
        IntStream intStream = IntStream.range(0, 101);
        intStream.parallel().forEach(System.out::println);
        System.out.println("-- NEXT ONE --");
        IntStream intStream2 = IntStream.range(0, 101);
        intStream2.parallel().forEachOrdered(System.out::println);
    }
    
    private static void reduceExample() {
        
        Stream<String> stream = Stream.of("T", "E", "S", "T");
        String reduced = stream.reduce("_", (s1, s2) -> s1.concat(s2));
        System.out.println(reduced);
        
        Stream<String> parallelStream = Stream.of("T", "E", "S", "T").parallel();
        String reduced2 = parallelStream.reduce("_", (s1, s2) -> s1.concat(s2),
                (s1, s2) -> s1.concat(s2));
        System.out.println(reduced2);
        
    }
    
}
