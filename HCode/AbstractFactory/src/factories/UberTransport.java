package factories;

import aircraft.AirPlane;
import aircraft.IAirCraft;
import landvehicles.Car;
import landvehicles.ILandVehicle;

public class UberTransport implements ITransportFactory{

	@Override
	public ILandVehicle createTransportVehicle() {
		return new Car();
	}

	@Override
	public IAirCraft createTransportAirCraft() {
		return new AirPlane();
	}
}
