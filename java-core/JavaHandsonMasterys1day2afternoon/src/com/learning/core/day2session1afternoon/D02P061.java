package com.learning.core.day2session1afternoon;
class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}

public class D02P061 {
    private int accNo;
    private String custName;
    private String accType;
    private float balance;

    public D02P061(int accNo, String custName, String accType, float initialBalance) throws LowBalanceException, NegativeAmountException {
        this.accNo = accNo;
        this.custName = custName;
        this.accType = accType;
        if (initialBalance < 0) {
            throw new NegativeAmountException("Initial balance cannot be negative");
        }
        if ((accType.equals("Saving") && initialBalance < 1000) || (accType.equals("Current") && initialBalance < 5000)) {
            throw new LowBalanceException("Initial balance is less than minimum required balance for " + accType + " account");
        }
        this.balance = initialBalance;
    }

    public void deposit(float amt) throws NegativeAmountException {
        if (amt < 0) {
            throw new NegativeAmountException("Amount to deposit cannot be negative");
        }
        balance += amt;
    }

    public float getBalance() throws LowBalanceException {
        if ((accType.equals("Saving") && balance < 1000) || (accType.equals("Current") && balance < 5000)) {
            throw new LowBalanceException("Balance is below minimum required balance for " + accType + " account");
        }
        return balance;
    }

    // Getters for accNo, custName, and accType
    public int getAccNo() {
        return accNo;
    }

    public String getCustName() {
        return custName;
    }

    public String getAccType() {
        return accType;
    }
}