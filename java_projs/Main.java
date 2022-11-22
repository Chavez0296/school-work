import java.io.*;
import java.util.*;
public class Main
{
public static void populateArray(int []arrayInt){
Random rand=new Random();
for(int i=0;i<100;i++)
arrayInt[i]=rand.nextInt(25)+1;
}
  
public static void printArray(int []arrayInt){
int i=0;
while(i<100){
System.out.print(arrayInt[i]+" ");
i++;
if(i%10==0)
System.out.println();
}
}
  
public static float findAverage(int []arrayInt){
float total=0;
for(int i=0;i<100;i++)
total+=arrayInt[i];
return total/100;
}
  
   public static void main(String[] args) {
       int[] arrayInt = new int[100];
       populateArray(arrayInt);
       printArray(arrayInt);
       System.out.printf("The average is: %.2f",findAverage(arrayInt));
   }
}