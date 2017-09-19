package net.array;

public class MultipleInheritance implements Interface1, Interface2{

	public static void main(String[] args) {
		MultipleInheritance test =  new MultipleInheritance();
		test.default1();
		test.default2();
		test.test1();
		test.test2();
		test.test3();
	}

	@Override
	public void test3() {
		System.out.println("test3");
	}

	@Override
	public void test1() {
		System.out.println("test1");
	}

	@Override
	public void test2() {
		System.out.println("test2");
	}

}
