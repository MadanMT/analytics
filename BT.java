package com.avanseus.test;

/**
 * Created by madan on 25/7/18
 */
public class BT {
    BTNode root;

    public BT() {
        root = null;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void insert(int data){
        root = insert(root,data);
    }

    public BTNode insert(BTNode node,int data){
        if (node == null){
            node = new BTNode(data);
        }
        else {
            if (node.getRight() == null){
                node.right = insert(node.right,data);
            }else {
                node.left = insert(node.left,data);
            }
        }
        return node;
    }

    public int countNodes(){
        return  countNodes(root);
    }

    public int countNodes(BTNode node){
        if (node == null){
            return 0;
        }
        else {
            int l =1;
            l+=countNodes(node.getLeft());
            l+=countNodes(node.getRight());
            return l;
        }
    }

    public boolean search(int val){
        return search(root,val);
    }

    public boolean search(BTNode node, int val){
        if (node.getData() == val) return true;
        if (node.getLeft() != null) {
            if (search(node.getLeft(),val)) return true;
        }
        if (node.getRight() != null){
            if (search(node.getRight(),val)) return true;
        }
        return false;
    }

    public void preOrder(){
        preOrder(root);
    }

    public void preOrder(BTNode node){
        if (node != null){
            System.out.print(node.getData()+" ");
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }

    public void postOrder(){
        postOrder(root);
    }

    public void postOrder(BTNode node){
        if (node != null){
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.print(node.getData()+" ");
        }
    }

    public void inOrder(){
        inOrder(root);
    }

    public void inOrder(BTNode node){
        if (node != null){
            inOrder(node.getLeft());
            System.out.print(node.getData()+" ");
            inOrder(node.getRight());
        }
    }
}

/*

    private BTNode root;

    */
/* Constructor *//*

    public BT()
    {
        root = null;
    }
    */
/* Function to check if tree is empty *//*

    public boolean isEmpty()
    {
        return root == null;
    }
    */
/* Functions to insert data *//*

    public void insert(int data)
    {
        root = insert(root, data);
    }
    */
/* Function to insert data recursively *//*

    private BTNode insert(BTNode node, int data)
    {
        if (node == null)
            node = new BTNode(data);
        else
        {
            if (node.getRight() == null)
                node.right = insert(node.right, data);
            else
                node.left = insert(node.left, data);
        }
        return node;
    }
    */
/* Function to count number of nodes *//*

    public int countNodes()
    {
        return countNodes(root);
    }
    */
/* Function to count number of nodes recursively *//*

    private int countNodes(BTNode r)
    {
        if (r == null)
            return 0;
        else
        {
            int l = 1;
            l += countNodes(r.getLeft());
            l += countNodes(r.getRight());
            return l;
        }
    }
    */
/* Function to search for an element *//*

    public boolean search(int val)
    {
        return search(root, val);
    }
    */
/* Function to search for an element recursively *//*

    private boolean search(BTNode r, int val)
    {
        if (r.getData() == val)
            return true;
        if (r.getLeft() != null)
            if (search(r.getLeft(), val))
                return true;
        if (r.getRight() != null)
            if (search(r.getRight(), val))
                return true;
        return false;
    }
    */
/* Function for inorder traversal *//*

    public void inOrder()
    {
        inorder(root);
    }
    private void inorder(BTNode r)
    {
        if (r != null)
        {
            inorder(r.getLeft());
            System.out.print(r.getData() +" ");
            inorder(r.getRight());
        }
    }
    */
/* Function for preorder traversal *//*

    public void preOrder()
    {
        preorder(root);
    }
    private void preorder(BTNode r)
    {
        if (r != null)
        {
            System.out.print(r.getData() +" ");
            preorder(r.getLeft());
            preorder(r.getRight());
        }
    }
    */
/* Function for postorder traversal *//*

    public void postOrder()
    {
        postorder(root);
    }
    private void postorder(BTNode r)
    {
        if (r != null)
        {
            postorder(r.getLeft());
            postorder(r.getRight());
            System.out.print(r.getData() +" ");
        }
    }

}
*/
