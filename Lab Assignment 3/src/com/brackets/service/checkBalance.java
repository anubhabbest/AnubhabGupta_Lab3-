package com.brackets.service;
import java.util.*;
/*
 * Below is the service code for question 1 of Lab 3 - Binary Trees and Binary search trees
 * */

public class checkBalance {
	static Stack<Character> stack=new Stack<>();

	static char pair(char bracket)//returns the correct pair for each bracket
	{
		switch(bracket)
		{
		case ')':return('(');
		case '}':return('{');
		case ']':return('[');
		}
		return(' ');
	}
	static boolean check(char bracket)//checks whether the top of the stack is the correct pair for a closing bracket.if yes then returns true else returns false
	{
		char pair=pair(bracket);
		if(stack.isEmpty())
			return(false);
		else if(stack.peek()==pair)
		{
			stack.pop();
			return(true);
		}
		else
			return(false);
	}

	public static boolean isBalanced(String input)
	{	
		for(char bracket:input.toCharArray())//for opening brackets the push into the stack
		{
			if(bracket=='(' || bracket=='{' || bracket=='[')
				stack.push(bracket);
			else if(bracket==')' || bracket=='}' || bracket==']')//for closing brackets check if it is the correct pair.If not return false.
			{
				if(!check(bracket))
					return(false);


			}
		}
		if(stack.isEmpty())//after the loop is over if stack is empty return true
			return(true);
		return(false);//otherwise return false
	}


}
