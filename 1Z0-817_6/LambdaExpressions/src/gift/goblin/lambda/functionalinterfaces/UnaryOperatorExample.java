/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.lambda.functionalinterfaces;

import java.util.function.UnaryOperator;

/**
 *
 * @author andre
 */
public class UnaryOperatorExample implements UnaryOperator<String> {

    @Override
    public String apply(String t) {
        return t.toLowerCase();
    }
    
    public static void execute() {
        UnaryOperatorExample unaryOperatorExample = new UnaryOperatorExample();
        UnaryOperator<String> unaryOperator = s -> unaryOperatorExample.apply(s);
        System.out.println(unaryOperator.apply("SuperStrangeText"));
    }
    
}
