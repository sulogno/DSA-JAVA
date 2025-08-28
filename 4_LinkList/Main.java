import java.util.*;
public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<String>();
        linkedlist.push("A");
        linkedlist.push("B");
        linkedlist.push("C");
        linkedlist.push("D");
        linkedlist.push("E");
        linkedlist.push("F");
        linkedlist.add(0,"G");



        System.out.println(linkedlist);
        // linkedlist.pop();
        System.out.println(linkedlist.peekFirst());
        System.out.println(linkedlist.peekLast());

    }
    
}
