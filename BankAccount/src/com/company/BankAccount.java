package com.company;

public class BankAccount {
    int balance = 0;

    public static void main(String[] args) {

    }

    public int showBalance(){
        return balance;
    }

    public void deposit(int amount){
        balance += amount;
    }

    public void withdraw(int amount){
        balance -= amount;
    }
}
