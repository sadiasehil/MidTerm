package algorithm;

import java.util.Arrays;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
            for (int i = 1; i < array.length; ++i)
            {
                int temp = array[i], j = i-1;// Save the current element

                while (j >= 0 && array[j] > temp)
                {   // Shift all elements greater than it to the right
                    array[j+1] = array[j];
                    --j;
                }
                array[j+1] = temp;                    // Insert the current element into the correct spot
            }


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


//Bubble Sort
public int[] bubbleSort(int [] array){
    final long startTime = System.currentTimeMillis();
    int [] list = array;
    for(int i=0;i<list.length;i++){
        for(int j=0;j<list.length-1;j++){
            if(list[j]>list[j+1]){
                int temp = list[j];
                list[j] = list[j+1];
                list[j+1]=temp;
            }
        }
    }
    final long endTime = System.currentTimeMillis();
    final long executionTime = endTime - startTime;

    this.executionTime = executionTime;
    return list;
}
//Merge Sort
    public static int [] leftHalf(int[] array ){
    int size1= array.length/2;
    int [] left = new int [size1];
    for (int i=0;i<size1;i++){
        left[i]=array[i];

    }
    return left ;
}
    public static int [] righttHalf(int[] array ){
        int size1 = array.length/2;
        int size2 =array.length-size1;
        int [] right = new int [size2];
        for (int i=0;i<size2;i++){
            right[i]=array[i+size1];

        }
        return right ;
    }
    public static void merge(int[] result, int[] left, int[] right) {
        int i1 = 0;   // index into left array
        int i2 = 0;   // index into right array

        for (int i = 0; i < result.length; i++)
        {
            if (i2 >= right.length || (i1 < left.length &&
                    left[i1] <= right[i2])) {
                result[i] = left[i1];    // take from left
                i1++;
            } else {
                result[i] = right[i2];   // take from right
                i2++;
            }
        }


    }
    public int [] mergeSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        if (array . length >1 )
        {
            //split array into two halves
            int [] leftArray=  leftHalf(array);
            int [] rightArray =righttHalf(array);
            //recursively sort the two halves
            mergeSort(leftArray);
            mergeSort(rightArray);
            // merge the sorted halves into a sorted whole
            merge(array, leftArray, rightArray);

        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;

        this.executionTime = executionTime;

        return list;
    }
    
// Quick Sort
int partition(int array[], int low, int high)
{
    int pivot = array[high];
    int i = (low-1); // index of smaller element
    for (int j=low; j<high; j++)
    {
        // If current element is smaller than or
        // equal to pivot
        if (array[j] <= pivot)
        {
            i++;

            // swap arr[i] and arr[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    // swap arr[i+1] and arr[high] (or pivot)
    int temp = array[i+1];
    array[i+1] = array[high];
    array[high] = temp;

    return i+1;
}
    public int [] quickSort(int [] array,int low , int high){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(array, low, high);

            // Recursively sort elements before
            quickSort(array, low, pi-1);
            quickSort(array, pi+1, high);
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;

        this.executionTime = executionTime;
        return list;
    }
    //heapSort

    void heapify(int array[], int n, int i)
    {
        int largest = i;  // Initialize largest as root
        int l = 2*i + 1;  // left = 2*i + 1
        int r = 2*i + 2;  // right = 2*i + 2

        // If left child is larger than root
        if (l < n && array[l] > array[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && array[r] > array[largest])
            largest = r;

        // If largest is not root
        if (largest != i)
        {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(array, n, largest);
        }
    }
    public int [] heapSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int n = array.length;

        // Build heap (rearrange array)
        for (int i = array.length/ 2 - 1; i >= 0; i--)
            heapify(array, n, i);

        // One by one extract an element from heap
        for (int i=n-1; i>=0; i--)
        {
            // Move current root to end
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // call max heapify on the reduced heap
            heapify(array, i, 0);
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;

        this.executionTime = executionTime;
        return list;
    }


    public int [] bucketSort(int [] array,int maxArrayElementValue ){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here

        int max = maxArrayElementValue;
        int [] bucket=new int[max+1];

        for (int i=0; i<bucket.length; i++) {
            bucket[i]=0;
        }

        for (int i=0; i<list.length; i++) {
            bucket[list[i]]++;
        }

        int position=0;
        for (int i=0; i<bucket.length; i++) {
            for (int j=0; j<bucket[i]; j++) {
                list[position++]=i;
            }
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;

        this.executionTime = executionTime;

        return list;
    }
    
    public int [] shellSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;

        this.executionTime = executionTime;
        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
