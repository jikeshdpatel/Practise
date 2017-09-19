
public class ConvertToBinary {

	public static void main(String[] args) {
		toBinary(18);
		System.out.println(convertToBinary(18));
		System.out.println(Integer.toBinaryString(18));
	}

	public static void toBinary(int a){
		StringBuilder str = new StringBuilder();
		getRemainder(a, str);
		System.out.println(str.toString());
	}
	
	public static void getRemainder(int a, StringBuilder b){
		if(a/2 > 0){
			getRemainder(a/2, b);
		}
		b.append(a%2);
		return;
	}
	
	public static String convertToBinary(int a){
		if(a <= 0)
			return "0";
		
		StringBuilder sb = new StringBuilder();
		while(a > 0){
			sb.append(a%2);
			a = a/2;
		}
		return sb.reverse().toString();
	}
}
