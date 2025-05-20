p-possible np = not-possible
arr = [1,2,3]          
SubArray:-  [1,2] (p)             SubSet:- [1,2]  (p)
            [1,3] (np)                     [1,3]  (p)
            [2,3] (p)                      [2,1]  (np)
            [3,2] (np)                     [2,3]  (p)

->SubArray means part of array that should be consequtive and continuous, it should not be backward only the forward elements should be taken as subarray 
i.e, the subarray [2,1] is taking elements backward so it is not belongs to subArray

                                                   
str = "abc"
SubSequence:- ab (p)              SubString:-  ab  (p)
              bc (p)                           bc  (p)
              ac (p)                           ac  (np)
              ca (np)                          ca  (np)

-> subsequence is also similar to SubArray but where the elements may not be contigious it can take the previous elements as a subsequence as a subsequence 
-> subString should contigious and it is just similar to subarray
