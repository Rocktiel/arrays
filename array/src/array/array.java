package array;

import java.util.Arrays;

public class array {

	public static void main(String[] args) {
		double[] double_array= {8.4,9.3,0.2,7.9,3.4};
		Arrays.sort(double_array);
		System.out.printf("doubleArray");
		for (double value : double_array) 
		{
			System.out.printf("%.1f",value);
		}
		int[] filledIntArray=new int[10];
		Arrays.fill(filledIntArray, 7);
		displayArray(filledIntArray,"filledIntArray");
		
		int[] intArray= {1,2,3,4,5,6};
		int[] intArrayCopy=new int[intArray.length];
		System.arraycopy(intArray, 0, intArrayCopy, 0,intArray.length);
		displayArray(intArray,"intArray");
		displayArray(intArrayCopy,"intArrayCopy");
		
		boolean b=Arrays.equals(intArray, intArrayCopy);
		System.out.printf("\n\n intArray %s intArrayCopy",
				(b ? "==":"!="));
		
		b=Arrays.equals(intArray,filledIntArray);
		System.out.printf("\n\n intArray %s filledIntArray",
				(b?"==":"!="));
		


	}
	public static void displayArray(int[] array,String description) {
		System.out.printf("\n %s:",description);
		
		for(int value:array) {
			System.out.printf("%d",value);
		}
	}

}
