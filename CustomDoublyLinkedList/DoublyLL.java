package CustomDoublyLinkedList;

import CustomLinkedList.Node;

public class DoublyLL {

    public Dnode head;
    public Dnode tail;
    public int size;

    public DoublyLL(){
        this.size=0;
    }

    public Dnode createDLL(int nodevalue){
        head = new Dnode();
        Dnode node = new Dnode(nodevalue);
        node.next=null;
        node.prev=null;
        head=node;
        tail=node;
        size=1;
        return head;
    }

    public Dnode insertDLL(int nodevalue, int location){
        Dnode node = new Dnode(nodevalue);
        if(head==null){
            createDLL(nodevalue);
            return head;
        }
        if(location==0){
            head.prev= node;
            node.next=head;
            node.prev=null;
            head= node;
            size++;
        }
        else if(location>=size){
            Dnode temp = head;
            for(int i=0; i<size-1;i++){
                temp = temp.next;
            }
            temp.next=node;
            node.prev=temp;
            node.next=null;
            tail=node;
            size++;
        }
        //at any given location
        else{
            Dnode temp = head;
            for(int i=0; i<location-1;i++){
                temp = temp.next;
            }
            Dnode nextnode =temp.next;
            node.next=nextnode;
            temp.next=node;
            node.prev=temp;
            nextnode.prev=node;
            size++;
        }
        return head;
    }

    public void display(){
        if(head==null){
            System.out.println("DLL does not exist.");
            return;
        }
        else{
            Dnode tempnode = head;
            System.out.print("START <- ");
            for(int i=0; i<size;i++){
                if(i==size-1)
                    System.out.print(tempnode.value+" -> ");
                else
                    System.out.print(tempnode.value+" <-> ");
                tempnode=tempnode.next;
            }
            System.out.println("END");
        }
    }

    public void deletenode(int location){
        if(head==null) {
            System.out.println("DLL does not exist.");
            return;
        }
        if(size==1){
            head=null;
            tail=null;
            size--;
            return;
        }
        if(location==0 && size>1){
            head=head.next;
            head.prev=null;
            size--;
        }
        //delete last node
        else if(location>=size-1){
            Dnode temp = head;
            for(int i=0;i<size-2;i++){
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;
            size--;
        }
        // delete in between
        else{
            Dnode temp = head;
            for(int i=0;i<location-1;i++){
                temp=temp.next;
            }
            Dnode nextnode = temp.next;
            temp.next=nextnode.next;
            nextnode.next.prev=temp;
            size--;
        }
    }

    public boolean search(int target){
        if(head==null)
            return false;
        else{
            Dnode temp = head;
            for(int i=0; i<size;i++){
                if(temp.value==target)
                    return true;
                temp=temp.next;
            }
        }
        return false;
    }

}
