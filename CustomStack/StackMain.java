package CustomStack;

public class StackMain {
    public static void main(String[] args) throws Exception {
//           CustomStack stack = new CustomStack(5);
//           stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        LLStack stack = new LLStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
