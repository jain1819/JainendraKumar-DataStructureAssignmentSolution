package com.gl.DSAgradedArchitect.service;

public class AscendingSort {
	public   void merge(int floor[], int left, int mid, int right) {
		// Finding sizes of two sub arrays to be merged
		int leftArraySize = mid - left + 1;
		int rightArraySize = right - mid;

		/* Creating temporary arrays */
		int leftArray[] = new int[leftArraySize];
		int rightArray[] = new int[rightArraySize];

		/* Copy data to temporary arrays, division of array */
		for (int i = 0; i < leftArraySize; ++i)
			leftArray[i] = floor[left + i];
		for (int j = 0; j < rightArraySize; ++j)
			rightArray[j] = floor[mid + 1 + j];

		/* Merge the temporary arrays, conquering the array */

		// Initial indexes of first and second sub-arrays
		int i = 0, j = 0;

		// Initial index of merged sub-array array
		int k = left;
		while (i < leftArraySize && j < rightArraySize) {
			if (leftArray[i] <= rightArray[j])// for descending (leftArray[i]>= rightArray[j] 
			{
				floor[k] = leftArray[i];
				i++;
			} else {
				floor[k] = rightArray[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of Left array if any */
		while (i < leftArraySize) {
			floor[k] = leftArray[i];
			i++;
			k++;
		}

		/* Copy remaining elements of Right array if any */
		while (j < rightArraySize) {
			floor[k] = rightArray[j];
			j++;
			k++;
		}
	}

	// Main function that sorts array[left...right] using merge()
	public  void sort(int[] floor, int left, int right) {
		if (left < right) {
			// Find the middle point
			int mid = (left + right) / 2;

			// Sort first and second halves, division of array
			sort(floor, left, mid);
			sort(floor, mid + 1, right);

			// Merge the sorted halves, conquering the array
			merge(floor, left, mid, right);
		}
	}
				

}
