class PaymentGateway{
	public void makePayment(String cardNumber,String expiryDate,String cvv) {
		System.out.println("Credit card Payment");
		System.out.println("Transaction Successfull");
	}
	public void makePayment(String upiid) {
		System.out.println("UPI Payments");
		System.out.println("Transaction Successfull");
	}
	public void makePayment(double amount) {
		System.out.println("Cash on Delivery");
		System.out.println("Transaction Successfull");
	}
}
public class ECommerceApp {

	public static void main(String[] args) {
		PaymentGateway payment = new PaymentGateway();
		payment.makePayment("123456","6/2025","222");
		payment.makePayment("jacobsbi");
		payment.makePayment(500f);
	}

}
