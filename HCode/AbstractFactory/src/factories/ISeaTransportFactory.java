package factories;

import watervehicles.IWaterTransport;

public interface ISeaTransportFactory {
	IWaterTransport createWaterTransport();
	IWaterTransport createWaterTransportFerry();
}
