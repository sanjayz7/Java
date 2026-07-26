class SmsNotifier implements Notifier {
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}
