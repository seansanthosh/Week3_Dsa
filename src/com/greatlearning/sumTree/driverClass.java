package com.greatlearning.sumTree;
import java.util.ArrayList;
public class driverClass extends binarySearchTree {
    static ArrayList<Integer> set = new ArrayList<>(); // creates an array of integers
    static boolean flag = false; // a flag to set 1 => if pair sum is found
    public static void main(String[] args) {
        binarySearchTree sampleTree = new binarySearchTree(); // initialise sampleTree
        int [] arr = new int[]{40,20,60,10,30,50,70}; //assigning node values to array
        for(int i =0; i<arr.length;i++) {
            sampleTree.root = sampleTree.add(sampleTree.root,arr[i]); //accessing each elements from array and adding to tree
        }
        int sum = 130; // sum-value on which pairs are found.
        Search(sum,sampleTree.root); // invokes search methood with sum & root as parameters
        if(flag==false)
            System.out.println("No suitable pair found for given sum");
    }
    public static void Search(int sum,Node node){
        if(node == null){
            return;
        }
        Search(sum,node.left);
        if(set.contains(sum-node.value)){ // checks sum-value is present in set
            System.out.println("Pair is ("+(sum-node.value)+","+ (node.value)+")");   //prints pair
            flag=true; // set flag va;ue to true
        }
        else{ // if not found, will add value to set
            set.add(node.value);
        }
        Search(sum,node.right);
    }

}
