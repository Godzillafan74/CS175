import java.util.Arrays;
public class BasicArraySortV1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[]numbers= {88,47,90,50,77,83,92,96,62,79};
		int lowest;
		String printedNumbers;
		
		for(int x = 0; x < numbers.length; x++) {
			for(int y = x;  y < numbers.length; y++) {
				if(numbers[x] > numbers[7]) {
					lowest = (int)numbers[x];
					numbers[x] = numbers[y];
					numbers[y] = lowest;
				}
			}
		}
		printedNumbers = Arrays.toString(numbers);
		System.out.println(printedNumbers);
	}

}
