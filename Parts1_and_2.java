import java.util.Scanner;

public class Parts1_and_2 {
	
	public static void swap (int [] data, int i, int j) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
	
	public static void bubble (int[] data) {
		System.out.println("BUBBLE Unsorted List");
		for (int i = 0; i < data.length; ++i) {
			data[i] = (int)(Math.random()*100) + 1;
			System.out.println(data[i]);
		}
		System.out.println("");
		for (int i = data.length-1; i > 0; --i) {
			for (int j = 0; j < i; ++j) {
				if (data[j] > data[j+1]) {
					swap (data, j, j+1);
				}
			}
		} 
		System.out.println("BUBBLE Sorted List");	
		for (int i = 0; i < data.length; ++i) {
			System.out.println(data[i]);
		
	}
	}
	public static void selection (int [] data) {
		System.out.println("SELECTION Unsorted List");
		for (int i = 0; i < data.length; ++i) {
			data[i] = (int)(Math.random()*100) + 1;
			System.out.println(data[i]);
		}
		System.out.println("");
		for (int i = 0; i < data.length; ++i) {
		for (int j = i+1; j < data.length; ++j) {
			if (data[i] > data[j]) 
				swap (data, i, j);
		}
		}
		System.out.println("SELECTION Sorted List");	
		for (int i = 0; i < data.length; ++i) {
			System.out.println(data[i]);
	}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How many numbers would you like to sort?");
		Scanner scan = new Scanner (System.in);
		int arraySize = scan.nextInt();
		scan.close();
		int[] nums = new int[arraySize];
		System.out.println("");
		bubble(nums);
		System.out.println("");
		selection(nums);
	}
	}

	

