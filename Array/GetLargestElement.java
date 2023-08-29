package Array;

import javax.print.DocFlavor.INPUT_STREAM;

public class GetLargestElement {
    public static int largest(int numbers[]){
        int Largest = Integer.MIN_VALUE; //- infinity
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>Largest){
                Largest = numbers[i];
            }
        }
        return Largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7,8,9};
        int x = largest(numbers);
        System.out.println("Largest number is " + x);
    }
    
}
