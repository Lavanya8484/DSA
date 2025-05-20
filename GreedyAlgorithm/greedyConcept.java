-> n meeting in a room 
-> job scheduling 
-> 0/1 fractional knapsack 
  majorly used problems in greedy algorithm 


que:- n- meeting in a room (Steps)
  inp: n=6, Start[]={1,3,0,5,8,5}, end[] = {2,4,5,7,9,9}
  op: 1,2,4,5
  steps:-
  i)Takes pairs of the input
  ii)Custom  sort the pairs with compare according to the question (Not in ascending or in descending)
  iii) End-time of current meeting should lessThan (<) start-time of next meeting 


que:- 0/1 fractional kanpsack problem (Steps)
    inp: N=3, capacity = 50, values[] = {100,60,120}, weight[] = {20,10,30}
    op: 240.00
    steps:-
  i) [(100,20,5),(60,10,6),(120,30,4)] take (value,weight,and perkg weight) as a triplets 
  ii) [(60,10,6),(100,20,5),(120,30,4)] ->sorted based on perkg weights 
  iii) when you have consider a triplet with max value then subtract that value from the initial capacity do this till the maxCapacity is fulled
  iv) calculate the values 
