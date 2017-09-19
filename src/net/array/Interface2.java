package net.array;

public interface Interface2 {

	public void test1();
	public void test3();
	default void default2() {
		System.out.println("default2");
	}
}
