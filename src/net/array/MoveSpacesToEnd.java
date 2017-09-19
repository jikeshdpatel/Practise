package net.array;

public class MoveSpacesToEnd {

	public static void main(String[] args) {
		String string = "__ball_in__the__basket___";
		char[] chars = string.toCharArray();
		moveSpacesToEnd(chars);
		System.out.println(chars);
	}

	public static void moveSpacesToEnd(char[] chars){
		boolean keepASpace = false, startSwap = false;
		int si = 0;
		for(int i = 0; i<chars.length ; i++){
			if(chars[i] == '_'){
				if(startSwap){
					startSwap=false;
					keepASpace=true;
				}
					
				if(!keepASpace)
					continue;
				else{
					keepASpace = false;
					si++;
					continue;
				}
			}
			if(chars[i] != '_'){
				startSwap=true;
				swap(chars, i, si);
				si++;
			}
		}
	}
	
	public static void swap(char[] chars, int i, int si){
		chars[i] = (char) (chars[i] + chars[si] - (chars[si] = chars[i]));
	}
}
