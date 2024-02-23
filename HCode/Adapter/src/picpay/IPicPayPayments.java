package picpay;

import utils.Token;

public interface IPicPayPayments {

    public Token authToken();
    public void sendPayments();
    public void receivePayments();
}
