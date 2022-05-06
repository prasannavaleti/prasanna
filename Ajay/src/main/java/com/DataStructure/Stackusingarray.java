package com.DataStructure;
import java.util.Scanner;
class Stack{
	int max_size=20;
	int a[];
	int top;
	Stack(){
		a=new int[ max_size];
		top=-1;
	}
	boolean isEmpty() {
		return (top<0);
	}
	boolean push(int x) {
		if(top>= max_size-1) {
			System.out.println("stack overflow");
			return false;
		}
		else {
			a[++top]=x;
			return true;
			}
	}
	int pop() {
		if(top<0) {
			System.out.println("stack underflow");
			return 0;
		}
		else {
			int d=a[top--];
			System.out.println(d+ " data poped from stack");
			return d;
		}
	}
	int peek() {
		if(top<0) {
			System.out.println("stack underflow");
			return 0;
		}
		else {
			int d=a[top];
			return d;
			
		}
	}
	void print() {
		for(int i=top;i>-1;i--) {
			System.out.println(a[i]);
		}
	}
}
public class Stackusingarray {
	public static void main(String[] args) {
		Stack s1=new Stack();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements you wish to push : ");
		int n = s.nextInt();
		
		System.out.print("Enter the elements you wish to push : ");
		int[] element = new int[n];
		
		for (int i=0; i<n; i++) {
			element[i] = s.nextInt();
			boolean p = s1.push(element[i]);
			if (!p) {
				break;
			}	
		}	
		System.out.println("stack");
		s1.print();
		System.out.println("stack peek element "+s1.peek());
		s1.pop();
		s1.pop();
		System.out.println("stack after pop");
		s1.print();		
	}
		
	}
