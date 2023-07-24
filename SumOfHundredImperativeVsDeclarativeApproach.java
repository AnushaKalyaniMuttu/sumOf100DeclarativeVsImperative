package com.test;

import java.util.stream.IntStream;

public class SumOfHundredImperativeVsDeclarativeApproach {

	public static void main (String [] args) {
		//imperative approach
		int sum=0;
		for(int i=0;i<=100;i++) {
			sum=sum+i;
		}
		System.out.println("The sum "+sum);
		
		//Declarative approach
		System.out.println(IntStream.rangeClosed(0, 100).sum());
	}
}
