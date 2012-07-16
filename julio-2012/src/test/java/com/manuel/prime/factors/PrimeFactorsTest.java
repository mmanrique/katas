/**
 * 
 */
package com.manuel.prime.factors;
import java.util.ArrayList;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
/**
 * @author mmanrique
 *
 */
public class PrimeFactorsTest {
	@Test
	public void testPrimeUno() throws Exception {
		ArrayList<Integer> primes=PrimeFactors.getPrime(1);
		assertThat(primes, is(equalTo(generateList())));
	}
	@Test
	public void testPrimeDos() throws Exception {
		ArrayList<Integer> primes=PrimeFactors.getPrime(2);
		assertThat(primes, is(equalTo(generateList(2))));
	}
	@Test
	public void testPrimeTres() throws Exception {
		ArrayList<Integer> primes=PrimeFactors.getPrime(3);
		assertThat(primes, is(equalTo(generateList(3))));
	}
	@Test
	public void testPrimeCuatro() throws Exception {
		ArrayList<Integer> primes=PrimeFactors.getPrime(4);
		assertThat(primes, is(equalTo(generateList(2,2))));
	}
	@Test
	public void testPrimeCinco() throws Exception {
		ArrayList<Integer> primes=PrimeFactors.getPrime(5);
		assertThat(primes, is(equalTo(generateList(5))));
	}
	
	@Test
	public void testPrimeSeis() throws Exception {
		ArrayList<Integer> primes=PrimeFactors.getPrime(6);
		assertThat(primes, is(equalTo(generateList(2,3))));
	}
	
	
	private ArrayList<Integer> generateList(int... values){
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		for (Integer integer : values) {
			arrayList.add(integer);
		}
		return arrayList;
	}
}
