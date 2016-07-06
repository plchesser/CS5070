import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class SelectionTiming {

	public static void swap (int [] data, int i, int j) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
	
	public static void selection (int [] data) {
		System.out.println("SELECTION Unsorted List");
		for (int i = 0; i < data.length; ++i) {
			data[i] = (int)(Math.random()*1000) + 1;
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
		Scanner scan = new Scanner (System.in);
		long running_time=0;
		System.out.println("How many numbers would you like to sort?");
		int n = scan.nextInt();
		
		System.out.println("How many iterations?");
		int num_i = scan.nextInt();
		scan.close();
		for (int i = 0; i < num_i; ++i) {
			int [] nums = new int [n];
			Instant startTime = Instant.now();
			selection(nums);
			Instant endTime = Instant.now();
			Duration total_time = Duration.between(startTime, endTime);
			running_time += total_time.toMillis();
			System.out.println("Total running time: " +running_time + "\n");
			
		}
	}
	
}

