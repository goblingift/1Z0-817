/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */

module cardealer.cashier {
	exports cardealer.cashier.external to cardealer.salesman;
	requires transitive cardealer.cashregister;
}
