/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.streams.terminate;

import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author andre
 */
public class TerminationExample {
    
    public static void execute() {
        
        System.out.println("Termination Example");
        
        IntStream intStream = IntStream.of(50,100,150,200);
        long count = intStream.count();
        System.out.println(count);
        
        OptionalInt min = IntStream.of(50,100,150,200).min();
        OptionalInt max = IntStream.of(50,100,150,200).max();
        System.out.println("min:" + min + " max:" + max);
        
        
        Stream<String> stringStream = Stream.of("Whello", "World", "Moon");
        Optional<String> minString = stringStream.min(Comparator.naturalOrder());
        System.out.println(minString.get());
        
        IntStream intStream2 = IntStream.of(90, 190, 200, 304);
        OptionalDouble optDouble = intStream2.average();
        System.out.println(optDouble);
        
        System.out.println("sum methods");
        
        IntStream intStream3 = IntStream.of(70, 87, 89, 99);
        int sum = intStream3.sum();
        System.out.println(sum);
        
        IntStream intStream4 = IntStream.of();
        int sum2 = intStream4.sum();
        System.out.println(sum2);
        
    }
    
    
    
    
    
    
}
