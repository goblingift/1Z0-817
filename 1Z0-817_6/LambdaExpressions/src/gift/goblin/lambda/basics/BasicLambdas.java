/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.lambda.basics;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 *
 * @author andre
 */
public class BasicLambdas {

    public void example1() {

        Consumer<String> consumer = (s) -> {
            s.toLowerCase();
            s.toUpperCase();
        };
        
        BiConsumer<String, String> biConsumer = (s1, s2) -> s1.toLowerCase();
        //BiConsumer<String, String> biConsumerFail = (String s1, s2) -> s1.toLowerCase();
        BiConsumer<String, Integer> biConsumerTypes = (String s1, Integer s2) -> s1.toLowerCase();
        
    }

}
