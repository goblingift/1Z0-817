/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.lambda.methodreferences;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 *
 * @author andre
 */
public class AdvancedInstanceMethodReference {
    private String food;

    public AdvancedInstanceMethodReference(String food) {
        this.food = food;
    }
    
    public void consume() {
        System.out.println("consumed:" + this.food);
    }
    
    public static void execute() {
        Consumer<AdvancedInstanceMethodReference> c = AdvancedInstanceMethodReference::consume;
        c.accept(new AdvancedInstanceMethodReference("Bread"));
    }
}
