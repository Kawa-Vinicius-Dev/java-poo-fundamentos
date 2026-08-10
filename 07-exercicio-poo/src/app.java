/*
Write a Java program to create a class called BankAccount
with private instance variables accountNumber and balance.
Provide public getter and setter methods to access and modify
these variables.
*/

public class app {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(3241, 140);
        BankAccount bankAccount2 = new BankAccount();
        bankAccount.status();
        bankAccount2.status();
    }
}
