import java.util.Stack;

public class MyStack {
    private Stack<String> stack;
    public MyStack(){
        this.stack = new Stack<String>();
    }

    public void pushItem(Integer item){
        if(item == null)
            stack.push("???");
        else
            stack.push(item.toString());
    }

    public void popAndPeek(){
        if(stack.isEmpty())
            stack.push("???");
        System.out.println(stack.peek());
        stack.pop();
    }

}
