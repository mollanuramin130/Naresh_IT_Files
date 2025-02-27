package com.nur.Exam;

import java.util.Scanner;

public class LibrarySystemELC {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        String bookTitle=sc.nextLine();
        String bookAuthor=sc.nextLine();
        double bookPrice=sc.nextDouble();
        boolean isAvail=sc.nextBoolean();

        LibraryService obj = new LibraryService(bookTitle,bookAuthor,bookPrice,isAvail);
        System.out.println("Before Update:\n=========================");
        obj.details();

        double upPrice=sc.nextDouble();
        obj.setBookPrice(upPrice);
        boolean upIsAvailable=sc.nextBoolean();
        obj.setIsAvailable(upIsAvailable);

        System.out.println("Before Update:\n=========================");
        obj.details();


    }
}

class LibraryService{
    private String bookTitle;
    private String bookAuthor;
    private double bookPrice;
    private boolean isAvail;

    LibraryService(String bookTitle,String bookAuthor,double bookPrice,boolean isAvail){
        this.bookTitle=bookTitle;
        this.bookAuthor=bookAuthor;
        this.bookPrice=bookPrice;
        this.isAvail=isAvail;
    }

    public void setBookTitle(String upTitle){
        bookTitle=upTitle;
    }
    public void setBookAuthor(String upAuthor){
        bookAuthor=upAuthor;
    }
    public void setBookPrice(double upPrice){
        bookPrice=upPrice;
    }
    public void setIsAvailable(boolean upIsAvailable){
        isAvail=upIsAvailable;
    }

    public void details(){
        System.out.println("Title: "+bookTitle+"\nAuthor: "+bookAuthor+"\nPrice: "+bookPrice+"\nAvailable: "+isAvail);
    }
}