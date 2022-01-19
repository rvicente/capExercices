import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindAverage {
	List<Integer> integersList = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	
	public void addInteger() {
		integersList.add(scanner.nextInt());
	}
	
	public void getAllIntegers() {
		for (Integer integer : integersList) {
			
			System.out.println(integer);
		}
	}
	
	public void totalAverage() {
		 double sum = 0;
		for (Integer integer : integersList) {
			sum += integer;
		}
		
		System.out.println("the average is: " + sum/(integersList.size()));
		
	}
}
