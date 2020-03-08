//Sagar Patel, CSCI 1660, 2/29/2020, Exercise 8


package com.company.Patel;


public class Main {

    public static void main(String[] args) {

        ContactInfo normalContact = new ContactInfo("Sagar", "083401@swcsd.us");
        BusinessContacts busContact = new BusinessContacts("Gaige", "119770@swcsd.us", 1110002222);
        ContactInfo normalContact2 = new ContactInfo("Tanner", "039480@swcsd.us");

       Collection collection = new Collection();
       collection.addContact(normalContact);
       collection.addContact(busContact);
        collection.addContact(normalContact2);

       collection.displayInfo();




    }
}
