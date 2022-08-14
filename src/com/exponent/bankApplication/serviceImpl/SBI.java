package com.exponent.bankApplication.serviceImpl;

import com.exponent.bankApplication.model.Account;
import com.exponent.bankApplication.service.RBI;

import java.util.Scanner;

public class SBI implements RBI {

    Account ac = new Account();

    Scanner sc = new Scanner(System.in);

    @Override
    public void registerAccount() {
        System.out.println("Inside Register account");

        System.out.println("Enter your Name: ");
        String name = sc.next();
        ac.setName(name);

        System.out.println("Enter adhar Number: ");
        long adharNum = sc.nextLong();
        ac.setAdharCardNumber(adharNum);

        System.out.println("Enter PanCard Number: ");
        ac.setPanNumber(sc.next());

        System.out.println("Enter your Address: ");
        ac.setAddress(sc.next());

        System.out.println("Enter Mobile Number: ");
        ac.setMobileNo(sc.nextLong());

        System.out.println("Enter account Number: ");
        ac.setAccNo(sc.nextLong());

        System.out.println("Enter account balance: ");
        ac.setAccBalance(sc.nextDouble());
    }

    @Override
    public void showAccountDetails() {
        System.out.println("Inside showAccountDetails ");

        /*System.out.println("Account Details , Name: "+ac.getName()+ "  Acc Number :"+ac.getAccNo()
        +" Pan Number: "+ac.getPanNumber());
*/
        System.out.println(ac);
    }

    @Override
    public void showAccountBalance() {
        System.out.println("Inside showAccountBalance ");
        System.out.println("Your Account Balance is : "+ac.getAccBalance());
    }

    @Override
    public void withdrawMoney() {

    }

    @Override
    public void depositMoney() {

    }

    @Override
    public void updateAccountDetails() {

    }
}
