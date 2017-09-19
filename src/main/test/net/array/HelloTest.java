package net.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class HelloTest {

	@Test
	public void test() {
		/*Assert.assertEquals("435456 2343",TestMain.findTopTwo(new int[]{1,2,4,2343,435456,0}));
		
		List<Integer> expected = Arrays.asList(-5, 5, -2, 2, -8, 4, 7, 1, 8, 0);
		Assert.assertEquals(expected,TestMain.rearrangeArray(new int[]{-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}));

		expected = Arrays.asList(1,2,3,4,5,0,0,0,0);
		List<Integer> actual = new ArrayList<Integer>();
		int[] a = new int[]{1,1,2,2,2,2,3,4,5};
		TestMain.removeDupsArray(a);
		for(int a0 : a)
			actual.add(a0);
		
		Assert.assertEquals(expected, actual);*/
		
		Assert.assertEquals(2,TestMain.binarySearchIterative(new int[]{1,2,3,4,5,6}, 3));
	}

}
