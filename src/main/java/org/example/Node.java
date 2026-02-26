package org.example;

import java.util.List;
import java.util.ArrayList;

class Node<T> {
    T val;
    Node<T> left;
    Node<T> right;

    Node(T val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
class Source {
    public static void run() {
        // this function behaves as `main()` for the 'run' command
        // you may sandbox in this function , but should not remove it
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");

        a.left = b;
        a.right = c;

        System.out.println(a.left.val);


    }
}

