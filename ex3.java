package com.corejava.exhand;
public class ex3
{
    public static void main(String[] args)
    {
        BankAccount Account = new BankAccount();
        Account.deposit(2000);
        Account.withdraw(13000);
        System.out.println(Account.getBalance());
    }
}