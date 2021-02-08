/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.lambda.functionalinterfaces.primitives;

import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

/**
 *
 * @author andre
 */
public class PrimitiveBinaryOperator {
    
    public static void execute() {
        
        DoubleBinaryOperator doubleOp = (double d1, double d2) -> d1 - d2;
        System.out.println(doubleOp.applyAsDouble(109.80, 7.8));
        
        IntBinaryOperator intOp = (int i1, int i2) -> i1 + i2;
        System.out.println(intOp.applyAsInt(10, 20));
        
        LongBinaryOperator longOp = (long l1, long l2) -> l1 - l2 + 100L;
        System.out.println(longOp.applyAsLong(900L, 800L));
        
    }
    
}
