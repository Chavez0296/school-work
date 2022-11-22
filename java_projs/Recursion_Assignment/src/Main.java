import java.util.Scanner;

public class Main {

    public static int T(int n){
        if(n==1){
            return 1;
        }
        else if(n==2){
            return 2;
        }
        else{
            return 4 * T(n-1) + 2 * T(n-2) + 1;
        }
    }

    public static void main(String[] args) {
        System.out.println("T(4) = "+T(4));
        System.out.println("T(7) = "+T(7));
    }

}
