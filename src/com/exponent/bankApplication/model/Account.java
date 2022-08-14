package com.exponent.bankApplication.model;

public class Account {

    private String name;

    private long adharCardNumber;

    private String panNumber;

    private String address;

    private long mobileNo;

    private long accNo;

    private double accBalance;

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", adharCardNumber=" + adharCardNumber +
                ", mobileNo=" + mobileNo +
                ", accNo=" + accNo +
                ", accBalance=" + accBalance +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAdharCardNumber() {
        return adharCardNumber;
    }

    public void setAdharCardNumber(long adharCardNumber) {
        this.adharCardNumber = adharCardNumber;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public long getAccNo() {
        return accNo;
    }

    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }


}
