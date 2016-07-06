import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class BubbleTiming {

	public static void swap (int [] data, int i, int j) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
	
	public static void bubble (int[] data) {
		System.out.println("BUBBLE Unsorted List");
		for (int i = 0; i < data.length; ++i) {
			data[i] = (int)(Math.random()*1000) + 1;
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
		System.out.println("");
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
			bubble(nums);
			Instant endTime = Instant.now();
			Duration total_time = Duration.between(startTime, endTime);
			running_time += total_time.toMillis();
			System.out.println(running_time);
		}
	}
	
}

