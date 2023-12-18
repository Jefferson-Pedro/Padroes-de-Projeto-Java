package factories;

import aircraft.IAirCraft;
import landvehicles.ILandVehicle;
import watervehicles.IWaterTransport;

public interface ITransportFactory {
	ILandVehicle createTransportVehicle();
	IAirCraft createTransportAirCraft();
}
