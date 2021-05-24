package DS.stack;

interface Stack{
    boolean isEmpty();
    boolean isFull();
    void push(int num);
    int pop();
    int peek();
    void clear();
}

public class ArrayStack implements Stack{

    private int top;
    private int stackSize;
    private int stackArr[];

    public ArrayStack(int stackSize) {
        this.top = -1;
        this.stackSize = stackSize;
        stackArr = new int[this.stackSize];
    }
    
    @Override
    public boolean isEmpty() {
        //스택포인터가 -1인 경우 데이터가 없는 상태, true가 아니면 false를 리턴
        return (top==-1);
    }

    @Override
    public boolean isFull() {
        return (top == stackSize -1);
    }

    @Override
    public void push(int num) {
        if(isFull()){
            System.out.println("Stack is Full");
        }else{
            stackArr[++top] = num;
            System.out.println("Inseted num : "+num);
        }
    }

    @Override
    public int pop() {
        if(isEmpty()){
            System.out.println("Deleting fail! Stack is empty!");
            return 0;
        }else{
            System.out.println("Deleted Item : " + stackArr[top]);
            return stackArr[top--];
        }
    }

    @Override
    public int peek() {
        if(isEmpty()){
            System.out.println("Peeking fail! Stack is empty!");
            return 0;
        }else{
            System.out.println("Peeked Item : "+stackArr[top]);
            return stackArr[top];
        }
    }

    @Override
    public void clear() {
        if (isEmpty()){
            System.out.println("Stack is already empty!");
        }else{
            top = -1;
            stackArr = new int[this.stackSize];
            System.out.println("Stack is Clear");
        }
    }

    public void printStack(){
        if (isEmpty()){
            System.out.println("Stack is empty!");
        }else{
            System.out.println("Stack elements : ");
            for (int i : stackArr){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int stackSize = 5;

        ArrayStack arrayStack = new ArrayStack(stackSize);

        arrayStack.push(1);
        arrayStack.printStack();

        arrayStack.push(2);
        arrayStack.printStack();

        arrayStack.push(3);
        arrayStack.printStack();

        arrayStack.pop();
        arrayStack.printStack();

        arrayStack.pop();
        arrayStack.printStack();

        arrayStack.peek();
        arrayStack.printStack();

        arrayStack.clear();
        arrayStack.printStack();
    }
}
