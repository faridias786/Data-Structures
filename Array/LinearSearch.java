package Array;

public class LinearSearch {
    public static int linearSearch(int array[],int key){
        for(int i=0;i<array.length;i++){
            if (array[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int array[] = {10,20,30,40,50,60,70,80};
        int key = 10;
        int index = linearSearch(array,key);
        if(index==-1){
            System.out.println("Not Found");
        }
        System.out.println("Key is at index "+ index);
    }
}
