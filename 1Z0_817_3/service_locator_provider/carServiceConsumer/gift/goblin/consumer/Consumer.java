package gift.goblin.consumer;

import gift.goblin.api.*;
import gift.goblin.locator.*;

public class Consumer {
	
	public static void main(String[] args) {
		Car car = CarLocator.searchCar();
		System.out.println("Found a car: " + car);
	}
}