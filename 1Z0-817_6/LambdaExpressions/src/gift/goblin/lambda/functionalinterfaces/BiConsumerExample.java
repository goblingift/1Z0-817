/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.lambda.functionalinterfaces;

import java.util.function.BiConsumer;

/**
 *
 * @author andre
 */
public class BiConsumerExample implements BiConsumer<String, Integer>{

    @Override
    public void accept(String t, Integer u) {
        System.out.println("Big consuming started:" + t + u);
    }
    
    public static void execute() {
        BiConsumerExample biConsumerExample = new BiConsumerExample();
        BiConsumer<String, Integer> biConsumer = (s, i) -> biConsumerExample.accept(s, i);
        biConsumer.accept("TEST", 123);
    }
}
