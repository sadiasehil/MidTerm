package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		int n ;
		ArrayList ArrL=new ArrayList();
		Scanner sc = new Scanner (System.in);
		Scanner sc1 = new Scanner (System.in);
		System.out.println(" give the value of n :");
		n=sc.nextInt();
		System.out.println("give the elements of the arrayList:");
		System.out.println("-----------------------");
		for (int i=1;i<=n;i++)
		{
			ArrL.add(sc1.next());
		}
		//System.out.println(ArrL);
		System.out.println("retreive data using for Each loop");
		System.out.println("-----------------------");
		for (Object str : ArrL)
		{
			System.out.println(str);
		}
		System.out.println("Using Iterator :");
		System.out.println("-----------------------");
		Iterator<String> it = ArrL.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

		System.out.println("Remove one element :");
		System.out.println("-----------------------");
		ArrL.remove(1);
		System.out.println("liste after remove the 2nd element  :");
		for (Object str : ArrL)
		{
			System.out.println(str);
		}
		System.out.println("retreive an element  :");
		System.out.println("-----------------------");
		for (Object str : ArrL)
		{
			System.out.println("give the elements you looking for :");
			String el=sc1.next();
			if (el.equals(str))
				System.out.println(el+" is found ");
			else
				System.out.println(el+" doesn't exist ");
		}
		System.out.println("Remove elements :");
		System.out.println("-----------------------");
		ArrL.clear();
		System.out.println("liste after remove :");
		System.out.println("-----------------------");
		for (Object str : ArrL)
		{
			System.out.println(str);
		}


	}
	

	}


