/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.lambda.functionalinterfaces.primitives;

import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

/**
 *
 * @author andre
 */
public class PrimitiveUnaryOperator {
    
    public static void execute() {
        
        DoubleUnaryOperator doubleOp = (double d) -> d * 10;
        System.out.println(doubleOp.applyAsDouble(90.4));
        
        IntUnaryOperator intOp = (int i) -> i - 5;
        System.out.println(intOp.applyAsInt(90));
        
        LongUnaryOperator longOp = (long l) -> l / 10;
        System.out.println(longOp.applyAsLong(9_000));
    }
    
}
