package com.avanseus.test;

/**
 * Created by madan on 25/7/18
 */
public class BTNode {
    BTNode left,right;
    int data;

    public BTNode() {
        this.left = null;
        this.right = null;
        this.data = 0;
    }

    public BTNode(int n) {
        this.left = null;
        this.right = null;
        this.data = n;
    }

    public BTNode(BTNode left, BTNode right, int data) {
        this.left = left;
        this.right = right;
        this.data = data;
    }

    public BTNode getLeft() {
        return left;
    }

    public void setLeft(BTNode left) {
        this.left = left;
    }

    public BTNode getRight() {
        return right;
    }

    public void setRight(BTNode right) {
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
