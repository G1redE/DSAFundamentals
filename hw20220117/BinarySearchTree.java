package com.dsa.hw20220117;

import java.util.ArrayList;

public class BinarySearchTree{
	static ArrayList<Integer> arr = new ArrayList<>();
    TreeNode root;
    static class TreeNode{
        int val;
        TreeNode left, right;

        TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    BinarySearchTree(){
         root = null;
    }
    void insert(int key){
        root = _insert(root,key);
    }
    static TreeNode _insert(TreeNode root,int key){
        if(root == null){
            root = new TreeNode(key);
            return root;
        }
        if(key<=root.val)
            root.left = _insert(root.left,key);
        else root.right = _insert(root.right,key);
        return root;
    }

    void inorder(){
        _inorder(root);
    }
    static void _inorder(TreeNode root){
        if(root==null)return;
        _inorder(root.left);
        System.out.print(root.val+ ",");
        _inorder(root.right);
    }

     void KthSmallest(TreeNode root,int k){
       
        if(root==null) return;
        KthSmallest(root.left,k);
        k--;
        if(k==0){
           int ans = root.val;
            return;
        }
        KthSmallest(root.right,k);
    }
     int getRangeSum(TreeNode node, int low, int high)
     {
        
         if(node == null)
             return 0;
  
        
         if(node.val >= low && node.val <= high)
             return node.val + this.getRangeSum(node.left, low, high)+
                 this.getRangeSum(node.right, low, high);
       
         else if(node.val < low)
             return this.getRangeSum(node.right, low, high);
    
         else
             return this.getRangeSum(node.left, low, high);    
     }
     boolean isBST(TreeNode node, int min, int max)
     {
         if (node == null)
             return true;
 
         if (node.val < min || node.val > max)
             return false;
         return (isBST(node.left, min, node.val-1) &&
                 isBST(node.right, node.val+1, max));
     }
    
  
    public static void main(String[] args) {
       BinarySearchTree tree = new BinarySearchTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.inorder();
        System.out.println();
        System.out.println(tree.getRangeSum(tree.root, 20, 50));
        System.out.println(tree.isBST(tree.root,Integer.MIN_VALUE,Integer.MAX_VALUE));
  

    }


}


