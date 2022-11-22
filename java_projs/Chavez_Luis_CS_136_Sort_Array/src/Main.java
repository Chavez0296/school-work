
public class Main {

    public static void main(String[] args) {

    int[] arr = new int[]{10,20,15,40,80,97,26,18,92};

    int k = 1;
    int n = arr.length;

    for(int i = 0; i<n-1;i++){
        for(int j = i + 1; j<n;j++) {
            if (arr[i] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
    }
    System.out.println(arr[n-k]);
    }
}
