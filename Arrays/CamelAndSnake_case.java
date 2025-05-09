Camel and Snake case:
Camel case: Second word first letter should be capital
  ->arrName.length;
Snake case: seperated with underscore "_"
  ->String_name.length();
In Java it is preffered to write in camel case to write production level codes
  example(production-level code)://use clear meaningfull method/function names
  void additionOfTwoNumbers(){
}

***Type of Printin Formats:***
i)For-loop
import java.util.*;
public class Main {
    public static void main(String[] args) {
     int[] arr = {10,20,30,40};
     for(int i =0;i<arr.length;i++){
       System.out.print(" "+arr[i]);
     }
  }
} //We can print array values using simple for-loop.

ii)For-Each loop
import java.util.*;
public class Main {
    public static void main(String[] args) {
     int[] arr = {10,20,30,40};
    for(int i:arr){
      System.out.print(i+" ");
    }
     }
  }
}

->In for-each loop we dont need index values 
  
iii)using toString(); inbuilt-method 
  public class Main {
    public static void main(String[] args) {
     int[] arr = {10,20,30,40};
    System.out.println(Arrays.toString(arr));
    }
     }
->toString() is an in-built method to print an array it will accept one argument and that is array itself

***Declaring the size of an array and initializing the values later***
->Array having fixed size if you declare an array Size it cant be changed
int[] arr = new int[5];//array reference is created
//before = array reference was created with the help of new keyword actual object will be created in the
//heap memory for that particular data-type and size
->if the array type is integer the default values will be zero's
-> if it is a string all the default value are NULL and NULL is a literal

// Example:
import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the values:");
      int arr[] = new int[5];
      for(int i =0; i<arr.length;i++){
        //take the values from  the user 
        arr[i] = sc.nextInt();
      }
      for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
      }
      // for(int i:arr){
      //   System.out.println(i);
      // }
      System.out.print(Arrays.toString(arr));
     
    }
     }

->Whenever you are trying to assign or trying to get nth value of array you will get an exception called 
  "Array out of bound"

  
