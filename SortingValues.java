/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingvalues;

import java.util.Arrays;

/**
 *
 * @author kendrabooker
 */
public class SortingValues {

    /**
     * @param args the command line arguments
     */
   public static void main( String[] args )
	{
		int[] arr = { 45, 87, 39, 32, 93, 86, 12, 44, 75, 50 };

		// Display the original (unsorted values)
		System.out.print("before: ");
		for ( int i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();

		Arrays.sort(arr);
		

		// Display the values again, now (hopefully) sorted.
		System.out.print("after : ");
		for ( int i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();
	}
}