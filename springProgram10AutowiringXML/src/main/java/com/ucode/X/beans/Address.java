package com.ucode.X.beans;

public class Address {
    private int houseNo;
    private String city;
    private int pinCode;

    public Address() {
    }

    public Address(int houseNo, String city, int pinCode) {
        this.houseNo = houseNo;
        this.city = city;
        this.pinCode = pinCode;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNo=" + houseNo +
                ", city='" + city + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}
