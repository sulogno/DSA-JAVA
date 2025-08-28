import java.util.LinkedList;
import java.util.Queue;


public class Main {
    public static void main(String[] args){
        Queue<String> queue = new LinkedList<String>();
        queue.offer("Rishita");
        queue.offer("Rumjhum");
        queue.offer("Rhit");
        queue.offer("Sulogno");


        System.out.println(queue.isEmpty());
        System.out.println(queue.size());

        System.out.println(queue);
        System.out.println(queue.peek());
        
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.peek());


    }
}
