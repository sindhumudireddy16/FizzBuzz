package com.fizzbuzz;

import static com.fizzbuzz.FizzBuzz.fizzBuzz;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void multiplesOf3_shouldReturnFizz() {
        assertThat(fizzBuzz("9"), is("Fizz"));
        assertThat(fizzBuzz("12"), is("Fizz"));
        assertThat(fizzBuzz("18"), is("Fizz"));
        assertThat(fizzBuzz("21"), is("Fizz"));
    }

    @Test
    public void multiplesOf5_shouldReturnBuzz() {
        assertThat(fizzBuzz("5"), is("Buzz"));
        assertThat(fizzBuzz("10"), is("Buzz"));
        assertThat(fizzBuzz("20"), is("Buzz"));
        assertThat(fizzBuzz("25"), is("Buzz"));
    }

    @Test
    public void multiplesOf15_shouldReturnFizzbuzz() {
        assertThat(fizzBuzz("15"), is("FizzBuzz"));
        assertThat(fizzBuzz("45"), is("FizzBuzz"));
        assertThat(fizzBuzz("60"), is("FizzBuzz"));
        assertThat(fizzBuzz("75"), is("FizzBuzz"));
    }
    
    @Test
    public void notmultiplesOf3amd5_shouldReturn() {
    	assertThat(fizzBuzz("2"), is("Divided 2 by 3 \nDivided 2 by 5"));
    	assertThat(fizzBuzz("4"), is("Divided 4 by 3 \nDivided 4 by 5"));
        assertThat(fizzBuzz("7"), is("Divided 7 by 3 \nDivided 7 by 5"));
        assertThat(fizzBuzz("8"), is("Divided 8 by 3 \nDivided 8 by 5"));
    }
    
    @Test
    public void notAnInteger() {
    	assertThat(fizzBuzz("A"), is("Invalid Item"));
    	assertThat(fizzBuzz("B"), is("Invalid Item"));
        assertThat(fizzBuzz("C"), is("Invalid Item"));
        assertThat(fizzBuzz("D"), is("Invalid Item"));
    }
}
