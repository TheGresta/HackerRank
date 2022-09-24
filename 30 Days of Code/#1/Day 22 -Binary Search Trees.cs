/*
Task
The height of a binary search tree is the number of edges between the tree's root and its furthest leaf. You are given a pointer, root , pointing to the root of a binary search tree. 
Complete the getHeight function provided in your editor so that it returns the height of the binary search tree.

Input Format

The locked stub code in your editor reads the following inputs and assembles them into a binary search tree:
The first line contains an integer, n, denoting the number of nodes in the tree.
Each of the n subsequent lines contains an integer, data, denoting the value of an element that must be added to the BST.

Sample Input

7
3
5
2
1
4
6
7

Sample Output

3
*/

using System;
class Node{
    public Node left,right;
    public int data;
    public Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

	static int getHeight(Node root){
        if (root == null) {
            return - 1;
        }

        return 1 + Math.Max(getHeight(root.left), getHeight(root.right));
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
        int height=getHeight(root);
        Console.WriteLine(height);
        
    }
}
