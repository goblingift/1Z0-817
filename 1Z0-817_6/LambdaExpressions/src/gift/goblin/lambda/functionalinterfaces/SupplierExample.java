/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.lambda.functionalinterfaces;

import java.util.function.Supplier;

/**
 *
 * @author andre
 */
public class SupplierExample implements Supplier<Integer>{

    @Override
    public Integer get() {
        return new Double(Math.random() * 100).intValue();
    }
    
    public static void execute() {
        SupplierExample supplierExample = new SupplierExample();
        Supplier<Integer> supplier = () -> supplierExample.get();
        System.out.println(supplier.get());
    }
}
