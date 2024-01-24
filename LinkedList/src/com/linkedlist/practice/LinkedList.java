package com.linkedlist.practice;

public class LinkedList {
	static Node head;
	 private static int size;
	
	LinkedList(){
	 size=0;
	}
	
	
	static class Node{
		 int data;
		
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
			size++;
		}
	}
	
	
		public static void AddFirst(int data) {
			Node newnode =new Node(data);
			if(head==null) {
				newnode=head;
			}
			newnode.next=head;
			head=newnode;
			
		}
		
		
		public static void addlast(int data) {
			Node newnode=new Node(data);
			if(head==null)
				newnode=head;
			
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
				
			}
			temp.next=newnode;
			newnode.next=null;
			
		}
		
		
		
		
		
		public static void deletefirst() {
			if(head==null) System.out.println("no element to delete");
			head=head.next;
		}
		
		
		
		public static void deletelast() {
			if(head==null)System.out.println("no element to delete last");
			
			Node temp=head;
			while(temp!=null) {
				temp=temp.next;
				
			}
			temp=null;
		}
		
		
		public static void main(String args[]) {
			 LinkedList list=new  LinkedList();
			 list.AddFirst(2);
			 list.AddFirst(3);
			 list.AddFirst(4);
			 list.AddFirst(5);
			 list.AddFirst(6);
			 list.AddFirst(7);
			 list.AddFirst(8);
			 System.out.println(list);
			 
		}
		
		
	}

