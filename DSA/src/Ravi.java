import java.util.*;
public class Ravi{
    public static int binarySearch(int numbers[],int key){
        int start = 0,end = numbers.length;
        while(start<=end){
            int mid = (start + end)/2;
            if(numbers[mid] == key){
                return mid;
            }
            if(mid>key){
                end = mid -1;
            }else{
                start = mid + 1;
            }
        }
        return -1;

    }







    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,9};
        int key = 9;
        System.out.println("Key is at index " + binarySearch(numbers,key));
    }
}
