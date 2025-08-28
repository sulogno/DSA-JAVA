import java.util.Stack;


public class Main {

    public static void main(String[] args){
        Stack<String> stack = new Stack<String>();
        stack.push("Minecraft");
        stack.push("VAlorant");
        stack.push("Fallguys");
        stack.push("Clash of Clans");

        stack.pop();//remove the top most object

       System.out.println(stack);

    }
}