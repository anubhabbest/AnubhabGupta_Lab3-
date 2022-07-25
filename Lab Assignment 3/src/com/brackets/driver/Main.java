package com.brackets.driver;
import com.brackets.service.*;
/*
 * Below is the driver code for question 1 of Lab 3 - Binary Trees and Binary search trees
 * */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="([[{}]])";//input string
		if(checkBalance.isBalanced(input))//calls isBaanced method to check if the brackets are balanced or not
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets");
	}

}
