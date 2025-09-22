package DataStructures.Queue;

public class QueueArray {
    public static void main(String[] args){
        int[] queue = new int[5];

        Queue q = new Queue(queue);
        q.enqueue(10);
        q.enqueue(20);
        System.out.println(q.peek()); 
        q.dequeue();
        System.out.println(q.peek()); 
        q.display();


    }
}
class Queue {

    int[] queue;
    int front = 0;
    int rear = -1;
    int size;

    Queue(int[] q) {
        this.queue = q;
        this.size = queue.length - 1;
    }

    public void enqueue(int num) {
        if(!isFull()){
            rear++;
            queue[rear] = num;
        }
        else{
            System.out.println("Queue is Full");
            
        }
    }

    public void dequeue() {
        if(!isEmpty()){
            front++;
        }
        else{
            System.out.println("Queue is Empty");
            
        }
    }

    public int peek() {
        if(!isEmpty()){
            return queue[front];
        }
        else{
            System.out.println("Queue is Empty");
            return -1;
        }
    }

    public boolean isEmpty() {
        if(front > rear){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isFull() {
        if(rear == size){
            return true;
        }
        else{
            return false;
        }
    }
    public void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

}
