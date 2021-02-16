/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.streams.collectors;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author andre
 */
public class CollectorsExample {

    public static void execute() {

        Stream<String> stringStream = Stream.of("Marc", "Anthony", "Jack", "Mandy");
        List<String> resultList = stringStream.collect(Collectors.toList());
        System.out.println(resultList);

        Stream<String> stringStream2 = Stream.of("Marc", "Anthony", "Jack", "Mandy");
        String joinedString = stringStream2.collect(Collectors.joining("-"));
        System.out.println(joinedString);
        
        Comparator<String> compareByLength = (s1, s2) -> Integer.compare(s1.length(), s2.length());
        
        Stream<String> stringStream3 = Stream.of("Marc-Andre", "Anthony", "Jack", "Tim");
        Optional<String> collectorsMaxBy = stringStream3.collect(Collectors.maxBy(compareByLength));
        System.out.println(collectorsMaxBy);
        
        Stream<String> stringStream4 = Stream.of("Marc-Andre", "Anthony", "Jack", "Tim");
        Optional<String> max = stringStream4.max(compareByLength);
        System.out.println(max);
        
        testExamples();
    }
    
    private static void testExamples() {
        System.out.println("CollectorsExample.testExamples");
        
        Stream<String> guys = Stream.of("Max", "Paul", "Peter");
        Long amountOfGuys = guys.collect(Collectors.counting());
        System.out.println(amountOfGuys);
        
        IntStream rangeClosed = IntStream.rangeClosed(10, 15);
        OptionalDouble optAverage = rangeClosed.average();
        if (optAverage.isPresent()) {
            System.out.println("Average: " + optAverage.getAsDouble());
        }
        
        Stream<String> guys2 = Stream.of("Max", "Paul", "Peter");
        System.out.println(guys2.findFirst().get());
        
        List<String> values = Arrays.asList("Alpha A", "Alpha B", "Alpha C");
        boolean flag = values.stream().findFirst().get().equals("Alpha");
        System.out.println(flag);
    }
    

}
