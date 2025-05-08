For-Each loop / enhanced for loop:-
In collections we dont have index values in those situations we have to use for-each loop
->Example:
import java.util.*;
public class Main {
    public static void main(String[] args) {
      
      int[] arr = {1,2,3,4,5};
      for(int var :arr){
        System.out.println(var);
    }
  }
}
