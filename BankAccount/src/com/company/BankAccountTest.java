package com.company;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    BankAccount bankAccount = new BankAccount();
    @org.junit.jupiter.api.Test
    void canShowBalance(){
        assertEquals(bankAccount.showBalance(), 0);
    }

    @org.junit.jupiter.api.Test
    void canDepositBalance(){
        bankAccount.deposit(5);
        assertEquals(bankAccount.showBalance(), 5);
    }

    @org.junit.jupiter.api.Test
    void canWithdrawBalance(){
        bankAccount.deposit(20);
        bankAccount.withdraw(5);
        assertEquals(bankAccount.showBalance(), 15);
    }
}