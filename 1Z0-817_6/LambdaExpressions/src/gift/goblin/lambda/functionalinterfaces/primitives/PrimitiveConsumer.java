/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.lambda.functionalinterfaces.primitives;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/**
 *
 * @author andre
 */
public class PrimitiveConsumer {
    
    public static void execute() {
        DoubleConsumer doubleConsumer = (double d) -> System.out.println("consumed double:" + d);
        doubleConsumer.accept(12.50);
        
        IntConsumer intConsumer = (int i) -> System.out.println("consumed int:" + i);
        intConsumer.accept(900);
        
        LongConsumer longConsumer = (long l) -> System.out.println("consumed long:" + l);
        longConsumer.accept(922L);
    }
    
}
