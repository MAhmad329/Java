package Practice;
import java.io.*;
import java.util.Date;


import java.util.Scanner;
import java.util.Date;
public class TestTextIO {
    public static void main(String[]args){
        try{
            /*Scanner inp = new Scanner(System.in);
            PrintWriter output = new PrintWriter("temp.txt");
            String in = new String();
            in = inp.nextLine();
            output.write(in);
            output.write((40));
            
            output.close();

            Scanner input = new Scanner(new File("temp.txt"));
            System.out.println(input.nextLine());

            input.close();
            //Byte[] b1 = new Byte[3];
           */
            /*FileOutputStream out = new FileOutputStream("MyFile.dat");
            for(int i = 1;i<=10;i++){
                out.write(i);
            }
            out.close();

            FileInputStream input = new FileInputStream("MyFile.dat");
            System.out.print(input.available()+" ");
            int value = -1;
            input.skip(4);
            while((value=input.read())!=-1){
                System.out.print(value+" ");
            }
            input.close();
            System.out.print(input.markSupported());
*/
            
 /*           DataOutputStream out = new DataOutputStream(new FileOutputStream("Myfilterfile.dat"));
            out.writeUTF("Ali");
            out.writeDouble(13.7);
            out.writeUTF("Ahmad");
            out.writeDouble(17);
            out.writeUTF("Saba");
            out.writeDouble(20.4);
            out.close();

            try{
                DataInputStream input = new DataInputStream(new FileInputStream("Myfilterfile.dat"));
                while(true){
                    System.out.println(input.readUTF()+"\t"+input.readDouble());
                }
            }
            catch(EOFException E){
                System.out.print("End of File");

            }*/
            Book b1 = new Book();
            Book b2 = new Book();
            Book b3 = new Book();
            Book b4 = new Book();
            Book b5 = new Book();
            b1.readData();
            b2.readData();
            b3.readData();
            b4.readData();
            b5.readData();
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("BookStore.dat"));
           // out.writeUTF("ABC");
           // out.writeDouble(12.5);
           // out.writeObject(new Date());
           // out.writeObject(p);;
            out.writeObject(b1);
            out.writeObject(b2);
            out.writeObject(b3);
            out.writeObject(b4);
            out.writeObject(b5);
            out.close();

            try{
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("BookStore.dat"));
            //System.out.print(input.readUTF());
            //System.out.print("\t"+input.readDouble());
            //System.out.print("\t "+((Date)(input.readObject())).toString());
            while(true){
            System.out.print("\t"+((Book)(input.readObject())).toString());
            }
        }
            catch(EOFException ef){
                System.out.print("\nEnd of file");
            }
            
            try{
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("BookStore.dat"));
            
            
           
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the name of book to search: ");
            String search = in.next();
            while(true){
            Book bookread = (Book)input.readObject();
            if(bookread.title.equals(search)){
                System.out.print(bookread.title);
                break;
            }
            }
            
    }
            catch(EOFException ef){
                System.out.print("End Of File");
            }

            
            
        
    }
        catch(Exception e){
            System.out.print("Exception Caught!");
            System.out.print(e.toString());
        }
    }
}
