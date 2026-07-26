// --- OrderProcessor is COMPOSED of a gateway and a notifier ---
// It doesn't extend either one -- it just holds references to them.
class OrderProcessor {
    private final PaymentGateway gateway;
    private final Notifier notifier;

    OrderProcessor(PaymentGateway gateway, Notifier notifier) {
        this.gateway = gateway;
        this.notifier = notifier;
    }

    void placeOrder(double amount) {
        if (gateway.charge(amount)) {
            notifier.send("Order confirmed for $" + amount);
        }
    }
}