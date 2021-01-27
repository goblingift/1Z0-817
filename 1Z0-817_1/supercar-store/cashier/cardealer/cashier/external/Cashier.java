/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package cardealer.cashier.external;
import cardealer.cashregister.CashRegister;

/**
 *
 * @author andre
 */
public class Cashier {
    public void doWork() {
        System.out.println("Money money money!");
		CashRegister.main(null);
    }
	
	public static void main(String[] args) {
        System.out.println("Cashier starts work!");
		new Cashier().doWork();
    }
}
