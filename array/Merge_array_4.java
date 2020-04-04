package array;
//4.	WAP to merge 2 arrays to 3rd array.

public class Merge_array_4 {
	public static void main(String[] args) {

		// third array
		System.out.println("First elements in first array are-");
		int arr1[] = { 1, 2, 3 }; // first array
		int arr2[] = { 4, 5, 6 };
	
		int arr3[] = new int[arr1.length+arr2.length];

		int count=0;
		System.out.println("1st array");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("2nd array");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		for (int i = 0; i < arr1.length; i++) {
			arr3[i]=arr1[i];
			count++;
		}

		// second array
	
		for (int i = 0; i < arr2.length; i++) {
			arr3[count]=arr2[i];
		count++;
		}
		// third array
		System.out.println();
		System.out.println("Merge array-");
		
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}

	}
}
