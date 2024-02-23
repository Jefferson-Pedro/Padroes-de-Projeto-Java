package adapters;

import mercadopago.IMercadoPago;
import mercadopago.MercadoPago;
import paypal.IPayPalPayments;
import utils.Token;

public class MercadoPagoAdapter implements IPayPalPayments {

    private Token toke;

    private MercadoPago mercadoPago;

    public MercadoPagoAdapter(MercadoPago mercadoPago){
        this.mercadoPago = mercadoPago;
        System.out.println("Adaptando o Mercado Pago utilizando os métodos padrões do PayPal");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        mercadoPago.sendPaymentsUnique();
    }

    @Override
    public void paypalReceive() {
        mercadoPago.receivePaymentsUnique();
    }
}
