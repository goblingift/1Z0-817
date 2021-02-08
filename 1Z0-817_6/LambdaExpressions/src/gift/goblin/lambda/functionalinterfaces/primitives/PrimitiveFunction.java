/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.lambda.functionalinterfaces.primitives;

import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.LongFunction;

/**
 *
 * @author andre
 */
public class PrimitiveFunction {
    
    public static void execute() {
        
        DoubleFunction<String> doubleFunction = (double d) -> d > 99.99 ? "BIG" : "SMALL";
        System.out.println(doubleFunction.apply(82.21));
        
        IntFunction<String> intFunction = (int i) -> i < 10 ? "not even ten!" : "big enough!";
        System.out.println(intFunction.apply(9));
        
        LongFunction<String> longFunction = (long l) -> l > 1_000_000L ? "MILLIONS!" : "THOUSANDS";
        System.out.println(longFunction.apply(900_000L));
        
    }
    
}
