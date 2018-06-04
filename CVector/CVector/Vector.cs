using System;

namespace CVector
{
	public class Vector
	{
		public static void Sort(int[] v) {
			
		}

		public static void IndexMin(int[] v, int initialIndex) {
			int indexMin = initialIndex;
			for (int index = initialIndex + 1; index < v.Length; index++)
				if (v [index] < v [initialIndex])
					indexMin = index;
			return indexMin;
		}

		public static void Swap(int[] v, int index, int otherIndex) {
		}
	}
}

