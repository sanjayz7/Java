// --- Concrete implementations (interchangeable parts) ---
class StripeGateway implements PaymentGateway {
    public boolean charge(double amount) {
        System.out.println("Charging $" + amount + " via Stripe");
        return true;
    }
}