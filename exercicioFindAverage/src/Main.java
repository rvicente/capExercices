
public class Main {

	public static void main(String[] args) {
		FindAverage findAverage = new FindAverage();
		
		System.out.println("insert a number: ");
		findAverage.addInteger();
		
		System.out.println("insert a number: ");
		findAverage.addInteger();
		
		System.out.println("insert a number: ");
		findAverage.addInteger();
		
		System.out.println("insert a number: ");
		findAverage.addInteger();
		
		findAverage.getAllIntegers();
		
		findAverage.totalAverage();
		
		findAverage.divisionLastInteger();
	}

}
