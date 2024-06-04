public class stack {
    int size;
    int top;
    int[] array;
    stack(int capacity) {
        top = -1;
        size = capacity;
        array = new int[size];
    }
    boolean isFull(){
        return (top == size-1);
    }
    boolean isEmpty(){
        return (top == -1);
    }

    void push(int item){
        if(isFull()){
            System.out.println("Stack Overflow");

        }else {
            array[top + 1] = item;
            top++;
        }
        void p     op(int item){
            if(isEmpty()){
                System.out.println("Stack Underflow");
            }else {
                top--;
            }
            return array[previousTop];
        }

    }

   
}
