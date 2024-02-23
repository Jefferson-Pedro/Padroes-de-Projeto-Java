package mercadopago;

import utils.Token;

public interface IMercadoPago {

    public Token token();

    public void sendPaymentsUnique();

    public void receivePaymentsUnique();
}
