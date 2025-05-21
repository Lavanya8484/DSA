In order to reduce the time complexity of a Linear Search from o(n) to o(log(n)) we use Binary Search
-Binary Search is perfored on the Sorted Arrays 
-In binary Search we get the result in log(n) time complexity
Steps:-
  -if array is not sirtwd then the array should be sorted very first
  i) initialize l pointer at zero and r pointer at n-1
  ii) run the loop from l to r 
  iii)break the loop when l and r crosses each other while(i<r)
  iv) Find the middle value  ((l+r)/2)
  v) Now compare middle element to the target :
      if(arr[mid] == target)
        return mid
  vi) if middle value is smaller to the target it means we wont get element at left portion of an array so, (r) remains same 
      we just have to move (l) to mid + 1;
  vi) if middle value is greater so we cant get element in right portion of the array so  the (l) pointer remians same 
       and we just have to move (r) pointer to mid - 1;
                                                                            
