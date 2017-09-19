package net.array;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

public class CompleteParanthesis {

	private static Map<Character,Integer> openingParenthesis = new LinkedHashMap<>();
	private static Map<Character,Integer> closingParenthesis = new LinkedHashMap<>();
	static{
		openingParenthesis.put('(',1);
		openingParenthesis.put('[',2);
		openingParenthesis.put('{',3);
		
		closingParenthesis.put(')',1);
		closingParenthesis.put(']',2);
		closingParenthesis.put('}',3);
	}
	
	public static void main(String[] args) {
		String a = "{}()[]{[()()]}";
		System.out.println(isCompleteParanthesis(a.toCharArray()));
	}

	public static boolean isCompleteParanthesis(char[] charArray){
		Stack<Character> stack = new Stack<>();
		for (char character : charArray) {
			if(closingParenthesis.containsKey(character)
					&& !stack.isEmpty()
					&& openingParenthesis.get(stack.peek()) == closingParenthesis.get(character))
				stack.pop();
			else
				stack.push(character);
		}
		
		if(stack.isEmpty())
			return true;
		else
			return false;
	}
}
