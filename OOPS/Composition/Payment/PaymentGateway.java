// --- Interfaces define the "contract" each part must fulfill ---
interface PaymentGateway {
    boolean charge(double amount);
}