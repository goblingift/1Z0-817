/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.lambda.functionalinterfaces;

import java.util.function.BiFunction;

/**
 *
 * @author andre
 */
public class BiFunctionExample implements BiFunction<Integer, Double, String> {

    @Override
    public String apply(Integer t, Double u) {
        return new String(t.toString() + new Integer(u.intValue()).toString());
    }
    
    public static void execute() {
        BiFunctionExample biFunctionExample = new BiFunctionExample();
        BiFunction<Integer, Double, String> biFunction = (i, d) -> biFunctionExample.apply(i, d);
        System.out.println(biFunction.apply(80, 89.7));
    }
}
