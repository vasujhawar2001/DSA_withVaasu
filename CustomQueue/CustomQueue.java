package CustomQueue;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int start;
    int end;

    public CustomQueue() {
        this(DEFAULT_SIZE);
        this.start=-1;
        this.end=-1;
    }

    public CustomQueue(int size) {
        this.data = new int[size];
        this.start=-1;
        this.end=-1;
    }

    public void enQueue(int item) {
        if(isFull()){
            //double the array size
            int[] temp = new int[data.length*2];
            //copy items in the new temp array

            for(int i=0; i<data.length;i++){
                temp[i]=data[i];
            }
            data = temp;
        }
        else if(isEmpty()){
            start=0;
            end++;
            data[end]=item;
        }
        else{
            end++;
            data[end]=item;
        }
        return;
    }

    public int deQueue() throws Exception {
        if(isEmpty()){
            throw  new Exception("Queue is Empty!");
        }
        int res = data[start];
        start++;
        if(start>end){
            start=-1;
            end=-1;
        }
        return res;
    }

    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is Empty!");
        }
        return data[start];
    }

    private boolean isFull() {
        return end == data.length-1;
    }

    private boolean isEmpty() {
        return start == -1 || start==data.length;
    }

    public void deleteQueue(){
        data = null;
        System.out.println("QUEUE DELETED");
    }
}

