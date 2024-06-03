package com.gnmuthu.librarymanagement;

import java.io.IOException;

public class LibraryManagement {
    public static void main(String[] args) throws IOException {
        BookEntry be = new BookEntry();
        UserEntry ue =new UserEntry();
        be.getBookDetails();
        be.displayBookDetails();
        ue.getUserDetails();
        ue.displayUserDetails();
    }
}
