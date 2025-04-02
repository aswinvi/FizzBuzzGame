package com.train.numbers;

public class FizzBuzz {

	private static final String BUZZ = "Buzz";
	private static final String FIZZ = "Fizz";
	private static final String FIZZ_BUZZ = "FizzBuzz";

	public String compute(int input) {

		if (isDivisibleBy3(input) && isDivisibleBy5(input)) {
			return FIZZ_BUZZ;
		} else if (isDivisibleBy3(input)) {
			return FIZZ;
		} else if (isDivisibleBy5(input)) {
			return BUZZ;
		}
		return String.valueOf(input);
	}

	private boolean isDivisibleBy3(int input) {
		return input % 3 == 0;
	}

	private boolean isDivisibleBy5(int input) {
		return input % 5 == 0;
	}

}
