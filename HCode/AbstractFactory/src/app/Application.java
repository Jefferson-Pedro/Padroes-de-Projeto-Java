package app;

import aircraft.IAirCraft;
import factories.ISeaTransportFactory;
import factories.ITransportFactory;
import landvehicles.ILandVehicle;
import watervehicles.IWaterTransport;

public class Application {
	private ILandVehicle vehicle;
	private IAirCraft airCraft;
	private IWaterTransport waterVehicle;
	
	public ILandVehicle landTransport(ITransportFactory factory) {
		vehicle = factory.createTransportVehicle();
		return vehicle;
	}
	
	public IAirCraft airTransport(ITransportFactory factory) {
		airCraft = factory.createTransportAirCraft();
		return airCraft;
	}
	
	public IWaterTransport waterTransport(ISeaTransportFactory factory) {
		waterVehicle = factory.createWaterTransport();
		return waterVehicle;
	}
	
	public void startRoute() {
		if(vehicle != null) {
			vehicle.startRoute();
		}else if (airCraft != null) {
			airCraft.startRoute();
		}else {
			waterVehicle.startRoute();
		}
	}
}
