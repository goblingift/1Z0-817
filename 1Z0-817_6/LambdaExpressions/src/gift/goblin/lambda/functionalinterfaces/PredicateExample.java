/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.lambda.functionalinterfaces;

import java.util.function.Predicate;

/**
 *
 * @author andre
 */
public class PredicateExample implements Predicate<String> {

    @Override
    public boolean test(String t) {
        return t.length() < 10;
    }
    
    public static void execute() {
        PredicateExample predicateExample = new PredicateExample();
        Predicate<String> predicate = s -> predicateExample.test(s);
        System.out.println(predicate.test("VeryLongLongText"));
        
        Predicate<Integer> biggerThan100 = i -> i > 100;
        Predicate<Integer> smallerThan100 = i -> i < 100;
        
        System.out.println("fine so far.");
        
        // default methods of predicate
        Predicate<Integer> impossibleStatement = biggerThan100.and(smallerThan100);
        Predicate<Integer> negatedImpossibleStatement = impossibleStatement.negate();
        Predicate<Integer> smallerOrBigger = biggerThan100.or(smallerThan100);
        
        System.out.println(impossibleStatement.test(50));
        System.out.println(negatedImpossibleStatement.test(50));
        System.out.println(smallerOrBigger.test(50));
    }
}
