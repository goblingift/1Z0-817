/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.lambda;

import gift.goblin.lambda.functionalinterfaces.BiConsumerExample;
import gift.goblin.lambda.functionalinterfaces.BiFunctionExample;
import gift.goblin.lambda.functionalinterfaces.BiPredicateExample;
import gift.goblin.lambda.functionalinterfaces.BinaryOperatorExample;
import gift.goblin.lambda.functionalinterfaces.ConsumerExample;
import gift.goblin.lambda.functionalinterfaces.FunctionExample;
import gift.goblin.lambda.functionalinterfaces.PredicateExample;
import gift.goblin.lambda.functionalinterfaces.SupplierExample;
import gift.goblin.lambda.functionalinterfaces.UnaryOperatorExample;
import gift.goblin.lambda.functionalinterfaces.primitives.PrimitiveBinaryOperator;
import gift.goblin.lambda.functionalinterfaces.primitives.PrimitiveConsumer;
import gift.goblin.lambda.functionalinterfaces.primitives.PrimitiveFunction;
import gift.goblin.lambda.functionalinterfaces.primitives.PrimitivePredicate;
import gift.goblin.lambda.functionalinterfaces.primitives.PrimitiveSupplier;
import gift.goblin.lambda.functionalinterfaces.primitives.PrimitiveUnaryOperator;
import gift.goblin.lambda.methodreferences.AdvancedInstanceMethodReference;
import gift.goblin.lambda.methodreferences.InstanceMethodReference;
import gift.goblin.lambda.methodreferences.StaticMethodReferences;

/**
 *
 * @author andre
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // static method references code
        StaticMethodReferences.execute();

        // instance method reference code
        InstanceMethodReference.execute();
        
        // advanced method reference ode
        AdvancedInstanceMethodReference.execute();
        
        // functional interfaces
        ConsumerExample.execute();
        BiConsumerExample.execute();
        SupplierExample.execute();
        PredicateExample.execute();
        BiPredicateExample.execute();
        FunctionExample.execute();
        BiFunctionExample.execute();
        UnaryOperatorExample.execute();
        BinaryOperatorExample.execute();
        
        // primitive functional interfaces
        PrimitiveSupplier.execute();
        PrimitiveConsumer.execute();
        PrimitivePredicate.execute();
        PrimitiveFunction.execute();
        PrimitiveUnaryOperator.execute();
        PrimitiveBinaryOperator.execute();
    }
    
}
