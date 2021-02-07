/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.lambda.functionalinterfaces;

import java.util.function.BiPredicate;

/**
 *
 * @author andre
 */
public class BiPredicateExample implements BiPredicate<Integer, String> {

    @Override
    public boolean test(Integer t, String u) {
        return t < 10 && u.length() < 10;
    }
    
    public static void execute() {
        BiPredicateExample biPredicateExample = new BiPredicateExample();
        BiPredicate<Integer, String> biPredicate = (Integer i, String s) -> biPredicateExample.test(i, s);
        System.out.println(biPredicate.test(2, "shorter"));
    }
}
