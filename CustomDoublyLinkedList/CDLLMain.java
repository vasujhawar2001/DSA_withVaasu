package CustomDoublyLinkedList;

public class CDLLMain {
    public static void main(String[] args) {
        CircularDLL CDLL = new CircularDLL();
        CDLL.createCDLL(1);

        //System.out.println(CDLL.head.value);

        CDLL.insertCDLL(5,2);
        CDLL.insertCDLL(8,1);
        CDLL.insertCDLL(15,0);
        CDLL.insertCDLL(-20,5);


        CDLL.insertCDLL(99,0);
        CDLL.display();
        //System.out.println(DLL.head.value);
        CDLL.deletenode(0);
        CDLL.display();

//        CDLL.deletenode(2);
//        CDLL.display();
//
//        CDLL.deletenode(3);
//        CDLL.display();

        //System.out.println(CDLL.search(-20));

        System.out.println(CDLL.tail.next.value);
        System.out.println(CDLL.head.prev.value);
    }
}
