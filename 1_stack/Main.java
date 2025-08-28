import java.util.Stack;


public class Main {

    public static void main(String[] args){
        Stack<String> stack = new Stack<String>();
        stack.push("Minecraft");
        stack.push("VAlorant");
        stack.push("Fallguys");
        stack.push("Clash of Clans");

        // stack.pop();//remove the top most object
        // String myfav_game = stack.pop();
        // System.out.println(myfav_game);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.search("VAlorant"));


       

    }
}