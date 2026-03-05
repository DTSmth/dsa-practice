package org.example;

import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Queue;

class Node<T> {
    T val;
    Node<T> left;
    Node<T> right;

    public Node(T val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class Source {
    public static List<String> breadthFirstValues(Node<String> root) {
        if (root == null) {
            return List.of();
        }
        Queue<Node<String>> queue = new ArrayDeque<>();
        queue.add(root);
        List<String> values = new ArrayList<>();
        while (!queue.isEmpty()) {
            Node<String> node = queue.remove();
            values.add(node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return values;
    }

    public static void run() {

    }
}


