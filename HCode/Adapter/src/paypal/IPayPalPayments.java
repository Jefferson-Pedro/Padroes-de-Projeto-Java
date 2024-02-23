package paypal;

import utils.Token;

public interface IPayPalPayments {

   public Token authToken();
   public void paypalPayment();
   public void paypalReceive();
}
