package Practice;

import java.util.ArrayList;

public class GenericStack<T>{
    private ArrayList<T> stack = new ArrayList<>();



   public void push(T t) {
    stack.add(t);
   }
  

   public T pop() {
   T t = stack.get(getSize()-1);
   stack.remove(getSize()-1);
   return t;
   }
  

   public T peek() {
   return stack.get(getSize()-1);
   }
  
  
   public boolean empty() {
   return stack.isEmpty();
   }

   public int getSize() {
   return stack.size();
   }

   public String toString(){
       return stack.toString();
   }
   }