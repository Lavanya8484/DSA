-> Trees are acyclic graphs (do not form cycles)

Tree Creation:
we have to create a node which contains data as well as left and right pointer

  
Technical Terms:
-Starting node is called root node eventually every node is a root node
- whatever nodes were added to the root node we call them as child nodes

  
Types of trees:
  N-array Tree ->Single Node contains n number of childs
  Binary-Tree ->At max two child nodes can be added to the root node

  Examples:
  N-array Tree: Trie's
  Binary Tree: - Binary Search Tree
               - Avl tree and red-black Tree
               - Segment Tree
  
  -To travel from root node to Leaf Nodes we have two types of traversals:
       i) Breadth first Search
            -Level order Traversal 
       ii) Depth first Search
             


  *DFS:
             -PreOrder - root,left,right
             -InOrder - left,root,right
             -PostOrder - left,right,root

*Complete Binary Tree :
-Every level should be filled and the nodes should be start from left to right
  
*Full Binary Tree :
-Every Level Should be filled and every node should contain either 2 children or 0 children
  
*Perfect Binary Tree :
-Every node should contains 2 child nodes
-Every level should be filled

