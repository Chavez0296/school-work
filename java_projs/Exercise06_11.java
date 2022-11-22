/* Paste your Exercise06_11 here and click Automatic Check.
For all programming projects, the numbers should be double 
unless it is explicitly stated as integer.
If you get a java.util.InputMismatchException error, check if 
your code used input.nextInt(), but it should be input.nextDouble().
For integers, use int unless it is explicitly stated as long. 
@author: Luis Chavez
@version March 12, 2022
*/
public class Exercise06_11 {
	/** Main Method */
	public static void main(String[] args) {
		// Display table
		System.out.println("\n SalesAmount     Commission");
		System.out.println("-----------------------------");
		for (double salesAmount = 10000; salesAmount <= 100000; salesAmount += 5000) {
			System.out.printf(" %-16.0f", salesAmount);
			System.out.printf("%8.1f\n", computeCommission(salesAmount));
		}
	}

	/** Method commputeCommission computes the commission */
	public static double computeCommission(double salesAmount) {
		double balance, 					// Holds the balance
		       commission;				// Employee commission
		balance = commission = 0.0;	// Initialize balance and commission to 0

		// If sales amount is $10.000.01 and above commission rate is 12%
		if (salesAmount >= 10000.01)
			commission += (balance = salesAmount - 10000) * 0.12;

		// If sales amount is $5,000.01 to $10,000 commissin rate is 10%
		if (salesAmount >= 5000.01)
			commission += (balance -= balance - 5000) * 0.10;

		// If sales amount is $0.01 to $5,000.01 commissin rate is 8%
		if (salesAmount >= 0.01)
				commission += balance * 0.08;
			
		return commission;
	}
}
/*
command>javac Exercise06_11.java
Compiled successful

command>java Exercise06_11

 SalesAmount     Commission
-----------------------------
 10000              900.0
 15000             1500.0
 20000             2100.0
 25000             2700.0
 30000             3300.0
 35000             3900.0
 40000             4500.0
 45000             5100.0
 50000             5700.0
 55000             6300.0
 60000             6900.0
 65000             7500.0
 70000             8100.0
 75000             8700.0
 80000             9300.0
 85000             9900.0
 90000            10500.0
 95000            11100.0
 100000           11700.0


command>
*/