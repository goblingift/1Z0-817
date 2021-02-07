/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.lambda.methodreferences;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 *
 * @author andre
 */
public class InstanceMethodReference {
    
    public String generateText() {
        return "SAMPLE-TEXT";
    }
    
    public void consumeText(String s) {
        System.out.println("Consume:" + s);
    }
    
    public static void execute() {
        InstanceMethodReference i = new InstanceMethodReference();
        Supplier<String> s = i::generateText;
        System.out.println(s.get());
        
        Consumer<String> c = i::consumeText;
        c.accept("Food");
    }
}
