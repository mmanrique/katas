/**
 * 
 */
package com.manuel.prime.factors;

import java.util.ArrayList;

/**
 * @author mmanrique
 *
 */
public class PrimeFactors {

	/**
	 * @param i
	 * @return 
	 */
	public static ArrayList<Integer> getPrime(int i) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		if(i%2==0){
			arrayList.add(2);
			i=i/2;
		}
		if(i>1){
			arrayList.add(i);
		}
		return arrayList;
	}

}
