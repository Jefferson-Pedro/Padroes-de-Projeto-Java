package factories;

import aircraft.Helicopter;
import aircraft.IAirCraft;
import landvehicles.ILandVehicle;
import landvehicles.MotorCycle;

public class NineNineTransport implements ITransportFactory{

	@Override
	public ILandVehicle createTransportVehicle() {
		return new MotorCycle();
	}

	@Override
	public IAirCraft createTransportAirCraft() {
		return new Helicopter();
	}

}
