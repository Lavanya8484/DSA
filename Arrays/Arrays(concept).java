Arrays: Collection of similar kind of data in continuous Aloocation.
->In c/c++ we have pointers so defnitely elements will be stored in continuous format
->In Java we dont have pointers then there is a chance of elements might store in random places
Syntax:
datatype [] arrname = {array elements};
->Primitive and Non-Primitive:
  Primitive data-types can be splitted or divided,but non-primitive data-types can be splitted and divided
Examples(primitive):int,float,char....
Examples(non-primitive):all objects that were created by user,string....
Example:
  Class Node{
  int data;
  Node next;
}
->All the objects will be stored in heap memory, all the references will be stored in stack memory
-> Stack memory having less space compare to heap memory.

Example:
import java.util.*;

public class Main {
    public static void main(String[] args) {
     int a = 10;
     int b = 20;
     int c = 30;
     int d = 40;
  }
}
All the variables holding same data-type instead of creating multiple variables create an array to store those values : int[] arr = {10,20,30,40};

-> If we create multiple variables to get the data simple we print the variable 
  when it comes to array if we want to print the data we can print using index values and by default index values will start from 0
->As the heap memory is dynamic the very first value of an array will stored at random place we cant determine 

 int[] arr = {10,20,30,40}; //declaration and initialization happend at same line.

->To get the length of the array we have a method called "array.length" and  in String it is "StringName.length()"
