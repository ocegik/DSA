package Recursion;

public class TypesOfRecursion {

    // 1. Tail Recursion (work after recursive call is done)
    static void printTail(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        printTail(n - 1);
    }

    // 2. Head Recursion (work before recursive call returns)
    static void printHead(int n) {
        if (n == 0) return;
        printHead(n - 1);
        System.out.print(n + " ");
    }

    // 3. Tree Recursion (multiple recursive calls)
    static void printTree(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        printTree(n - 1);
        printTree(n - 1);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println("Tail Recursion:");
        printTail(n);
        System.out.println("\nHead Recursion:");
        printHead(n);
        System.out.println("\nTree Recursion:");
        printTree(n);
    }
}

