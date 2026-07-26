class UpiGateway implements PaymentGateway {
    public boolean charge(double amount) {
        System.out.println("Charging ₹" + amount + " via UPI");
        return true;
    }
}