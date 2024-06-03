package com.gnmuthu.librarymanagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserEntry {
    private String userName,gender, department;
    UserEntry()
    {
        userName = null;
        gender = null;
        department = null;
    }

    public void getUserDetails()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter User Details");
        System.out.println("Enter the User's Name:");
        userName = br.readLine();
        System.out.println("Enter Gender:");
        gender = br.readLine();
        System.out.println("Enter Department:");
        department = br.readLine();
    }

    public void displayUserDetails()
    {
        System.out.println("User's Name\t:"+userName+"\nGender\t:"+gender+"\nDepartment\t:"+department);
    }
}
