-> create a set
-> run  a for loop take the elements from the array and push into set using insert() method
-> start iterating set() values
-> we have to find weather the element is starting or not by decreasing a value and checking that value is there or not in the set
-> if you got starting value then start comparing 

  code:
  import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 101, 3, 102, 4, 103};
        int longest = findLongestConsecutive(arr);
        System.out.println(longest);
    }
    public static int findLongestConsecutive(int[] arr) {
        Arrays.sort(arr); 
        int longest = 1;
        int current = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                continue; 
            } else if (arr[i] == arr[i - 1] + 1) {
                current++;
            } else {
                longest = Math.max(longest, current);
                current = 1;
            }
        }

        longest = Math.max(longest, current);
        return longest;
    }
}
