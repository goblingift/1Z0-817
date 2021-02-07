/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.lambda.functionalinterfaces;

import java.util.function.Consumer;

/**
 *
 * @author andre
 */
public class ConsumerExample implements Consumer<String> {
    
    class AnotherConsumerExample implements Consumer<String> {
        @Override
        public void accept(String t) {
            System.out.println("*drink drink drink*");
        }
    }
    
    @Override
    public void accept(String t) {
        System.out.println("nom nom nom");
    }
    
    public static void execute() {
        ConsumerExample consumerExample = new ConsumerExample();
        AnotherConsumerExample anotherConsumerExample = consumerExample.new AnotherConsumerExample();
        Consumer<String> consumer = s -> consumerExample.accept(s);
        Consumer<String> superConsumer = consumer.andThen(anotherConsumerExample);
        superConsumer.accept("Pizza");
    }
}
