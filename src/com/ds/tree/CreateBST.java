package com.ds.tree;

//Create BST from sorted array
public class CreateBST {

    public static void main(String[] args) {
    CreateBST bst = new CreateBST();
    int arr[] = {1,2,3,4,5};
    Node root = bst.createBST(arr,0,arr.length-1);
    bst.inOrderTraversal(root);
    }

    private Node createBST(int arr[],int start, int end){
      if(start>end){
            return null;
        }
        int mid = (start+end)/2;
        Node root = new Node(arr[mid]);
        root.setLeft(createBST(arr, start, mid-1));
        root.setRight(createBST( arr,mid+1, end));
        return root;
    }

    private void preOrderTraversal(Node root){
        if(root == null)
            return;
        System.out.println(root.getData());
        preOrderTraversal(root.getLeft());
        preOrderTraversal(root.getRight());
    }

    private void inOrderTraversal(Node root){
        if(root == null)
            return;
        inOrderTraversal(root.getLeft());
        System.out.println(root.getData());
        inOrderTraversal(root.getRight());
    }

    private void postOrderTraversal(Node root){
        if(root == null)
            return;
        postOrderTraversal(root.getLeft());
        postOrderTraversal(root.getRight());
        System.out.println(root.getData());
    }

}
