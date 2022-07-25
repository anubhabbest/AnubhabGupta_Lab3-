package com.sumpair.model;
import java.util.*;
/*
 * Below is the service code for question 2 of Lab 3 - Binary Trees and Binary search trees
 * we are creating a class BST with a public inner class Node
 * */

public class BST {
	public Node root=null;
	HashSet<Integer> set=new HashSet<>();
	public class Node
	{
		public int data;
		Node left,right;
		Node(int data)
		{
			this.data=data;
			left=null;
			right=null;
		}
	}
	public void insertNode(int data)//insertNode will call the insert method to insert the node and stores the root of the tree
	{
		root=insert(root,data);
	}
	public Node insert(Node root,int data)//insert will do the actual task of inserting the node
	{
		if(root==null)
		{
			root=new Node(data);
			return(root);
		}
		else if(data>root.data)
			root.left=insert(root.right, data);
		else if(data<root.data)
			root.right=insert(root.left,data);
		return(root);
	}
	
	
	public boolean pair(Node node,int sum)//pair method adds the elements of the tree in inorder traversal to hashmap and returns true if such a pair is found
	{
		if(node==null)
			return(false);
		if(pair(node.left,sum))
			return(true);
		if(set.contains(sum-node.data))
		{
			System.out.println("Pair is ("+node.data+","+(sum-node.data)+")");
			return(true);
		}
		else
		{	
			set.add(node.data);
		}
		return(pair(node.right,sum));
	}
	public void sumPair(int sum)//sumPair calls pair method to check if we found such a pair.If not then we print "nodes are not found"
	{
		if(!pair(root,sum))
			System.out.println(" nodes are not found.");
	}
}
