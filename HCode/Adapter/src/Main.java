import adapters.MercadoPagoAdapter;
import adapters.PicPayAdapter;
import mercadopago.IMercadoPago;
import mercadopago.MercadoPago;
import paypal.IPayPalPayments;
import paypal.PayPal;
import picpay.PicPay;

public class Main {
    public static void main(String[] args) {

        /*IPayPalPayments payment = new PicPayAdapter(new PicPay());
        payment.paypalPayment();
        payment.paypalReceive();*/

        IPayPalPayments payment = new MercadoPagoAdapter(new MercadoPago());
        payment.paypalPayment();
        payment.paypalReceive();
    }
}