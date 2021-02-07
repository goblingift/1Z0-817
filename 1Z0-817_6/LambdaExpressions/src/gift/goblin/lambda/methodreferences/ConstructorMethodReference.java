/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.lambda.methodreferences;

import java.util.function.Supplier;

/**
 *
 * @author andre
 */
public class ConstructorMethodReference {
    
    private int age;
    private double money;

    public ConstructorMethodReference(int age) {
        this.age = age;
    }

    public ConstructorMethodReference(int age, double money) {
        this.age = age;
        this.money = money;
    }
    
    public ConstructorMethodReference() {
    }
    
    public static void execute() {
        Supplier<ConstructorMethodReference> s = ConstructorMethodReference::new;
    }
    
}
