package com.varadhisoft.java.examples3;

class Book{
  
 private  String title;
 private String author;
 private float price;

 void giveDataToBook(String title,String author,float price){
       this.title = title;
       this.author = author;
       this.price = price;
 }

   void giveDataToBook(float price){
       this.price = price;
   }

   void giveDataToBook(String title){
       this.title = title;
     }

  void displayBookDetails(){
   System.out.println(title+":"+author+":"+price);
  }

}  // Book

public class MethodOverloading{
   
    public static void main(String[] args){
      
         Book b1 = new Book();
         b1.giveDataToBook("Head First Java", "Kathy Sierra", 650.0f);
         b1.displayBookDetails();
         b1.giveDataToBook(540.0f);
         b1.displayBookDetails();
         b1.giveDataToBook("Head First Java, 2nd Edition");
         b1.displayBookDetails();

    }
}