package DataStructures.Stack;

public class StackArray {
    public static void main(String[] args){
        int[] stack = new int[5];

        Stack opStack = new Stack(stack);
        opStack.push(5);
        opStack.push(2);

    }
}
class Stack{

    int[] stack;
    int top = -1;
    int size;

    Stack(int[] stack){
        this.stack = stack;
        this.size = stack.length - 1;
    }

    public void push(int num){
        if (!isFull()){
            top++;
            stack[top] = num;  
        }
        else{
            System.out.println("Stack is Full");
        }
    }

    public void pop(){
        if(!isEmpty()){
            top--;
        }
        else{
            System.out.println("Stack is Empty");
        }

    }
    public int peek(){
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack is Empty");
            return -1;
    }
    }

    public boolean isEmpty(){
        if (top == -1) {
            return true;
        }
        else{
            return false;
        }  
    }
    public boolean isFull(){
        if (top == size) {
            return true;
        }
        else{
            return false;
        }     
    }
    public void display() {
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}
