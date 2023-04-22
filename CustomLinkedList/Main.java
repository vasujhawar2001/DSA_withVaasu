package CustomLinkedList;

public class Main {
    public static void main(String[] args) {
        SingleLL sll = new SingleLL();
        sll.createSinglyLL(1);
        sll.insertInSLL(2,0);
        sll.insertInSLL(3,5);
        sll.insertInSLL(4,2);

        //System.out.println(sll.head.next.next.value);
        sll.display();
        System.out.println(sll.search(3));
        sll.deletenode(3);
        sll.display();
        sll.deletenode(2);
        sll.display();


    }
}
