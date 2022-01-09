package com.dsa.hw20220106;



class MyStack {
    static int MAX = 10;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack
 
    boolean isEmpty() {
        return (top < 0);
    }
 
    MyStack() {
        top = -1;
    }
 
    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
           
        	top+=1;
            a[top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }
 
    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top--];
            System.out.println(x + " poped out of stack");
            return x;
        }
    }
 
    int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top];
            System.out.println(x);
            return x;
        }
    }
 
    void print() {
        for (int i = top; i > -1; i--) {
            System.out.print(" " + a[i]);
        }
    }
}

public class Stacked {

	public static void main(String[] args) {
		MyStack s = new MyStack();
		s.push(0);
		s.push(1);
		s.pop();
		s.peek();
	}

}
