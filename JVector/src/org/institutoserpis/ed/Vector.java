package org.institutoserpis.ed;

public class Vector {

	public static void main(String[] args) {
		int [] v = new int[] {9, 15, 7, 12, 6};

		for (int index = 0; index < 5; index++)
			System.out.printf("v[%s]=%s\n", index, v[index]);

		int value = 33;

		int position = index0f(v, value);
		System.out.println("position=" + position);
		int min = min(v);
		System.out.println("min=" + min);

		int minPosition = index0fMin(v);
		System.out.println("min position: " + minPosition);

		selectionSort(v);
	}

	public static int index0f(int[] v, int value) {
//		int index = 0;
//		while (index < v.length && v[index] != value) //0j0 con el orden de la condición
//			index++;
//		if (index == v.length)
//			return -1;
//		return index;
//		---------método wirtz---------
//		for (int index = 0; index < v.length; index++)
//			if (v[index] == value)
//				return index;
		int index = 0;
		while (index < v.length && v[index] != value)
			index++;
		return index < v.length ? index : -1;
	}

	public static int min(int[] v) {
		int min = v[0];
//		for (int index = 1; index < v.length; index += 1)
//			if (min > v[index])
//				min = v[index];
//		return min;
		for (int item : v)
			if (item < min)
				min = item;
		return min; //nuevo for
	}

	public static int sum(int[] v) {
		int suma = 0;

//		for (int index = 0; index < v.length; index++)
//			suma = suma + v[index];
		for (int item : v)
			suma = suma + item;
		return suma;
	}

	public static int index0fMin(int[] v) {
		int index0fMin = 0;

		for (int index = 0; index < v.length; index++)
			if (v[index] < v[index0fMin])
				index0fMin = index;
		return index0fMin;
	}

	public static void selectionSort(int[] v) {
		int selectedIndex, index0fmin, aux;
		int n = v.length;

		for (int index = 0; index < n; index++) {
			index0fmin = index;
				for (selectedIndex = index + 1; selectedIndex < n; selectedIndex++)
					if (v[selectedIndex] < v[index0fmin])
	                	  index0fmin = selectedIndex;
				if (index0fmin != index) {
	            	aux = v[index];
	            	v[index] = v[index0fmin];
	            	v[index0fmin] = aux;
	            }
	      }
	      for (int index = 0; index < n; index++)
	    	  System.out.print(v[index] + " ");
	}
}
