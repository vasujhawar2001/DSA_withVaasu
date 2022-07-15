package CustomDoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLL DLL = new DoublyLL();
        DLL.createDLL(1);

        //System.out.println(DLL.head.value);

        DLL.insertDLL(5,2);
        DLL.insertDLL(8,1);
        DLL.insertDLL(15,0);
        DLL.insertDLL(-20,5);


        DLL.insertDLL(99,0);
        DLL.display();
        //System.out.println(DLL.head.value);
        DLL.deletenode(0);
        DLL.display();

        DLL.deletenode(2);
        DLL.display();

        DLL.deletenode(3);
        DLL.display();

        System.out.println(DLL.search(-20));

        System.out.println(DLL.tail.value);
    }
}
