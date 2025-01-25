Aim: Design a program for a basic banking system that calculates the average account balance by dividing the total balance by the number of account holders and verifies transaction IDs from an array. The program should demonstrate robust exception handling using multiple try-catch blocks to manage two specific scenarios: an ArithmeticException for division by zero when there are no account holders and an ArrayIndexOutOfBoundsException for accessing invalid indices in the transaction ID array.
Code: 
import java.util.Scanner;
public class BankingSystem {
    // Method to calculate the average balance of accounts
    public static double calculateAverageBalance(double[] balances) throws ArithmeticException {
        double totalBalance = 0;
        int accountHolders = balances.length;
        // Check for division by zero (no account holders)
        if (accountHolders == 0) {
            throw new ArithmeticException("Cannot calculate average balance. No account holders.");
        }
        // Calculate total balance
        for (double balance : balances) {
            totalBalance += balance;
        }
        // Return the average balance
        return totalBalance / accountHolders;
    }
    // Method to verify if a transaction ID exists in the array
    public static boolean verifyTransactionID(String[] transactionIDs, String transactionID) throws ArrayIndexOutOfBoundsException {
        // Try to find the transaction ID in the array
        for (int i = 0; i < transactionIDs.length; i++) {
            if (transactionIDs[i].equals(transactionID)) {
                return true; // Transaction ID found
            }
        }
        return false; // Transaction ID not found
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Example account balances
        double[] accountBalances = {5000.0, 2000.0, 3000.0, 1500.0, 8000.0}; // Example account balances
        // Example transaction IDs
        String[] transactionIDs = {"TXN001", "TXN002", "TXN003", "TXN004", "TXN005"};
        // Demonstrating exception handling for average balance calculation
        try {
            double averageBalance = calculateAverageBalance(accountBalances);
            System.out.println("Average Account Balance: " + averageBalance);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        // Prompt user to enter a transaction ID to verify
        System.out.print("Enter a transaction ID to verify: ");
        String transactionID = scanner.nextLine();
        // Demonstrating exception handling for transaction ID verification
        try {
            if (verifyTransactionID(transactionIDs, transactionID)) {
                System.out.println("Transaction ID " + transactionID + " is valid.");
            } else {
                System.out.println("Transaction ID " + transactionID + " is invalid.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid transaction ID index. " + e.getMessage());
        }
        scanner.close();
    }
}
Output:
Average Account Balance: 3900.0
Enter a transaction ID to verify: TXN999
Transaction ID TXN999 is invalid.
Error: Cannot calculate average balance. No account holders.
Enter a transaction ID to verify: TXN003
Transaction ID TXN003 is valid.
