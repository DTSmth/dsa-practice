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

        return zipperLists(head1, head2, 0);
    }

    public static <T> Node<T> zipperLists(Node<T> head1, Node<T> head2, int count) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        if (count % 2 == 0) {
           head1.next = zipperLists(head1.next, head2, count += 1);
           return head1;
        } else {
            head2.next = zipperLists(head1, head2.next, count += 1);
            return head2;
        }
    }

    public static void run() {
        // this function behaves as `main()` for the 'run' command
        // you may sandbox in this function , but should not remove it
    }
}

