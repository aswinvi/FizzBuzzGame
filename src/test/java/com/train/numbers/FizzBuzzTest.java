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

}
