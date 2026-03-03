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
        List<String> leftVals = depthFirstValues(root.left);
        List<String> rightVals = depthFirstValues(root.right);

        List<String> result = new ArrayList<>();
        result.add(root.val);
        result.addAll(leftVals);
        result.addAll(rightVals);
        return result;
    }

    public static void run() {
    }
}


