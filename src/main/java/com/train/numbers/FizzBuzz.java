package com.train.numbers;

public class FizzBuzz {

	public String compute(int input) {
		if (input == 3) {
			return "Fizz";
		} else if (input == 5) {
			return "Buzz";
		}
		return String.valueOf(input);
	}

}
