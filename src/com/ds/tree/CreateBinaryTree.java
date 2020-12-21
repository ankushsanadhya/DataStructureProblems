package com.ds.tree;

//Create binary tree from level order traversal array
public class CreateBinaryTree {
    private Node root;

    public static void main(String[] args) {
        CreateBinaryTree t2 = new CreateBinaryTree();
        int arr[] = { 1, 2, 3, 4, 5, 6, 6, 6, 6 };
        t2.root = t2.insertLevelOrder(arr, t2.root, 0);
        t2.inOrder(t2.root);
    }

    public void inOrder(Node root)
    {
        if (root != null) {
            inOrder(root.getLeft());
            System.out.print(root.getData() + " ");
            inOrder(root.getRight());
        }
    }

    private Node insertLevelOrder(int arr[], Node root, int i){
       if(i<arr.length){
           Node temp = new Node(arr[i]);
           root = temp;
           root.setLeft(insertLevelOrder(arr, root.getLeft(), 2*i+1));
           root.setRight(insertLevelOrder(arr, root.getRight(), 2*i+2));
       }
       return root;
    }
}
