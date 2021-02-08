/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.lambda.functionalinterfaces.primitives;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

/**
 *
 * @author andre
 */
public class PrimitivePredicate {
    
    public static void execute() {
        
        DoublePredicate biggerThanTen = (double d) -> d > 10.00;
        System.out.println(biggerThanTen.test(12.20));
        
        IntPredicate smallerThanThree = (int i) -> i < 3;
        System.out.println(smallerThanThree.test(2));
        
        LongPredicate sameLikeThousand = (long l) -> l == 1_000L;
        System.out.println(sameLikeThousand.test(1_000));
        
    }
    
}
