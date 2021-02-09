/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.lambda.functionalinterfaces.primitives;

import java.time.LocalDateTime;
import java.util.function.DoubleFunction;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.LongFunction;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongBiFunction;
import java.util.function.ToLongFunction;

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
        
        // To primitive functions
        ToDoubleFunction<String> toDoubleFunction = (String s) -> Double.parseDouble(s);
        System.out.println(toDoubleFunction.applyAsDouble("899.99"));
        
        ToIntFunction<LocalDateTime> toIntFunction = (LocalDateTime ldt) -> ldt.getYear();
        System.out.println(toIntFunction.applyAsInt(LocalDateTime.now()));
        
        ToLongFunction<String> toLongFunction = (String s) -> Long.parseLong(s);
        System.out.println(toLongFunction.applyAsLong("80000000"));
        
        // To bi-functions
        ToDoubleBiFunction<String, Integer> toDoubleBiFunction = (String s, Integer i) -> Double.parseDouble(s + i);
        System.out.println(toDoubleBiFunction.applyAsDouble("90.1", 5));
        
        ToIntBiFunction<String, Integer> toIntBiFunction = (String s, Integer i) -> Integer.parseInt(s) + i;
        System.out.println(toIntBiFunction.applyAsInt("9000", 81));
        
        ToLongBiFunction<String, Integer> toLongBiFunction = (String s, Integer i) -> Long.parseLong(s) + i;
        System.out.println(toLongBiFunction.applyAsLong("10", 5));
        
        // Primitive to primitive functions
        DoubleToIntFunction doubleToIntFunction = (double d) -> new Double(d).intValue();
        System.out.println(doubleToIntFunction.applyAsInt(32.30));
        
        DoubleToLongFunction doubleToLongFunction = (double d) -> new Double(d).longValue();
        System.out.println(doubleToLongFunction.applyAsLong(22.45));
        
        IntToDoubleFunction intToDoubleFunction = (int i) -> Double.valueOf(i);
        System.out.println(intToDoubleFunction.applyAsDouble(56));
        
        IntToLongFunction intToLongFunction = (int i) -> new Long(i);
        System.out.println(intToLongFunction.applyAsLong(76));
        
        LongToDoubleFunction longToDoubleFunction = (long l) -> Double.valueOf(l);
        System.out.println(longToDoubleFunction.applyAsDouble(500));
        
        LongToIntFunction longToIntFunction = (long l) -> new Long(l).intValue();
        System.out.println(longToIntFunction.applyAsInt(8090));
        
        // Object and primitive consumer
        ObjDoubleConsumer<String> objDoubleConsumer = (String s, double d) -> System.out.println(s + d);
        objDoubleConsumer.accept("Test", 75.50);
        
        ObjIntConsumer<String> objIntConsumer = (String s, int i) -> System.out.println(s + i);
        objIntConsumer.accept("Flight", 5060);
        
        ObjLongConsumer<String> objLongConsumer = (String s, long l) -> System.out.println(s + l);
        objLongConsumer.accept("End", 6_000);
    }
    
}
