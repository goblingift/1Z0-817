package gift.goblin.rentalcar;

import gift.goblin.api.*;
import java.lang.*;

public class RentalCar implements Car {
	
	@Override
	public String getColor() {
		return "yellow";
	}
	
	@Override
	public double getPrice() {
		return 23900.00;
	}
	
}