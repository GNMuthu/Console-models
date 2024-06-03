package com.gnmuthu.librarymanagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BookEntry {
    private String bookTitle, bookAuthor, bookPublication;
    private int bookPageCount;
    private double bookPrice;
    BookEntry(){
        bookTitle=null;
        bookAuthor=null;
        bookPublication=null;
        bookPrice=0.0;
        bookPageCount=0;
    }
    public void getBookDetails()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter follwing Details about Books");
        System.out.println("Enter the Book Title:");
        bookTitle = br.readLine();
        System.out.println("Enter Author name:");
        bookAuthor = br.readLine();
        System.out.println("Enter Publisher name:");
        bookPublication = br.readLine();
        System.out.println("Enter Price amount:");
        bookPrice = Double.parseDouble(br.readLine());
        System.out.println("Enter Total page count:");
        bookPageCount = Integer.parseInt(br.readLine());
    }
    public void displayBookDetails()
    {
        System.out.println("Book Title\t:"+bookTitle+"\nAuthor Name\t:"+bookAuthor+"\nPublication name\t:"+bookPublication+"\nPrice\t:"+bookPrice+"\nPage count\t:"+bookPageCount);
    }
}
