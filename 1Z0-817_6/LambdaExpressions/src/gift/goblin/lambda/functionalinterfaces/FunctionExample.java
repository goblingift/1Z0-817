/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.lambda.functionalinterfaces;

import java.util.function.Function;

/**
 *
 * @author andre
 */
public class FunctionExample implements Function<String, Integer>{

    @Override
    public Integer apply(String t) {
        return Integer.parseInt(t);
    }
    
    public static void execute() {
        FunctionExample functionExample = new FunctionExample();
        Function<String, Integer> function = s -> functionExample.apply(s);
        System.out.println(function.apply("908"));
    }
    
}
