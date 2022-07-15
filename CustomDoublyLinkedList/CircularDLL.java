package CustomDoublyLinkedList;

public class CircularDLL {
    public Dnode head;
    public Dnode tail;
    public int size;

    public CircularDLL(){
        this.size=0;
    }

    public Dnode createCDLL(int nodevalue){
        head = new Dnode();
        Dnode node = new Dnode(nodevalue);
        node.next=node;
        node.prev=node;
        head=node;
        tail=node;
        size=1;
        return head;
    }

    public Dnode insertCDLL(int nodevalue, int location){
        Dnode node = new Dnode(nodevalue);
        if(head==null){
            createCDLL(nodevalue);
            return head;
        }
        if(location==0){
            head.prev= node;
            node.next=head;
            node.prev=tail;
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
            node.next=head;
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
            System.out.println("CircularDLL does not exist.");
            return;
        }
        else{
            Dnode tempnode = head;
            System.out.print("START <-> ");
            for(int i=0; i<size;i++){
                System.out.print(tempnode.value+" <-> ");
                tempnode=tempnode.next;
            }
            System.out.println("START");
        }
    }

    public void deletenode(int location){
        if(head==null) {
            System.out.println("CircularDLL does not exist.");
            return;
        }
        if(size==1){
            head.next=null;
            head.prev=null;
            head=null;
            tail=null;
            size--;
            return;
        }
        if(location==0 && size>1){
            head=head.next;
            head.prev=tail;
            size--;
        }
        //delete last node
        else if(location>=size-1){
            Dnode temp = head;
            for(int i=0;i<size-2;i++){
                temp=temp.next;
            }
            temp.next=head;
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
