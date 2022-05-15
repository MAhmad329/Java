package Practice;
import java.util.Scanner;

import Practice.Book;
public class TestBook {
    public static void main(String[]args){

        Book bk[] = new Book[3];
        
        for (int i = 0; i<bk.length; i++){
            bk[i] = new Book();
            bk[i].readData();}

        /*for (int i = 0; i<bk.length; i++){
            bk[i].showData();}
    
        Book b1 = Book.highestPrice(bk);
        b1.showData();
        
        Book b2 = Book.lowestPrice(bk);
        b2.showData();*/
        
        String search = null; 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the author name to search: ");
        search = input.nextLine();

        Book b3 = Book.find_book_author_name(bk, search);
        if(b3!=null){
            b3.showData();
        }

        System.out.print("Enter the title to search: ");
        search = input.nextLine();
        Book b4 = Book.find_book_title(bk, search);
        if (b4!=null){
            b4.showData();
        }
        

}
}
