import java.util.Stack;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {

    // ARRAYS (50 points)
    System.out.println("======================================================");
    char[] array = new char[9];  
         array[0] = 'H';  
         array[1] = 'E';  
         array[2] = 'R';  
         array[3] = 'M';  
         array[4] = 'O';
         array[5] = 'S';  
         array[6] = 'U';  
         array[7] = 'R';  
         array[8] = 'A';    
    
         for (int i=0; i<array.length; i++) {  
            System.out.println(array[i]);  
            }  
    System.out.println();

    char[] name = {'H', 'E', 'R', 'M', 'O', 'S', 'U', 'R', 'A'};
    int i = name.length - 1, j = 0;
    char[] let = new char[name.length];
    while(i >= 0){
    let[j] = name[i]; i--; j++; }
        for (char c : let){
            System.out.println(c);
         }

        
   
   

    // LINKED LIST (25 points)
    System.out.println("======================================================");
    // 1. Create a Linked list of the last six numbers of your STUDENT NUMBER.
    LinkedList<String> sNum = new LinkedList<>();

         sNum.add("1");
         sNum.add("0");
         sNum.add("4");
         sNum.add("7");
         sNum.add("6");
         sNum.add("7");

    // 2. Add an asterisk (*) to the head/front of the Linked list.
         sNum.addFirst("*");
    // 3. Add an asterisk (*) to the tail/end of the Linked list.
         sNum.addLast("*");
    // 4. Display the Linked list.
         System.out.println(sNum);
    // 5. Display the last character of the Linked list.
         System.out.println(sNum.getLast());
    // 6. Replace the last character of the Linked list with the exclamation symbol (!).
         sNum.set(7, "!");
    // 7. Remove the first character of the Linked list.
         sNum.remove(0);
    // 8. Display the LinkedList.
        System.out.println("STUDENT NUMBER: " + sNum);
   
   
    // STACK (25 points)
    System.out.println("======================================================");
    // 1. Create a Stack of characters of your SURNAME.
    Stack stack = new Stack();

    stack.push("H");
    stack.push("E");
    stack.push("R");
    stack.push("M");
    stack.push("O");
    stack.push("S");
    stack.push("U");
    stack.push("R");
    stack.push("A");

    Stack stack2 = new Stack();
    stack2.push("INF214");

    Stack stack3 = new Stack();
    stack3.push("CCDATRCL-INF214");

    System.out.println(stack);
    System.out.println(stack2);
    System.out.println(stack3);
  
}
    

    }
