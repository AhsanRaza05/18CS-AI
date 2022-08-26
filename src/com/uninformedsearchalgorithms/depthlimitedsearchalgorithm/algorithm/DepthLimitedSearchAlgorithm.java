package com.uninformedsearchalgorithms.depthlimitedsearchalgorithm.algorithm;

import java.util.*;

import com.uninformedsearchalgorithms.nodesQueuesComparators.*;

public class DepthLimitedSearchAlgorithm {

	public static String traverse(Node rootNode, int size, int level){

        Stack <Node> stack = new Stack<Node>(); 

        int countLevel = 0;
        Node currentNode;

        String visitedNodes[] = new String[size];
        String temp[];

        int index = 0;

        // Choose the starting node, mark it as visited, push it on Stack and make it current node.
        visitedNodes[index] = rootNode.getItem();
        temp = visitedNodes.clone();
        stack.push(rootNode);
        currentNode = rootNode;

        int step = 1;

        String result = "\n\n\tDepth Level Limit: " + level + "\n";
        result += "\n\tStep # " + step + "\n\tCurrent Node: " + currentNode + "\n\tStack: " + stack + "\n\tVisited: " + Arrays.toString(visitedNodes) + "\n\n";
       

        // Repeat Loop until Stack is empty
        l:while(!stack.isEmpty()){

            step++;
            
            //  Find adjacent unvisited node of current node of given level, push it on Stack, mark it visited and make it current node.

            for(int i = 0; i < currentNode.getChildren().length;i++){

                if(!isVisited(currentNode.getChildren()[i].getItem(), visitedNodes) && countLevel < level){
    
                    stack.push(currentNode.getChildren()[i]);
                    countLevel++;
                    visitedNodes[++index] = currentNode.getChildren()[i].getItem();
                    currentNode = currentNode.getChildren()[i];
                    result += "\tStep # " + step + "\n\tCurrent Node: " + currentNode + "\n\tStack: " + stack + "\n\tVisited: " + Arrays.toString(visitedNodes) + "\n\n";
 
                    continue l;
                    
                }
    
            }
            // If no unvisited adjacent node found, pop out node from Stack and make top of the stack as current node.
    
            if (!stack.isEmpty()) {
                stack.pop();

            }

            if (!stack.isEmpty()) {
            
                currentNode = stack.peek();
                countLevel--;
//                sysout
            }
           
            
            temp = new String[(int)Arrays.stream(visitedNodes).filter(i -> i !=null).count()];
            System.arraycopy(visitedNodes, 0, temp, 0,temp.length);
            result += "\tStep # " + step + "\n\tCurrent Node: " + currentNode + "\n\tStack: " + stack + "\n\tVisited: " + Arrays.toString(temp) + "\n\n";
            

        }

        result = "\n********************************** Depth Limited Search Algorithm ****************************** \n"+"\n****************** FINAL TRAVERSING ORDER: " + Arrays.toString(temp) + " ******************" + result;
        return result;
//        
    }


	public static String search(Node rootNode, int size, int level, String goalState){

        Stack <Node> stack = new Stack<Node>(); 

        int countLevel = 0;
        Node currentNode;

        String visitedNodes[] = new String[size];
        String temp[];

        int index = 0;

        // Choose the starting node, mark it as visited, push it on Stack and make it current node.
        visitedNodes[index] = rootNode.getItem();
        temp = visitedNodes.clone();
        stack.push(rootNode);
        currentNode = rootNode;

        int step = 1;

        String result = "";
        result += "\n\n\tGoal State: " + goalState  + "\n\n\tDepth Level Limit: " + level + "\n" +"\n\tStep # " + step + "\n\tCurrent Node: " + currentNode + "\n\tStack: " + stack + "\n\tVisited: " + Arrays.toString(visitedNodes) + "\n\n";
       

        // Repeat Loop until Stack is empty
        l:while(!stack.isEmpty()){

            step++;
            
            if(visitedNodes[index].equalsIgnoreCase(goalState)) {
				
            	result = "\n********************************** Depth Limited Search Algorithm ****************************** \n"+"\n****************** FINAL TRAVERSING ORDER: " + Arrays.toString(visitedNodes) + " ******************" + result;
                return result;
 				
 			}
            
            //  Find adjacent unvisited node of current node of given level, push it on Stack, mark it visited and make it current node.

            for(int i = 0; i < currentNode.getChildren().length;i++){

                if(!isVisited(currentNode.getChildren()[i].getItem(), visitedNodes) && countLevel < level){
    
                    stack.push(currentNode.getChildren()[i]);
                    countLevel++;
                    visitedNodes[++index] = currentNode.getChildren()[i].getItem();
                    currentNode = currentNode.getChildren()[i];
                      result += "\tStep # " + step + "\n\tCurrent Node: " + currentNode + "\n\tStack: " + stack + "\n\tVisited: " + Arrays.toString(visitedNodes) + "\n\n";
 
                    continue l;
                    
                }
    
            }
            // If no unvisited adjacent node found, pop out node from Stack and make top of the stack as current node.
    
            if (!stack.isEmpty()) {
                stack.pop();

            }

            if (!stack.isEmpty()) {
            
                currentNode = stack.peek();
                countLevel--;
            }
           
            
            temp = new String[(int)Arrays.stream(visitedNodes).filter(i -> i !=null).count()];
            System.arraycopy(visitedNodes, 0, temp, 0,temp.length);
            result += "\tStep # " + step + "\n\tCurrent Node: " + currentNode + "\n\tStack: " + stack + "\n\tVisited: " + Arrays.toString(temp) + "\n\n";
            

        }

        result = "\n********************************** Depth Limited Search Algorithm ****************************** \n"+"\n****************** FINAL TRAVERSING ORDER: " + Arrays.toString(temp) + " ******************" + result;
        return result;
//        
    }

	
	static boolean isVisited(String n, String visitedNodes[]){

        for(int i = 0; i < visitedNodes.length; i++){

            if(n.equalsIgnoreCase(visitedNodes[i])){

                return true;
            }
        }

        return false;

    }

}
