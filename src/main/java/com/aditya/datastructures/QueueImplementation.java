package com.aditya.datastructures;

class Queue{
	Integer value;
	Queue next;
	public Queue() {
		value = null;
		next = null;
	}
}

public class QueueImplementation {
	static Queue parent;
	public static void main(String[] args) {
		push(5);
		push(8);
		push(2);
		System.out.println("Trying to get Queue elements");
		display();
		System.out.println("Popping");
		System.out.println("Element removed: "+pop());
		System.out.println("Queue after popping");
		display();
	}
	public static void push(Integer id) {
		if(parent==null) {
			System.out.println("Inserting first data in queue: "+id);
			parent = new Queue();
			parent.value = id;
		}
		else {
			Queue temp = parent;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = new Queue();
			temp.next.value = id;
		}
	}
	public static Integer pop() {
		Integer tempInt;
		if(parent==null) {
			System.out.println("Nothing to remove");
			return null;
		}
		if(parent.next==null) {
			tempInt = parent.value;
			parent = null;
			return tempInt;
		}
		Queue temp = parent;
		parent = parent.next;
		tempInt = temp.value;
		return temp.value;
	}
	public static void display() {
		if(parent==null) {
			System.out.println("Nothing to display");
			return;
		}
		Queue temp = parent;
		System.out.println(temp.value);
		while(temp.next!=null) {
			temp = temp.next;
			System.out.println(temp.value);
		}
	}
}
