package DataStructures.LinkedLists;

class DoublyLinkedList {
    static class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head;  
    private Node tail;  

    
    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {  
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertFront(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void delete(int data) {
        if (head == null) return;

        Node current = head;

        while (current != null && current.data != data) {
            current = current.next;
        }

        if (current == null) return;

        if (current == head) {
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null; 
        } else if (current == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    public void printForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void printBackward() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertEnd(10);
        dll.insertEnd(20);
        dll.insertEnd(30);
        dll.insertFront(5);

        System.out.print("Forward: ");
        dll.printForward();  

        System.out.print("Backward: ");
        dll.printBackward();

        dll.delete(20);
        System.out.print("After deleting 20: ");
        dll.printForward();
    }
}

