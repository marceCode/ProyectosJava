package es.hackerrank.day15.linkedList;

import java.util.Optional;
import java.util.Scanner;

class Solution {

	 
	  public static  Node insert(Node head,int data) {
		  if (head == null) {
	            head = new Node(data);
	        }else{
			
	        	Optional<Node> lastNode = getLastNode(head);
	            Node node = lastNode.get();
	            node.next=(new Node(data));

		     
		}
		  
		return head;
	    }
	  public static Optional<Node> getLastNode(Node head) {
	        if (head != null) {
	            Node current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            return Optional.of(current);
	        } else {
	            return Optional.empty();
	        }
	    }
	  
		public static void display(Node head) {
	        Node start = head;
	        while(start != null) {
	            System.out.print(start.data + " ");
	            start = start.next;
	        }
	    }

	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        Node head = null;
	        int N = sc.nextInt();

	        while(N-- > 0) {
	            int ele = sc.nextInt();
	            head = insert(head,ele);
	        }
	        display(head);
	        sc.close();
	    }
}
