public class Task5 {
    public static void main(String[] args) {


        String accountHolder = "Mohamed Sameh";
        long accountNumber = 123456789012L;
        double balance = 2500.75;
        boolean isActive = true;


        System.out.println("=== Account Statement ===");
        System.out.printf("Account Holder : %s%n", accountHolder);
        System.out.printf("Account Number : %d%n", accountNumber);
        System.out.printf("Balance        : %.2f%n", balance);
        System.out.printf("Account Active : %b%n", isActive);
    }
}