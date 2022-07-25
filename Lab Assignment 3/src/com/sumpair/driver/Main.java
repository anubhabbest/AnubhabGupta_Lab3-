package com.sumpair.driver;
import com.sumpair.model.*;
/*
 * Below is the driver code for question 2 of Lab 3 - Binary Trees and Binary search trees
 * */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST tree=new BST();//creating a binary search tree by creating an object of BST
		tree.insertNode(40);
		tree.insertNode(20);
		tree.insertNode(60);
		tree.insertNode(10);
		tree.insertNode(30);
		tree.insertNode(50);
		tree.insertNode(70);
		int sum=130;//suppose we want to find the pair of node data which when added give the result 130 
		tree.sumPair(sum);//sumPair is the method which provides us the pair of node data which when added give the result equal to sum
	}

}
