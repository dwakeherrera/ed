using NUnit.Framework;
using System;

namespace CVector
{
	[TestFixture ()]
	public class VectorTest
	{
		[Test ()]
		public void Sort () {
			int[] v = {12, 9, 15, 7, 13};
			Vector.Sort(v);
			CollectionAssert.AreEqual (new int[] {7, 9, 12, 13, 15}, v);
			v = new int[] {7, 9, 12, 13, 15 };
			Vector.Sort(v);
			CollectionAssert.AreEqual (new int[] {7, 9, 12, 13, 15}, v);
		}

		[Test]
		public void IndexMin() {
			int[] v = {12, 7, 15, 9, 13};
			Assert.AreEqual (4, Vector.IndexMin(v, 4));
			Assert.AreEqual (3, Vector.IndexMin(v, 2));
			Assert.AreEqual (0, Vector.IndexMin(v, 0));

			Assert.AreEqual (0, Vector.IndexMin(v, 5));
		}

		[Test]
		[ExpectedException(typeof(System.IndexOutOfRangeException))]
		int[] v = {12, 7, 15, 9, 13};
		public void IndexMinBadInitialIndex() {
			Assert.AreEqual (0, Vector.IndexMin(v, -1));
		}

		[Test]
		[ExpectedException(typeof(System.IndexOutOfRangeException))]
		public void IndexMinBadInitialIndex() {
			int[] v = {12, 7, 15, 9, 13};
			Assert.AreEqual (0, Vector.IndexMin(v, 5));
		}
	}
}
