package com.srkr.ds;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		stack.push(3);
		stack.push(5);
		stack.push(7);
		stack.push(9);
		stack.push(2);
		
		System.out.println("Stack Size : "+stack.size());
		System.out.println("Top : "+stack.peek());
		System.out.println("Is Stack Empty: "+stack.isEmpty());
	}
}