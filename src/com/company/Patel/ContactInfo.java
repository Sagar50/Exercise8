//Sagar Patel, CSCI 1660, 2/29/2020, Exercise 8

package com.company.Patel;

public class ContactInfo {
    String name;
    String email;

    public ContactInfo(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public ContactInfo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void displayInfo(){
        System.out.println("The name of the person is: " + name + " | The email is: " + email + ".");
    }
}
