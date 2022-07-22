package CustomStack;

public class SingleLL{
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLL(int nodevalue){
        head = new Node();
        Node node = new Node(nodevalue);
        node.next=null;
        head=node;
        tail=node;
        size=1;
        return head;
    }

    public void insertInSLL(int nodevalue, int location){
        Node node = new Node(nodevalue);

        //if ll is empty
        if(head==null){
            createSinglyLL(nodevalue);
            return;
        }
        //inserting at first position
        else if(location==0){
            node.next=head;
            head=node;
        }
        //inserting at last
        else if(location>=size){
            node.next=null;
            tail.next=node;
            tail=node;
        }
        // else inserting in anywhere between

        else{
            Node tempnode = head;
            for(int i=0; i<location-1;i++){
                tempnode=tempnode.next;
            }
            Node nextnode = tempnode.next;
            tempnode.next=node;
            node.next=nextnode;
        }
        size++;


    }

    public void display(){
        if(head==null){
            System.out.println("SLL does not exist.");
            return;
        }
        else{
            Node tempnode = head;
            for(int i=0; i<size;i++){
                System.out.print(tempnode.value+" -> ");
                tempnode=tempnode.next;
            }
            System.out.println("END");
        }
    }

    public boolean search(int target){
        if(head==null)
            return false;
        else{
            Node temp = head;
            for(int i=0; i<size;i++){
                if(temp.value==target)
                    return true;
                temp=temp.next;
            }
        }
        return false;
    }

    public void deletenode(int location){
        if(head==null) {
            System.out.println("The SLL does not exist");
            return;
        }
        //if there's only one node delete it and assign head and tail both to null
        if(size==1){
            head=null;
            tail=null;
            size--;
            return;
        }
        if(location==0 && size>1) {
            head = head.next;
            size--;
        }
        //deleting last node
        else if(location>=size){
            Node temp = head;
            for(int i=0; i<size-1;i++){
                temp = temp.next;
            }
            temp.next=null;
            tail=temp;
            size--;
        }
        //deleting any given node
        else{
            Node temp = head;
            for(int i=0; i<location-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            size--;
        }
    }


}
