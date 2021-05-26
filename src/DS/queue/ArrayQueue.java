package DS.queue;

interface Queue{
    boolean isEmpty();
    boolean isFull();
    void clear();
    void enqueue(int value);
    int peek();
    int dequeue();
}


public class ArrayQueue implements Queue{

    private int queueSize;
    private int front;
    private int rear;
    private int queueArr[];

    public ArrayQueue(int queueSize) {
        this.queueSize = queueSize;
        front = -1;
        rear = -1;
        queueArr = new int[queueSize];
    }

    @Override
    public boolean isEmpty() {

        if(front == rear){
            front = rear = -1;
        }
        return (front == rear); // 같은 상태 포인터가 움직이지 않음
    }

    @Override
    public boolean isFull() {
        return (rear == this.queueSize-1);
    }
    
    @Override
    public void clear() {
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }else {
            front = rear = -1;
            queueArr = new int[queueSize];
            System.out.println("Queue is Cleared");
        }
    }

    @Override
    public void enqueue(int value) {
        if(isFull()){
            System.out.println("Queue is full");
        }else{
            queueArr[++rear] = value;
            System.out.println("Inserted item : "+value);
        }
    }

    @Override
    public int peek() {
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return 0;
        }else{
            System.out.println("Peeked item : "+queueArr[front+1]);
            return queueArr[front+1];
        }
    }

    @Override
    public int dequeue() {
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return 0;
        }else{
            System.out.println("Deleted Item : " + queueArr[front+1]);
            front = (front + 1) % queueSize;
            return queueArr[front];
        }
    }

    public void printQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }else{
            System.out.print("Queue is elements : ");
            for (int i = front +1 ; i<=rear; i++){
                System.out.print(queueArr[i]+ " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int queueSize = 5;
        ArrayQueue arrQueue = new ArrayQueue(queueSize);

        arrQueue.enqueue(1);
        arrQueue.printQueue();

        arrQueue.enqueue(2);
        arrQueue.printQueue();

        arrQueue.enqueue(3);
        arrQueue.printQueue();

        arrQueue.enqueue(4);
        arrQueue.printQueue();

        arrQueue.enqueue(5);
        arrQueue.printQueue();

        arrQueue.dequeue();
        arrQueue.printQueue();

        arrQueue.dequeue();
        arrQueue.printQueue();

        arrQueue.dequeue();
        arrQueue.printQueue();

        arrQueue.dequeue();
        arrQueue.printQueue();

        arrQueue.peek();
        arrQueue.printQueue();

        arrQueue.clear();
        arrQueue.printQueue();

    }
}
