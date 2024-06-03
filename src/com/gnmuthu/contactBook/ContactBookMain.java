package com.gnmuthu.contactBook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class ContactBookMain {
    public static void main(String[] args)throws IOException {
        int userOption;

        System.out.println("Enter the Option what you want from the List:");
        System.out.println("1. Add new Contact");
        System.out.println("2. Edit Contact");
        System.out.println("3. Search Contact");
        System.out.println("4. Delete Contact");
        System.out.println("0. Exit");
        System.out.println("Your operation please:");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        userOption = Integer.parseInt(br.readLine());

            switch (userOption) {
                case 1:
                    AddContact.addContact();
                    break;
                case 2:
                    EditContact.editContact();
                    break;
                case 3:
                    SearchContact.searchContact();
                    break;
                case 4:
                    DeleteContact.deleteContact();
                    break;
                default:
                    System.out.println("No option available for your entry");
                    break;
            }

    }
}
