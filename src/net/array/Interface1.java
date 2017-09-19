package net.array;

public interface Interface1 {

	public void test1();
	public void test2();
	default void default1() {
		System.out.println("default1");
	}
}
