//Sagar Patel, CSCI 1660, 2/29/2020, Exercise 8

package com.company.Patel;

public class BusinessContacts extends ContactInfo {
    int contactPhoneNumber;

    public BusinessContacts(String name, String email, int contactPhoneNumber) {
        super(name, email);
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public BusinessContacts() {
    }

    public int getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(int contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }

    @Override
    public void displayInfo() {
        System.out.println("Business Contact for: " + getName() + " | The email is: " +  getEmail()  + " | The phone number is: " + contactPhoneNumber);

    }
}
