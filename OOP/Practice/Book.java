package Practice;

import java.io.Serializable;
import java.util.Scanner;

public class Book implements Serializable {
    protected String title;
    private String author;
    private float price;
    private int pages;

    public Book(){
        title = null;
        author = null;
        price = 0.0f;
        pages = 0;
    }

    public Book(String title, String author, float price, int pages){
        this.title = title;
        this.author = author;
        this.price = price;
        this.pages = pages;
    }

    public void readData(){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Book details!\n");
        System.out.print("\nEnter title: ");
        title = input.nextLine();
        System.out.print("\nEnter author: ");
        author = input.nextLine();
       /* System.out.print("\nEnter price: ");
        price = input.nextFloat();
        System.out.print("\nEnter pages: ");
        pages = input.nextInt();*/
    }

    public void showData(){
        System.out.println("\nBook details:\n");
        System.out.println("Title\tAuthor\tPrice\tPages");
        System.out.println(title + "\t" + author + "\t" + price + "\t" + pages);
    }

    public String toString(){
        return "Title: "+title+"\tAuthor: "+author;
    }

    public static Book highestPrice(Book bk[]){

        float highest_price = bk[0].price;
        int index = 0;

        for(int i=0;i<bk.length;i++){

            if(bk[i].price>highest_price){

                highest_price = bk[i].price;
                index = i;
            }
        }
        return bk[index];

    }

    public static Book lowestPrice(Book bk[]){

        float lowest_price = bk[0].price;
        int index = 0;

        for(int i=0;i<bk.length;i++){

            if(bk[i].price<lowest_price){

                lowest_price = bk[i].price;
                index = i;
            }
        }
        return bk[index];

    }

    public static Book lowestPages(Book bk[]){

        float lowest_pages = bk[0].pages;
        int index = 0;

        for(int i=0;i<bk.length;i++){

            if(bk[i].pages<lowest_pages){

                lowest_pages = bk[i].price;
                index = i;
            }
        }
        return bk[index];

    }

    public static Book highestPages(Book bk[]){

        float highest_pages = bk[0].pages;
        int index = 0;

        for(int i=0;i<bk.length;i++){

            if(bk[i].pages>highest_pages){

                highest_pages = bk[i].price;
                index = i;
            }
        }
        return bk[index];

    }

    public static Book find_book_author_name(Book bk[], String auth){
        
        
        int index = 0;
        String aname = null;
        for (int i = 0;i<bk.length;i++){
            if(bk[i].author.contains(auth)){
                aname = auth;
                index = i;
            }
        }
        if(aname == auth){
            return bk[index];
        }
        else{
            System.out.println("Author not found!");
            return null;
        }
        

            }

    public static Book find_book_title(Book bk[], String titlename){
        
        
        int index = 0;
        String tname = null;
        for (int i = 0;i<bk.length;i++){
            if(bk[i].author.contains(titlename)){
            tname = titlename;
                index = i;
                    }
                }
        if(tname == titlename){
            return bk[index];
            }
        else{
            System.out.println("Title not found!");
            return null;
                }
                
        
    }            
       
        
}






    

