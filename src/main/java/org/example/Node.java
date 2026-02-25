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
    public static <T> Node<T> zipperLists(Node<T> head1, Node<T> head2) {
        Node<T> head = head1;
        Node<T> tail = head;
        Node<T> current1 = head1.next;
        Node<T> current2 = head2;
        int count = 0;

        while (current1 != null && current2 != null) {
            if (count % 2 == 0) {
                tail.next = current2;
                current2 = current2.next;
            } else {
                tail.next = current1;
                current1 = current1.next;
            }
            tail = tail.next;
            count += 1;
        }

        if (current1 != null) {
            tail.next = current1;
        }
        if (current2 != null) {
            tail.next = current2;
        }

        return head;
    }



    public static void run() {
        // this function behaves as `main()` for the 'run' command
        // you may sandbox in this function , but should not remove it
    }
}

