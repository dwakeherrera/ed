package org.institutoserpis.ed;

import static org.junit.Assert.*;

import org.junit.Test;

public class VectorTest {

	@Test
	public void indexOf() {
		int[] v = new int[] {9,15,7,12,6};
		assertEquals(0, Vector.indexOf(v, 9));
		assertEquals(2, Vector.indexOf(v, 7));
		assertEquals(4, Vector.indexOf(v, 6));
		assertEquals(-1, Vector.indexOf(v,33));
	}

	@Test
	public void indexOfEmpty() {
		int[] v = new int[] {};
		assertEquals(-1, Vector.indexOf(v, 7));
	}

	@Test
	public void min() {
		assertEquals(6, Vector.min(new int[] {9,15,7,12,6}));
		assertEquals(7, Vector.min(new int[] {9,15,7,12,16}));
		assertEquals(9, Vector.min(new int[] {9,15,17,12,16}));
	}


	@Test
	public void sum() {
		assertEquals(49, Vector.sum(new int[] {9,15,7,12,6}));
		assertEquals(0, Vector.sum(new int[] {}));
		assertEquals(43, Vector.sum(new int[] {9,15,7,12}));
	}

	@Test
	public void indexOfMin() {
		assertEquals(4, Vector.indexOfMin(new int[] {9,15,7,12,6}));
		assertEquals(0, Vector.indexOfMin(new int[] {9,15,17,12,16}));
	}

	@Test
	public void binarySearchNotFound() {
		int[] v = new int[] {7, 14, 21, 27, 31};
		assertEquals(-1, Vector.binarySearch(v, 6));
		assertEquals(-1, Vector.binarySearch(v, 10));
		assertEquals(-1, Vector.binarySearch(v, 16));
		assertEquals(-1, Vector.binarySearch(v, 23));
		assertEquals(-1, Vector.binarySearch(v, 29));
		assertEquals(-1, Vector.binarySearch(v, 33));
	}

	@Test
	public void binarySearchFound() {
		int[] v = new int[] {7, 14, 21, 27, 31};
		assertEquals(0, Vector.binarySearch(v, 7));
		assertEquals(2, Vector.binarySearch(v, 21));
		assertEquals(4, Vector.binarySearch(v, 31));
	}

	@Test
	public void binarySearchOverflow() {
		//TODO ver cómo aumentar el tamaño del heap
		/*int[] v = new int[Integer.MAX_VALUE];
		for (int index = 0; index < Integer.MAX_VALUE; index++)
			v[index] = index;
		assertEquals(-1, Vector.binarySearch(v, Integer.MAX_VALUE));*/
	}
}
