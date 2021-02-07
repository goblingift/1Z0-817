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
    }
}
