package math;

import databases.ConnectDB;

import java.sql.Array;
import java.util.ArrayList;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		ArrayList<Object> list = new ArrayList<>();
		int counter = 0;
		for(int i=0; i<=1000000; i++){
			if(isPrime(i)){
				counter++;
			System.out.println(i);
			list.add(i);
			}
		}
			ConnectDB connectDB = new ConnectDB();	// this part we have to write after write method downthere
			connectDB.InsertDataFromArrayListToMySql(list, "primes", "Number");
		System.out.println("total prime number : " + counter);


	}
	public static boolean isPrime(int num){
	if(num == 2){
		return true;
	}
	if(num % 2 == 0){
		return false;
	}
	for(int i=3; i*i<=num; i=i+2){
		if(num % i == 0){
			return false;
		}
	}
	return true;

	}
}
