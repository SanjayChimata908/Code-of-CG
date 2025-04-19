package Streams_api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,22,31,55,76,85,35);
		
		Optional<Integer> sum = list.stream().reduce((a,b) -> a+b);
		System.out.println("Sum of Numbers: "+ sum.get());
		
	}
	
}