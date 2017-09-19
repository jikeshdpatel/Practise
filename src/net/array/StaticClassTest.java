package net.array;

import java.util.List;
import java.util.Vector;

/**
 * Below is the sequence of blocks execution when an object is being created.
 * 1) Static block
 * 2) Initializer block
 * 3) Constructors
 * @author Pooja Patel
 *
 */
public class StaticClassTest {

	static int temp =30;
	int temp1 =50;
	public static void main(String[] args) {
		System.out.println("main");
		System.out.println(Test.i);
		Test test1 = new Test();
		Test test2 = new Test();
		Test test3 = new Test();
		
		List<String> vector = new Vector<>();
	}

	static int fun()
	   {
	     int x= 10;  //Error: Static local variables are not allowed
	     return x--;
	   }
	
	public static class staticInnerClass {
		public staticInnerClass() {
			System.out.println("Static inner class invoked" + temp);
		}
	}
}

//filename: Main.java
class Test {
    static int i;
    int j;
    // Initializer block starts..
    {
        // This code is executed before every constructor.
        System.out.println("Common part of constructors invoked !!");
    }
    // Initializer block ends
    // start of static block 
    static {
        i = 10;
        System.out.println("static block called ");
    }
    // end of static block 
    /*Test(){
        System.out.println("Constructor called");
    }*/
}
