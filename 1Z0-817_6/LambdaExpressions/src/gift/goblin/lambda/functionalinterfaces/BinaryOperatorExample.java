/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.lambda.functionalinterfaces;

import java.util.function.BinaryOperator;

/**
 *
 * @author andre
 */
public class BinaryOperatorExample implements BinaryOperator<String>{

    @Override
    public String apply(String t, String u) {
        return t.toLowerCase().concat(u.toLowerCase());
    }
    
    public static void execute() {
        BinaryOperatorExample binaryOperatorExample = new BinaryOperatorExample();
        BinaryOperator<String> binaryOperator = (s1, s2) -> binaryOperatorExample.apply(s1, s2);
        System.out.println(binaryOperator.apply("FiRStText", "SeCOndText"));
    }
}
