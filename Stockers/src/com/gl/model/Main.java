package com.gl.model;
import com.gl.service.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 	 
		 AscendSort ob = new AscendSort();
		 DescendSort oc = new DescendSort();
		 StockPrices sp = new StockPrices();
		 		 
		 System.out.println("Enter the no. of companies: ");
		 Scanner sc = new Scanner(System.in);
		 int size = sc.nextInt();
		
		 double[] arr = new double[size];
		 for(int i=0; i < size; i++) {
			 System.out.println("Enter the stock prices of company " + (i + 1) + ":");
			 arr[i] = sc.nextDouble();
			 System.out.println("Whether the company's stock rose from yesterday or not?");
			 boolean bool = sc.nextBoolean();
		
			 StockPrices.stockPrices(bool);
		 }
		 int option;
		 do {
			 System.out.println("-----------------------------------------------");
			 System.out.println("Enter the operation that you want to perform:");
			 System.out.println("1. Display the companies stock prices in ascending order");
			 System.out.println("2. Display the companies stock prices in descending order");
			 System.out.println("3. Display the total no of companies for which stock prices rose today");
			 System.out.println("4. Display the total no of companies for which stock prices declined today");
			 System.out.println("5. Search a specific stock price");
			 System.out.println("press 0 to exit");
			 System.out.println("-----------------------------------------------");
			 option = sc.nextInt();
			 switch (option) {
				case 0:
					option = 0;
					break;
				case 1: {
					ob.sort(arr, 0, arr.length - 1);
					ob.printArray(arr);

				}
				break;
				case 2: {
					oc.sort(arr, 0, arr.length - 1);
				    oc.printArray(arr);
				}
				break;
				case 3: {
					sp.rise();
				}
				break;
				case 4: {
					sp.drop();
				}
				break;
				case 5: {
					System.out.println("Enter the key value:");
					double x = sc.nextDouble();
					ob.sort(arr, 0, arr.length - 1);
					SearchSP.binarySearch(arr, 0 , arr.length - 1, x);
				}
				break;
				default:
					System.out.println("enter valid option");
				}

			} while (option != 0);
			System.out.println("Exited successfully");
			sc.close();
	     }

}
