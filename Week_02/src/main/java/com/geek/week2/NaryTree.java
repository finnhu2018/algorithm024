package com.geek.week2;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class NaryTree {
    public List<Integer> preorder(Node root) {
        LinkedList<Node> list = new LinkedList<>();
        List<Integer> result = new LinkedList<>();
        if(root ==null){
            return result;
        }
        list.add(root);
        while (!list.isEmpty()){
            Node node = list.pollLast();
            result.add(node.val);
            Collections.reverse(node.children);
            for(Node temp : node.children){
                list.add(temp);
            }
        }

        return result;
    }

}

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};


