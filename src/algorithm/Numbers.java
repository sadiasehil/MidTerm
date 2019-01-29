package algorithm;

import databases.ConnectToSqlDB;

import java.util.List;
import java.util.Random;

/*
 *Created by mrahman on 04/02/2018.
 */
public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
	 *
	 * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
	 *
	 */

	public static void main(String[] args) throws Exception {
		
		int [] num = new int[10000];
		storeRandomNumbers(num);
		for (int i= 0;i<num.length;i++) {
			System.out.print(num[i]+" ");

		}
		System.out.println();
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		//Selection Sort
		System.out.println("**************Selection Sort************ ");
		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
        List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
		System.out.println("Read Selection sort numbers from DataBase :");
        printValue(numbers);
		System.out.println();
		int n = num.length;
		randomize (num, n);

		//By following above, Continue for rest of the Sorting Algorithm....
		//Insertion Sort
		System.out.println("*************Insertion Sort *************");
		System.out.println("Numbers before sorting ");
		for (int i= 0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "Insertion_sort", "SortingNumbers");
		List<String> numbers1 = connectToSqlDB.readDataBase("Insertion_sort", "SortingNumbers");
		System.out.println("Read Insertion  sort numbers from DataBase :");
		printValue(numbers1);
		System.out.println();
		randomize (num, n);

		//bubble Sort

		System.out.println("*************bubbleSort*************");
		System.out.println("Numbers before sorting ");
		for (int i= 0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		algo.bubbleSort(num);
		long bubbleSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in bubble Sort take: " + bubbleSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "bubbleSort_sort", "SortingNumbers");
		List<String> numbers2 = connectToSqlDB.readDataBase("bubbleSort_sort", "SortingNumbers");
		System.out.println("Read Bubble sort numbers from DataBase :");
		printValue(numbers2);
		System.out.println();
		randomize (num, n);

		//Merge Sort
		System.out.println("*************Merge Sort*************");
		System.out.println("Numbers before sorting ");
		for (int i= 0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		algo.mergeSort(num);
		long MergeSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Merge Sort take: " + MergeSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "Merge_sort", "SortingNumbers");
		List<String> numbers3 = connectToSqlDB.readDataBase("Merge_sort", "SortingNumbers");
		System.out.println("Read Merge sort numbers from DataBase :");
		printValue(numbers3);
		System.out.println();
		randomize (num, n);

		// Quick Sort

		System.out.println("*************Quick Sort*************");
		System.out.println("Numbers before sorting ");
		for (int i= 0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		algo.quickSort(num,0,num.length-1);
		long QuickSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Quick Sort take: " + QuickSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "Quick_sort", "SortingNumbers");
		List<String> numbers4 = connectToSqlDB.readDataBase("Quick_sort", "SortingNumbers");
		System.out.println("Read Quick sort numbers from DataBase :");
		printValue(numbers4);
		System.out.println();
		randomize (num, n);

		//Heap Sort

		System.out.println("*************Heap Sort*************");
		System.out.println("Numbers before sorting ");
		for (int i= 0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		algo.heapSort(num);
		long HeapSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Heap Sort take: " + HeapSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "Heap_sort", "SortingNumbers");
		List<String> numbers5 = connectToSqlDB.readDataBase("Heap_sort", "SortingNumbers");
		System.out.println("Read Heap sort numbers from DataBase :");
		printValue(numbers5);
		System.out.println();
		randomize (num, n);

       //bucketSort
		System.out.println("*************bucket Sort*************");
		System.out.println("Numbers before sorting ");
		for (int i= 0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		algo.bucketSort(num,19999);
		long bucketSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in bucket Sort take: " + bucketSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "bucket_sort", "SortingNumbers");
		List<String> numbers6 = connectToSqlDB.readDataBase("bucket_sort", "SortingNumbers");
		System.out.println("Read Quick sort numbers from DataBase :");
		printValue(numbers6);
		System.out.println();
		randomize (num, n);

		//shellSort
		System.out.println("*************shell Sort*************");
		System.out.println("Numbers before sorting ");
		for (int i= 0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		algo.shellSort(num);
		long shellSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in shell Sort take: " + shellSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "shell_sort", "SortingNumbers");
		List<String> numbers7 = connectToSqlDB.readDataBase("shell_sort", "SortingNumbers");
		System.out.println("Read shell sort numbers from DataBase :");
		printValue(numbers7);
		System.out.println();
		randomize (num, n);



		//Come to conclusion about which Sorting Algo is better in given data set.

	}

	public static void storeRandomNumbers(int [] num){
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			num[i] = rand.nextInt(10000);
		}
	}

	public static void randomize( int arr[], int n)
	{
		Random r = new Random();
		// Start from the last element and swap one by one. We don't
		// need to run for the first element that's why i > 0
		for (int i = n-1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	public static void printValue(List<String> array){
		for(String st:array){
			System.out.print(st+" ");
		}
	}
}
