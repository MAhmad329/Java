
package Practice;

public class TestGenericStack {
    public static void main(String[]args){

        GenericStack<Object> l1 = new GenericStack<Object>();

        l1.push(1);
        l1.push("t");
        System.out.println(l1.pop());

        System.out.println(l1.toString());

        

    }
}
