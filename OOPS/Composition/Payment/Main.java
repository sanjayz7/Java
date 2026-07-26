public class Main {
    public static void main(String[] args) {
        // Swap parts freely at runtime -- impossible with inheritance
        OrderProcessor order1 = new OrderProcessor(new StripeGateway(), new EmailNotifier());
        order1.placeOrder(499.0);

        OrderProcessor order2 = new OrderProcessor(new UpiGateway(), new SmsNotifier());
        order2.placeOrder(1200.0);
    }
}