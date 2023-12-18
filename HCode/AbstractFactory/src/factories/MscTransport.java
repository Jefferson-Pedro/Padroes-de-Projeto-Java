package factories;

import watervehicles.Ferry;
import watervehicles.IWaterTransport;
import watervehicles.Ship;

public class MscTransport implements ISeaTransportFactory{

	@Override
	public IWaterTransport createWaterTransport() {
		return new Ship();
	}
	
	@Override
	public IWaterTransport createWaterTransportFerry() {
		return new Ferry();
	}

}
