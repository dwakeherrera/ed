package org.institutoserpis.ed;

public class Vector {

	public static void main(String[] args) {
		int [] v = new int[] {9, 15, 7, 12, 6};

		for (int index = 0; index < 5; index++)
			System.out.printf("v[%s]=%s\n", index, v[index]);

		int value = 33;

		int position = index0f(v, value);
		System.out.println("position=" + position);
	}

	public static int index0f(int[] v, int value) {
		int index = 0;
		while (index < v.length && v[index] != value) //0j0 con el orden de la condición
			index++;
		if (index == v.length)
			return -1;
		return index;
	}
}
