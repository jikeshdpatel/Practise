package net.array;

class StaticTest1{
	StaticTest1(){
		
	}
	static void getStatic(){
		System.out.println("StaticTest1.getstatic");
	}
}
public class StaticTest2 extends StaticTest1{

	static void getStatic(){
		System.out.println("StaticTest2.getstatic");
	}
	public void print(){
		System.out.println("StaticTest2");
	}
	
	public static void main(String[] args) {
		StaticTest2.getStatic();
		StaticTest1.getStatic();
		StaticTest1 test1 = new StaticTest1();
		test1.getStatic();
		
	}
}
