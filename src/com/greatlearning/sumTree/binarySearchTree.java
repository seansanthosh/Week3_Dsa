package com.greatlearning.sumTree;

public class binarySearchTree{ //defines BST
        Node root;
        binarySearchTree(){ //Initializing root as null
            root = null;
        }
        public static class Node{
            int value;
            Node left, right; //left child & right child got defined
            Node(int data){
                this.left = null;
                this.value =data; //root value is assigned through parameter
                this.right = null;
            }
        }
        public Node add( Node root,int data){ //function to add a node in bst
            if(root==null){ //First root
                root = new Node(data);
                return root;
            }
            if(data<root.value){ //checks if value is less than root value
                if(root.left == null){
                    root.left = new Node(data); // creates a new node in left
                    return root;
                }
                add(root.left,data); //pass the data value
            }
            if(data> root.value){ //checks if value is greater than root value
                if(root.right == null){
                    root.right = new Node(data); // creates a new node in right
                    return root;
                }
                add(root.right,data); // pass the data valuie
            }
            return root;
        }
}
