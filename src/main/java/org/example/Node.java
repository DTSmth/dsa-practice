package org.example;

import java.util.List;
import java.util.ArrayList;

class Node<T> {
    T val;
    Node<T> next;

    public Node(T val) {
        this.val = val;
        this.next = null;
    }
}

class Source {
    public static void linkedListValues(Node<String> head, List<String> values) {
        // todo
        if (head == null) {
            return;
        }
        values.add(head.val);
        linkedListValues(head.next, values);
    }


    public static List<String> linkedListValues(Node<String> head) {
        List<String> values = new ArrayList<>();
        linkedListValues(head, values);
        return values;
    }

    public static void run() {
        // this function behaves as `main()` for the 'run' command
        // you may sandbox in this function , but should not remove it
    }
}
