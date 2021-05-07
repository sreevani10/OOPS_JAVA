package com.company;
class Books {
    String title;
    String author;
}
 class BooksTestdrive{
     public static void main(String[] args) {
         Books[] mybooks = new Books[3];
         int x=0;
         mybooks[0] = new Books();
         mybooks[1] = new Books();
         mybooks[2] = new Books();
         mybooks[0].title = "Dear Comrade";
         mybooks[1].title = "One Indian Girl";
         mybooks[2].title = "Love Story";
         mybooks[0].author = "PRKR";
         mybooks[1].author = "Sreevani";
         mybooks[2].author = "Abhi";
         while(x<3){
             System.out.print(mybooks[x].title);
             System.out.print(" by ");
             System.out.print(mybooks[x].author);
             System.out.println("");
             x = x + 1;
         }
     }
}

