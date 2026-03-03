package org.example;

import java.util.List;
import java.util.Stack;
import java.util.ArrayList;

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
    public static List<String> depthFirstValues(Node<String> root) {
        if (root == null) {
            return List.of();
        }
        Stack<Node<String>> stack = new Stack<>();
        stack.push(root);
        List<String> values = new ArrayList<>();
        while (!stack.isEmpty()) {
            Node<String> current = stack.pop();
            values.add(current.val);
            if (current.right != null ) {
                stack.push(current.right);
            }
            if (current.left != null) {
                stack.push(current.left);
            }
        }


        // todo
        return values;
    }

    public static void run() {

    }
}


