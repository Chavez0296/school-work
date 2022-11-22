/* Paste your Exercise10_03 here and click Automatic Check.
For all programming projects, the numbers should be double 
unless it is explicitly stated as integer.
If you get a java.util.InputMismatchException error, check if 
your code used input.nextInt(), but it should be input.nextDouble().
For integers, use int unless it is explicitly stated as long.
@author: Luis Chavez @version 04/24/2022
 */
public class Exercise10_03 {
    public static void main(String[] args) {
        MyInteger int1 = new MyInteger(5);
        MyInteger int2 = new MyInteger(56);
        MyInteger int3 = new MyInteger(2);
        MyInteger int4 = new MyInteger(23);

        System.out.printf("%d is even? %s%n", int1.getValue(), int1.isEven());
        System.out.printf("%d is prime? %s%n", int1.getValue(), int1.isPrime());
        System.out.printf("%d is prime? %s%n", int2.getValue(), int2.isPrime());
        System.out.printf("%d%n", MyInteger.parseInt(new char[] {'3', '5', '3','9'}));
        System.out.printf("%d%n", MyInteger.parseInt("3539"));
         System.out.printf("%d is odd? %s%n", int2.getValue(), int2.isOdd());
         System.out.printf("45 is odd? %s%n", MyInteger.isOdd(45));
        System.out.printf("%d is equal to %d? %s%n", int1.getValue(), int2.getValue(), int1.equals(int2));
        System.out.printf("%d is equal to %d? %s%n", int1.getValue(), int1.getValue(), int1.equals(int1));
      
    }
}


class MyInteger {
    private int mValue;

    public MyInteger(int value) {
        mValue = value;
    }

    public int getValue() {
        return mValue;
    }

    public boolean isEven() {
        return (mValue % 2) == 0;
    }

    public boolean isOdd() {
        return (mValue % 2) == 1;
    }

    public boolean isPrime() {
        if (mValue <= 1)
            return false;
  
        // Check from 2 to n-1
        for (int i = 2; i < mValue; i++)
            if (mValue % i == 0)
                return false;
  
        return true;
    }

    public static boolean isEven(int myInt) {
        return (myInt % 2) == 0;
    }

    public static boolean isOdd(int myInt) {
        return (myInt % 2) == 1;
    }

    public static boolean isPrime(int myInt) {
        if (myInt == 1 || myInt == 2) {
            return true;
        }
        else {
            for (int i = 2; i < myInt; i++) {
                if (i % myInt == 0) return false;
            }
        }
        return true;
    }    

    public static boolean isEven(MyInteger myInt) {
        return myInt.isEven();
    }

    public static boolean isOdd(MyInteger myInt) {
        return myInt.isOdd();
    }

    public static boolean isPrime(MyInteger myInt) {
        return myInt.isPrime();
    }

    public boolean equals(int testInt) {
        if (testInt == mValue) 
            return true;
        return false;
    }

    public boolean equals(MyInteger myInt) {
        if (myInt.mValue == this.mValue) 
            return true;
        return false;
    }

    public static int parseInt(char[] values) {
        int sum = 0;
        for (char i : values) {
            sum += Character.getNumericValue(i);
        }
        return sum;
    }

    public static int parseInt(String value) {
        return Integer.parseInt(value);
    }
}
/*
command>javac Exercise10_03.java
Compiled successful

command>java Exercise10_03
5 is even? false
5 is prime? true
56 is prime? false
20
3539
56 is odd? false
45 is odd? true
5 is equal to 56? false
5 is equal to 5? true


command>
 */