public class Rectangle {
    public static void rectangle(int n){
        for(int i = 1; i <=n;i++){
            for(int j = 1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
