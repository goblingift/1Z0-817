module carserviceprovider{
	requires carservicelocator;
	provides gift.goblin.api.Car with gift.goblin.rentalcar.RentalCar;
}