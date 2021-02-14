/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.streams.optional;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author andre
 */
public class OptionalExample {
    
    public static void execute() {
        
        Optional<Integer> optInteger = Optional.empty();
        
        Optional<Integer> anotherOptInteger = optInteger.or(() -> Optional.of(99));
        System.out.println(anotherOptInteger);
        
        Integer orElse = optInteger.orElse(20);
        System.out.println(orElse);
        
        Integer orElseGet = optInteger.orElseGet(() -> 100);
        System.out.println(orElseGet);
        
        // will throw NoSuchElementException per default
        // Integer intOrThrow = optInteger.orElseThrow(); 
        
        // will throw a IllegalStateException
        // optInteger.orElseThrow(() -> new IllegalStateException("missing integer"));
        
    }
    
    
    private static void executePrimitiveOptionals() {
        
        OptionalInt optInt = OptionalInt.of(100);
        int intResult = optInt.getAsInt();
        
        OptionalDouble optDouble = OptionalDouble.of(24.99);
        double doubleResult = optDouble.getAsDouble();
        
        OptionalLong optLong = OptionalLong.of(890L);
        long longResult = optLong.getAsLong();
        
    }
    
    
    
}
