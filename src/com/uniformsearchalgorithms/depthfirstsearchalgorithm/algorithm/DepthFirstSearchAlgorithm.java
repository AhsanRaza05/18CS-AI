package com.uniformsearchalgorithms.depthfirstsearchalgorithm.algorithm;

import java.util.Stack;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.uniformsearchalgorithms.nodesQueuesComparators.Node;

import java.util.Arrays;

public class DepthFirstSearchAlgorithm {

   public static String traverse(Node rootNode, int size){

        Stack <Node> stack = new Stack<Node>(); 

        Node currentNode;

        String visitedNodes[] = new String[size];

        int index = 0;
        
        String result = "";

        // Choose the starting node, mark it as visited, push it on Stack and make it current node
        visitedNodes[index] = rootNode.getItem();
        stack.push(rootNode);
        currentNode = rootNode;

        int step = 1;

        result += "\n\n\tStep # " + step + "\n\tCurrent Node: " + currentNode + "\n\tStack: " + stack + "\n\tVisited: " + Arrays.toString(visitedNodes) + "\n";

        // Repeat Loop until Stack is empty
        l:while(!stack.isEmpty()){

            step++;

            
            // Find adjacent unvisited node of current node, push it on Stack, mark it visited and make it current node.
            for(int i = 0; i < currentNode.getChildren().length;i++){

                if(!isVisited(currentNode.getChildren()[i].getItem(), visitedNodes)){
    
                    stack.push(currentNode.getChildren()[i]);
                    visitedNodes[++index] = currentNode.getChildren()[i].getItem();
                    currentNode = currentNode.getChildren()[i];

                    result += "\n\tStep # " + step + "\n\tCurrent Node: " + currentNode + "\n\tStack: " + stack + "\n\tVisited: " + Arrays.toString(visitedNodes) + "\n" ;

                    continue l;
                    
                }
    
            }
    
            // If no unvisited adjacent node found, pop out node from Stack and make top of the stack as current node.

            if (!stack.isEmpty()) {
                stack.pop();
                // currentNode = stack.pop();
            }

            if (!stack.isEmpty()) {
                // // stack.pop();
                
                // currentNode = stack.pop();
                // stack.push(currentNode);

                currentNode = stack.peek();

            }
            //currentNode = stack.pop();
           // stack.remove(currentNode);

           result += "\n\tStep # " + step + "\n\tCurrent Node: " + currentNode + "\n\tStack: " + stack + "\n\tVisited: " + Arrays.toString(visitedNodes) + "\n" ;

        }

        result = "\n********************************** Depth First Search Algorithm ****************************** \n"+"\n****************** FINAL TRAVERSING ORDER: " + Arrays.toString(visitedNodes) + " ******************" + result;
        return result;

    }

   public static String search(Node rootNode, int size, String goalState){

       Stack <Node> stack = new Stack<Node>(); 

       Node currentNode;

       String visitedNodes[] = new String[size];

       int index = 0;
       
       String result = "";

       // Choose the starting node, mark it as visited, push it on Stack and make it current node
       visitedNodes[index] = rootNode.getItem();
       stack.push(rootNode);
       currentNode = rootNode;

       int step = 1;

       result += "\n\n\tGoal State: " + goalState +"\n\n\tStep # "  + step + "\n\tCurrent Node: " + currentNode + "\n\tStack: " + stack + "\n\tVisited: " + Arrays.toString(visitedNodes) + "\n";

       // Repeat Loop until Stack is empty
       l:while(!stack.isEmpty()){

           step++;

           if(visitedNodes[index].equalsIgnoreCase(goalState)) {
				
        	   result = "\n********************************** Depth First Search Algorithm ****************************** \n"+"\n****************** FINAL TRAVERSING ORDER: " + Arrays.toString(visitedNodes) + " ******************" + result;
               return result;
				
			}
           
           // Find adjacent unvisited node of current node, push it on Stack, mark it visited and make it current node.
           for(int i = 0; i < currentNode.getChildren().length;i++){

               if(!isVisited(currentNode.getChildren()[i].getItem(), visitedNodes)){
   
                   stack.push(currentNode.getChildren()[i]);
                   visitedNodes[++index] = currentNode.getChildren()[i].getItem();
                   currentNode = currentNode.getChildren()[i];

                   result += "\n\tStep # " + step + "\n\tCurrent Node: " + currentNode + "\n\tStack: " + stack + "\n\tVisited: " + Arrays.toString(visitedNodes) + "\n" ;

                   continue l;
                   
               }
   
           }
   
           // If no unvisited adjacent node found, pop out node from Stack and make top of the stack as current node.

           if (!stack.isEmpty()) {
               stack.pop();
               // currentNode = stack.pop();
           }

           if (!stack.isEmpty()) {
               // // stack.pop();
               
               // currentNode = stack.pop();
               // stack.push(currentNode);

               currentNode = stack.peek();

           }
           //currentNode = stack.pop();
          // stack.remove(currentNode);

          result += "\n\tStep # " + step + "\n\tCurrent Node: " + currentNode + "\n\tStack: " + stack + "\n\tVisited: " + Arrays.toString(visitedNodes) + "\n" ;

       }

       result = "\n********************************** Depth First Search Algorithm ****************************** \n"+"\n****************** FINAL TRAVERSING ORDER: " + Arrays.toString(visitedNodes) + " ******************" + result;
       return result;

   }

   
    
   public static boolean isVisited(String n, String visitedNodes[]){

        for(int i = 0; i < visitedNodes.length; i++){

            if(n.equalsIgnoreCase(visitedNodes[i])){

                return true;
            }
        }

        return false;

    }
    
}


