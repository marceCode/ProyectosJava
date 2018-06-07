package es.hackerrank.day18.queuesAndstacks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
	private Stack<Character> myStack =  new Stack<Character>();
	private Queue<Character> myQueue = new LinkedList<Character>();
	
	   public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String input = scan.nextLine();
	        scan.close();

	        // Convert input String to an array of characters:
	        char[] s = input.toCharArray();

	        // Create a Solution object:
	        Solution p = new Solution();

	        // Enqueue/Push all chars to their respective data structures:
	        for (char c : s) {
	            p.pushCharacter(c);
	            p.enqueueCharacter(c);
	        }

	        // Pop/Dequeue the chars at the head of both data structures and compare them:
	        boolean isPalindrome = true;
	        for (int i = 0; i < s.length/2; i++) {
	            if (p.popCharacter() != p.dequeueCharacter()) {
	                isPalindrome = false;                
	                break;
	            }
	        }

	        //Finally, print whether string s is palindrome or not.
	        System.out.println( "The word, " + input + ", is " 
	                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
	    }
	   
	   private void enqueueCharacter(char c) {
			myQueue.add(c);
			
		}

		//Stack
		private void pushCharacter(char c) {
		myStack.push(c);
			
		}
	//Stack
	private Object popCharacter() {
		
		return myStack.pop();
	}

	private Object dequeueCharacter() {
		return	myQueue.remove();
	}

	

}
