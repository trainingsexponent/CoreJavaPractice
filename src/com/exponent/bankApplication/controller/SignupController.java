package com.exponent.bankApplication.controller;

import com.exponent.bankApplication.service.RBI;
import com.exponent.bankApplication.serviceImpl.SBI;

import java.util.Scanner;

public class AdminController {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        RBI rbi = new SBI();

        System.out.println("Bank application started.....");
        boolean flag = true;
            while(flag){
            System.out.println("1. Create Bank Account");

            System.out.println("2. Show Account Details");

            System.out.println("3. Show Account Balance ");

            System.out.println("4.  Withdraw Money");

            System.out.println("5. Deposit Money");

            System.out.println("6. Update Account Details ");

            System.out.println("7. Exit Application.");

            System.out.println("Select Your choice from above : ");
            int ch = sc.nextInt();

            switch(ch) {

                case 1:
                    rbi.registerAccount();
                    break;

                case 2:
                    rbi.showAccountDetails();
                    break;

                case 3:
                    break;

                case 7:
                    flag =false;
                    break;


            }
            }

        System.out.print("Application terminated successfully ...");
    }
}
