LinearSearch:-
Searching the elements in an array in a linear way whenever the array length is small we will use linear search 
time complexity -O(n)

example:- input:[5,8,,11,14,16]; target:- 14
  
import java.util.*;
public class Main {
    public static void main(String[] args) {
      int[] arr = {5,8,11,14,16};
      int target = 14;
      int result = findIndex(arr,target);
      System.out.println(result);
  }
  public static int findIndex(int[] arr,int target){
    for(int i=0;i<arr.length;i++){
      if(arr[i] == target){
        return i;
      }
    }
    return -1;
  }
}
