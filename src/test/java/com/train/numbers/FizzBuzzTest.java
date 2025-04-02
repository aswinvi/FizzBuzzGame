package com.train.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FizzBuzzTest {

	FizzBuzz fizzBuzz;

	@BeforeEach
	void setUp() {
		fizzBuzz = new FizzBuzz();
	}

	@ParameterizedTest
	@CsvSource(value = { "2:2", "3:Fizz", "5:Buzz", "9:Fizz","20:Buzz", "15:FizzBuzz", "22:22" }, delimiter = ':')
	void test_should_return_asper_FizzBuzz_Logic(int input, String expected) {

		Assertions.assertEquals(expected, fizzBuzz.compute(input));
	}

}
