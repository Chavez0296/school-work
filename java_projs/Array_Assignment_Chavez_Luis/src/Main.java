import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);

        int n,i,j,k,m,sum = 0; //initialize

        System.out.println("Enter the size of the Array: ");
        n = sc.nextInt(); //User input

        int arr[] = new int[n]; // Store elements into Array
        int result[] = new int[n]; // Store the result
        System.out.print("Enter the unique integer values" + " ");
        for(i = 0; i <n;i++){
            arr[i] = sc.nextInt(); //Loop to input the 'size' amount of unique integers
        }

        for(j = 0; j<n;j++){
            for(k = 0; k<=j;k++){
                sum = sum +arr[k];
            }
            result[j] = sum;
            sum = 0;
        }
        for(m = 0; m<n;m++){
            System.out.print(result[m]+" ");
        }

    }
}
