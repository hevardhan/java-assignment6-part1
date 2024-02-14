package assignment6_part1;

import java.util.*;

public class Growable_stk implements Interface_STK{
	
	private int top = -1;
	
	private ArrayList<Integer> stack = new ArrayList<Integer>(2);
		
	public Growable_stk() {
		
		stack = new ArrayList<>();
	}

	@Override
	public void push(int element) {
	
		stack.add(++top, element);
		
	}

	@Override
	public int pop() {
		
		if(underFlow()) {
			System.out.println("Stack is Empty");
			System.exit(0);
		}
				
		return stack.remove(top--);
	}

	@Override
	public void displayStack() {
		if(underFlow())
		{
			System.out.println("Stack is Empty");
			System.exit(0);
		}
		else
		{
			System.out.println("Stack Elements: ");
			for(int x:stack)
				System.out.print(x+" ");
		}//else
		System.out.println("");
	}// display

	@Override
	public boolean underFlow() {
		if (top == -1)
			return true;
		else
			return false;
	}// underflow

	@Override
	public boolean overFlow() {
		return false;
	}//overflow


}