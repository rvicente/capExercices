import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FindAverage {
	List<Integer> integersList = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	
	public void addInteger() {
		integersList.add(scanner.nextInt());
	}
	
	public void getAllIntegers() {
		System.out.println("the number are: ");
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
	
	public void divisionLastInteger() {
		
		double sum = 0; 
		for (int i = 0; i < (integersList.size()-1); i++) {
			sum += integersList.get(i);
		}
		
		System.out.println("The result of the division is: " + sum/integersList.get(integersList.size()-1));
	}
}
