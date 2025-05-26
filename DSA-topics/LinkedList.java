LinkedList : Collection of similar type of data in random allocation 
Types:
i)Single LinkedList(single-direction)
ii)Dobly LinkedList(both-dirction)
iii)Circular LinkedList(Head-tail are same)
->major advantage is Faster Insertion and Deletion


->In LinkedList we have to store the data as-well-as address,we don't have any data-types to store data and address
  We have to create own data-Structure
  for that we have created a class and the class name is Node
  ->Declare 2 variables data and next
  
  Template:
 Class Node{
  int data;
  Node next;
}

->We have 2 possibilities 
  - Single node and last node
  -Inbetween nodes
->So if we want to create objects we wnat to call the constructor which will give the output in theses tow forms 

i) Single node and last node (The node should be created with data and address Null for that we have to create a 
  constructor which helps to create node with data and address null) 
  
Node(int data){
  this.data = data1;
  this.next = null;
}

ii)Inbetween nodes(The node should be craeted with data and address Next for that we have to create a 
  constructor which helps to create node with data and address next)
  
Node(int data,Node node){
  this.data = data1;
  this.next = next1;
}

  
