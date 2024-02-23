package adapters;

import paypal.IPayPalPayments;
import picpay.PicPay;
import utils.Token;

public class PicPayAdapter implements IPayPalPayments {

    private Token token;
    private PicPay picPay;

    public PicPayAdapter(PicPay picPay){
        this.picPay = picPay;
        System.out.println("Adaptando o PicPay utilizando os métodos padrões do PayPal");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.picPay.sendPayments();
    }

    @Override
    public void paypalReceive() {
        this.picPay.receivePayments();
    }
}
