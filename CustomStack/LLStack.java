package CustomStack;

public class LLStack {
    SingleLL ll;

    // SPACE COMPLEXITY is O(1) better than ArrayStack as it takes O(n) Space
    public LLStack() {
        ll = new SingleLL();
    }

    public void push(int item) {
        ll.insertInSLL(item, 0);
    }

    private boolean isEmpty() {
        return ll.head == null;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty!");
        }
        int res =  ll.head.value;
        ll.deletenode(0);
        return res;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty!");
        }
        return ll.head.value;
    }
    public void deleteStack(){
        ll.head = null;
        System.out.println("Stack is DELETED!");
    }
}

