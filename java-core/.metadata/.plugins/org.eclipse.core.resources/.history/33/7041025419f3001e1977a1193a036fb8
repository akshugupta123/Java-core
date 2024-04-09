package com.learning.core.day2session1afternoon;

public class Main {
    public static void main(String[] args) {
        try {
            // Test case 1
            BankAccount acc1 = new BankAccount(123, "John", "Saving", 900);
            acc1.getBalance(); // Throws LowBalanceException

        } catch (LowBalanceException e) {
            System.out.println("Output 1: " + e.getMessage());
        } catch (NegativeAmountException e) {
            System.out.println("Output 1: " + e.getMessage());
        }

        try {
            // Test case 2
            BankAccount acc2 = new BankAccount(123, "John", "Saving", -900); // Throws NegativeAmountException
        } catch (LowBalanceException e) {
            System.out.println("Output 2: " + e.getMessage());
        } catch (NegativeAmountException e) {
            System.out.println("Output 2: " + e.getMessage());
        }
    }
}
