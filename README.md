
# Searching Algorithms of Aritificial Intelligence


Artificial Intelligence is the study of building agents that act rationally. Most of the time, these agents perform some kind of search algorithm in the background in order to achieve their tasks. 

The objective of search procedure is to discover a path through a problem
spaces from an initial configuration to a goal state.

The Solution to a search problem is a sequence of actions, called the plan that transforms the start state to the goal state.

This plan is achieved through search algorithms.
### Types of Searching Algorithms

![App Screenshot](https://cdncontribute.geeksforgeeks.org/wp-content/uploads/AI-algos-1-e1547043543151.png)


### 1) Uninformed Search

Also called as Blind Search or Brute Force Search.

Suitable For very limited Problem Space problems.

A blind search is a search that has no information about its domain. The only thing
that a blind search can do is to distinguish a non-goal state from a goal state.

– Breadth-First search

– Depth-First search

– Uniform-Cost search

– Depth-First Iterative Deepening search

#### i) Breadth-First Search

Breadth-first search (BFS) is an algorithm for traversing or searching tree or
graph data structures.

It starts at the tree root and explores the neighbor nodes first, before moving
to the next level neighbors.

Breadth First Search explores the state space in a level by level fashion. Only
when there are no more states to be explored at a given level then the
algorithm move onto the next level.

BFS is complete. If there exists an answer, it will be found (b should be finite).

BFS is optimal (if cost = 1 per step). The path from initial state to goal state
is shallow.

Time & Space Complexity = s O(b^d)
Where "b" = Branch Factor (Number of nodes from root first expands on a set number of nodes, say b.)

& "d" = depth

<h2 align="center"> <u> Program Output </u> </h2> 
 
<h2 align="center"> BFS Problem # 1</h2>
  
<p align = 'center'>
  <img src = "Screenshots/Problem_Screenshots/P_1.png" alt = "Problem # 1" >
</p>

<p align = 'center'>
  <img src = "Screenshots/Solution_Screenshots/BFS/BF_S_1_i.png" alt = "Solution # 1_i">
  <img src = "Screenshots/Solution_Screenshots/BFS/BF_S_1_ii.png" alt = "Solution # 1_ii">
  <img src = "Screenshots/Solution_Screenshots/BFS/BF_S_1_iii.png" alt = "Solution # 1_iii">
  
</p>

<h2 align="center"> BFS Problem # 2</h2>

<p align = 'center'>
  <img src = "Screenshots/Problem_Screenshots/P_2.png" alt = "Problem # 2" >
 </p>
 
 <p align = 'center'>
  <img src = "Screenshots/Solution_Screenshots/BFS/BF_S_2_i.png" alt = "Solution # 2_i" >
  <img src = "Screenshots/Solution_Screenshots/BFS/BF_S_2_ii.png" alt = "Solution # 2_ii" >
</p>

<h2 align="center"> BFS Problem # 3 </h2>

<p align = 'center'>
  <img src = "Screenshots/Problem_Screenshots/P_3.png" alt = "Problem # 3" >
 </p>
 
 <p align = 'center'>
  <img src = "Screenshots/Solution_Screenshots/BFS/BF_S_3_i.png" alt = "Solution # 3_i" >
  <img src = "Screenshots/Solution_Screenshots/BFS/BF_S_3_ii.png" alt = "Solution # 3_ii" >
  <img src = "Screenshots/Solution_Screenshots/BFS/BF_S_3_iii.png" alt = "Solution # 3_iii" >
  <img src = "Screenshots/Solution_Screenshots/BFS/BF_S_3_iv.png" alt = "Solution # 3_iv" >
</p>

<h2 align="center"> BFS Problem # 4 </h2>

<p align = 'center'>
  <img src = "Screenshots/Problem_Screenshots/P_4.png" alt = "Problem # 4" >
 </p>
 
 <p align = 'center'>
  <img src = "Screenshots/Solution_Screenshots/BFS/BF_S_4_i.png" alt = "Solution # 4_i" >
  <img src = "Screenshots/Solution_Screenshots/BFS/BF_S_4_ii.png" alt = "Solution # 4_ii" >
  <img src = "Screenshots/Solution_Screenshots/BFS/BF_S_4_iii.png" alt = "Solution # 4_iii" >
  
</p>

<h2 align="center"> BFS Problem # 5 </h2>

<p align = 'center'>
  <img src = "Screenshots/Problem_Screenshots/P_5.png" alt = "Problem # 5" >
 </p>
 
 <p align = 'center'>
  <img src = "Screenshots/Solution_Screenshots/BFS/BF_S_5_i.png" alt = "Solution # 5_i" >
  <img src = "Screenshots/Solution_Screenshots/BFS/BF_S_5_ii.png" alt = "Solution # 5_ii" >
  <img src = "Screenshots/Solution_Screenshots/BFS/BF_S_5_iii.png" alt = "Solution # 5_iii" >
  <img src = "Screenshots/Solution_Screenshots/BFS/BF_S_5_iv.png" alt = "Solution # 5_iv" >
 
</p>

#### ii) Depth-First Search

Depth-first search (DFS) is an algorithm for traversing or searching tree or
graph data structures. One starts at the root and explores as far as possible
along each branch before backtracking.

A depth first search begins at the root node (i.e. Initial node) and works
downward to successively deeper levels.

An operator is applied to the node to generate the next deeper node in
sequence. This process continues until a solution is found or backtracking is
forced by reaching a dead end.

If you have deep search trees (or infinite – which is quite possible), DFS may end up
running off to infinity and may not be able to recover.

Thus DFS is neither optimal nor complete

Time & Space Complexity = s O(b^d) {In some cases, DFS can be faster than BFS because it does not expand all nodes at a level}

Where "b" = Branch Factor (Number of nodes from root first expands on a set number of nodes, say b.)

& "d" = depth

<h2 align="center"> <u> Program Output </u> </h2> 
 
<h2 align="center"> DFS Problem # 1</h2>
  
<p align = 'center'>
  <img src = "Screenshots/Problem_Screenshots/P_1.png" alt = "Problem # 1" >
</p>

<p align = 'center'>
  <img src = "Screenshots/Solution_Screenshots/DFS/DF_S_1_i.png" alt = "Solution # 1_i">
  <img src = "Screenshots/Solution_Screenshots/DFS/DF_S_1_ii.png" alt = "Solution # 1_ii">
  <img src = "Screenshots/Solution_Screenshots/DFS/DF_S_1_iii.png" alt = "Solution # 1_iii">
  
</p>

<h2 align="center"> DFS Problem # 2</h2>
  
<p align = 'center'>
  <img src = "Screenshots/Problem_Screenshots/P_2.png" alt = "Problem # 2" >
</p>

<p align = 'center'>
  <img src = "Screenshots/Solution_Screenshots/DFS/DF_S_2_i.png" alt = "Solution # 2_i">
  <img src = "Screenshots/Solution_Screenshots/DFS/DF_S_2_ii.png" alt = "Solution # 2_ii">
</p>

</p>

<h2 align="center"> DFS Problem # 3</h2>
  
<p align = 'center'>
  <img src = "Screenshots/Problem_Screenshots/P_3.png" alt = "Problem # 3" >
</p>

<p align = 'center'>
  <img src = "Screenshots/Solution_Screenshots/DFS/DF_S_3_i.png" alt = "Solution # 3_i">
  <img src = "Screenshots/Solution_Screenshots/DFS/DF_S_3_ii.png" alt = "Solution # 3_ii">
  <img src = "Screenshots/Solution_Screenshots/DFS/DF_S_3_iii.png" alt = "Solution # 3_iii">
  <img src = "Screenshots/Solution_Screenshots/DFS/DF_S_3_iv.png" alt = "Solution # 3_iv">
</p>

<h2 align="center"> DFS Problem # 4</h2>
  
<p align = 'center'>
  <img src = "Screenshots/Problem_Screenshots/P_4.png" alt = "Problem # 4" >
</p>

<p align = 'center'>
  <img src = "Screenshots/Solution_Screenshots/DFS/DF_S_4_i.png" alt = "Solution # 4_i">
  <img src = "Screenshots/Solution_Screenshots/DFS/DF_S_4_ii.png" alt = "Solution # 4_ii">
  <img src = "Screenshots/Solution_Screenshots/DFS/DF_S_4_iii.png" alt = "Solution # 4_iii">
</p>

<h2 align="center"> DFS Problem # 5</h2>
  
<p align = 'center'>
  <img src = "Screenshots/Problem_Screenshots/P_5.png" alt = "Problem # 5" >
</p>

<p align = 'center'>
  <img src = "Screenshots/Solution_Screenshots/DFS/DF_S_5_i.png" alt = "Solution # 5_i">
  <img src = "Screenshots/Solution_Screenshots/DFS/DF_S_5_ii.png" alt = "Solution # 5_ii">
  <img src = "Screenshots/Solution_Screenshots/DFS/DF_S_5_iii.png" alt = "Solution # 5_iii">
  <img src = "Screenshots/Solution_Screenshots/DFS/DF_S_5_iv.png" alt = "Solution # 5_iv">
</p>

#### iii) Uniform-First Search

Breadth-first search finds the shallowest goal state, but this may not always be
the least-cost solution for a general path cost function.

Uniform cost search modifies the breadth-first strategy by always expanding
the lowest-cost node rather than the lowest-depth node.

It maintain a priority Queue.

<h2 align="center"> <u> Program Output </u> </h2> 
 
<h2 align="center"> UCS Problem # 1</h2>
  
<p align = 'center'>
  <img src = "Screenshots/Problem_Screenshots/U_P_1.png" alt = "Problem # 1" >
</p>

<p align = 'center'>
  <img src = "Screenshots/Solution_Screenshots/UCS/UCS_S_1_i.png" alt = "Solution # 1_i">
  <img src = "Screenshots/Solution_Screenshots/UCS/UCS_S_1_ii.png" alt = "Solution # 1_ii">
  
</p>

<h2 align="center"> UCS Problem # 2</h2>
  
<p align = 'center'>
  <img src = "Screenshots/Problem_Screenshots/U_P_2.png" alt = "Problem # 2" >
</p>

<p align = 'center'>
  <img src = "Screenshots/Solution_Screenshots/UCS/UCS_S_2_i.png" alt = "Solution # 2">
</p>

</p>

<h2 align="center"> UCS Problem # 3</h2>
  
<p align = 'center'>
  <img src = "Screenshots/Problem_Screenshots/U_P_2.png" alt = "Problem # 3" >
</p>

<p align = 'center'>
  <img src = "Screenshots/Solution_Screenshots/UCS/UCS_S_3_i.png" alt = "Solution # 3_i">
  <img src = "Screenshots/Solution_Screenshots/UCS/UCS_S_3_ii.png" alt = "Solution # 3_ii">
  <img src = "Screenshots/Solution_Screenshots/UCS/UCS_S_3_iii.png" alt = "Solution # 3_iii">
  <img src = "Screenshots/Solution_Screenshots/UCS/UCS_S_3_iv.png" alt = "Solution # 3_iv">
</p>




