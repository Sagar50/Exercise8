//Sagar Patel, CSCI 1660, 2/29/2020, Exercise 8


package com.company.Patel;

import java.util.ArrayList;


public class Collection {
    ArrayList<ContactInfo> contactInfoArrayList = new ArrayList<>();

    public Collection(){
    }

    public void addContact(ContactInfo s){
        contactInfoArrayList.add(s);
    }
    public void displayInfo() {
        for (ContactInfo contactInfo : contactInfoArrayList) {
            contactInfo.displayInfo();
        }


    }
}