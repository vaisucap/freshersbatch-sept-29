package com.corejava.oops;
import java.util.Scanner;

public class LoginID {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your login name: ");

        String loginName = sc.nextLine();

        System.out.print("Enter your password: ");

        String password = sc.nextLine();

        int attempts = 0;

        while (!loginName.equals("admin") || !password.equals("123456")) {

            if (attempts == 2) {

                System.out.println("Contact Admin");

                System.exit(0);
            }

            System.out.println("Invalid login name or password");

            System.out.print("Enter your login name: ");

            loginName = sc.nextLine();

            System.out.print("Enter your password: ");

            password = sc.nextLine();

            attempts++;
        }

        System.out.println("Welcome, " + loginName);
    }
}
