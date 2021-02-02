package gift.goblin.locator;

import java.util.*;
import gift.goblin.api.*;

public class CarLocator {
	
	public static Car searchCar() {
		ServiceLoader<Car> serviceLoader = ServiceLoader.load(Car.class);
		for (Car actCar : serviceLoader) {
			return actCar;
		}
		// if no car was found, return null
		return null;
	}
	
}