package picpay;

import utils.Token;

public class PicPay implements IPicPayPayments {

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendPayments() {
        System.out.println("Enviando pagamentos via PicPay");
    }

    @Override
    public void receivePayments() {
        System.out.println("Recebendo pagamentos via PicPay");
    }
}
