/*
Task
A level-order traversal, also known as a breadth-first search, visits each level of a tree's nodes from left to right, top to bottom. 
You are given a pointer, root, pointing to the root of a binary search tree. 
Complete the levelOrder function provided in your editor so that it prints the level-order traversal of the binary search tree.

Hint: You'll find a queue helpful in completing this challenge.

Function Description

Complete the levelOrder function in the editor below.

levelOrder has the following parameter:
- Node pointer root: a reference to the root of the tree

Sample Input

6
3
5
4
7
2
1

Sample Output

3 2 5 1 4 7 
*/

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Node{
    public Node left,right;
    public int data;
    public Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

	static void levelOrder(Node root){
  		//Write your code here
        Queue Q = new Queue();
        Q.Enqueue(root);

        while (Q.Count > 0) {
            Node curNode = (Node) Q.Peek();
            if (curNode.left != null) {
                Q.Enqueue(curNode.left);
            }
            if (curNode.right != null) {
                Q.Enqueue(curNode.right);
            }
            Console.Write(curNode.data + " ");
            Q.Dequeue();
        }
    }

	static Node insert(Node root, int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    static void Main(String[] args){
        Node root=null;
        int T=Int32.Parse(Console.ReadLine());
        while(T-->0){
            int data=Int32.Parse(Console.ReadLine());
            root=insert(root,data);            
        }
        levelOrder(root);
        
    }
}