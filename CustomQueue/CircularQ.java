package CustomQueue;

public class CircularQ {
    protected Integer[] data;
    private static final int DEFAULT_SIZE = 10;
    int start;
    int end;
    int size;

    public CircularQ() {
        this.size=DEFAULT_SIZE;
        this.start=-1;
        this.end=-1;
    }

    public CircularQ(int size) {
        this.data = new Integer[size];
        this.start=-1;
        this.end=-1;
        this.size=size;
    }

    private boolean isEmpty() {
        return end == -1;
    }

    private boolean isFull(){
        if(start==0 && end==data.length-1 || end+1==start)
            return true;
        else
            return false;
    }

    public void deleteCircularQ(){
        data = null;
        System.out.println("CIRCULAR QUEUE DELETED");
    }

    public void enQueue(int item) throws Exception {
        if(isFull()){
            throw new Exception("Circular Queue is Full!");
        }
        else if(isEmpty()){
            start=0;
            end++;
            data[end]=item;
        }
        else{
            if(end==size-1)
                end=0;
            else
                end++;
            data[end]=item;
        }
        return;
    }

    public int deQueue() throws Exception {
        if(isEmpty()){
            throw  new Exception("Circular Queue is Empty!");
        }
            int res = data[start];
            data[start] = null;
            if (start==end) {
                start = -1;
                end = -1;
            }
            else if(start==size-1){
                start=0;
            }
            start++;
        return res;
    }

    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is Empty!");
        }
        return data[start];
    }


}
