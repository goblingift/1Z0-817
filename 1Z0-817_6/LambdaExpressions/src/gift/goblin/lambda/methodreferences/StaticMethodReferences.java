/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.lambda.methodreferences;

import java.util.function.Consumer;

/**
 *
 * @author andre
 */
public class StaticMethodReferences {
    
    public static void staticStuff(String s) {
        System.out.println("static stuff done: " + s);
    }
    
    public static void execute() {
        Consumer<String> s = StaticMethodReferences::staticStuff;
        s.accept("test123");
    }
    
}
