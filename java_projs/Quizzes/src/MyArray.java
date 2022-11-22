public class MyArray {
    private int[] array;
    private int count;
    private int size;

    public MyArray(){
        array = new int[]{4,6,9,10,3,11,1,2,5,7,8};
        count = 0;
        size= 1;
    }

    public int[] sortArray(int tempArray[]){
        int n = tempArray.length;
        int temp = 0;
        for(int i = 0; i < n; i++){
            for(int j = 1; j <(n-i);j++){
                if(tempArray[j-1] > tempArray[j]){
                    temp = tempArray[j-1];
                     tempArray[j-1] = tempArray[j];
                     tempArray[j] = temp;
                }
            }
        }
        return tempArray;
    }
    public int getKthMin(int k){
        int[] tempArray = array.clone();
        tempArray = sortArray(tempArray);

        return tempArray[k-1];

    }
}

