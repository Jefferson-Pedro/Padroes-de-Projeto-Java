package mercadopago;

import utils.Token;

public class MercadoPago implements IMercadoPago{

    @Override
    public Token token() {
        return new Token();
    }

    @Override
    public void sendPaymentsUnique() {
        System.out.println("Enviando um unico pagamento via Mercado Pago");
    }

    @Override
    public void receivePaymentsUnique() {
        System.out.println("Recebendo um unico pagamento via Mercado Pago");

    }
}
