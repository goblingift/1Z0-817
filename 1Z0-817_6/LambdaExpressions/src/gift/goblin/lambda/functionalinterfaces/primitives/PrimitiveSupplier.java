/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.lambda.functionalinterfaces.primitives;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

/**
 *
 * @author andre
 */
public class PrimitiveSupplier {

    public static void execute() {
        
        IntSupplier intSupplier = () -> 800;
        System.out.println(intSupplier.getAsInt());
        
        LongSupplier longSupplier = () -> 8000L;
        System.out.println(longSupplier.getAsLong());
        
        DoubleSupplier doubleSupplier = () -> 80.95;
        System.out.println(doubleSupplier.getAsDouble());
    }
}
