package com.train.numbers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	FizzBuzz fizzBuzz;

	@BeforeEach
	void setUp() {
		fizzBuzz = new FizzBuzz();
	}

	@Test
	void should_Return_Same_Number_Given() {
		assertEquals("2", fizzBuzz.compute(2));
	}
	
	@Test
	void should_Return_Fizz_If_Number_Given_Is_3() {
		assertEquals("Fizz", fizzBuzz.compute(3));
	}
	
	@Test
	void should_Return_Buzz_If_Number_Given_Is_5() {
		assertEquals("Buzz", fizzBuzz.compute(5));
	}
	
	@Test
	void should_Return_Fizz_If_Number_Given_Is_Divisible_By_3() {
		assertEquals("Fizz", fizzBuzz.compute(9));
	}
	
	@Test
	void should_Return_Buzz_If_Number_Given_Is_Divisible_By_5() {
		assertEquals("Buzz", fizzBuzz.compute(20));
	}


}
