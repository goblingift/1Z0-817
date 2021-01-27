/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package cardealer.salesman;
import cardealer.cashier.external.Cashier;

/**
 *
 * @author andre
 */
public class SalesMan {
    public void doWork() {
		Cashier.main(null);
    }
	
	public static void main(String[] args) {
        System.out.println("Salesman enters business!");
		new SalesMan().doWork();
    }
}
