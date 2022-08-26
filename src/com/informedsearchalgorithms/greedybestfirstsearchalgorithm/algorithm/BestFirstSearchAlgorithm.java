package com.informedsearchalgorithms.greedybestfirstsearchalgorithm.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.informedsearchalgorithms.nodesQueuesComparators.HeuristicQueue;
import com.informedsearchalgorithms.nodesQueuesComparators.HeuristicPriorityComparator;
import com.informedsearchalgorithms.nodesQueuesComparators.HeuristicWeightedNode;

public class BestFirstSearchAlgorithm {

	 public static String search(HeuristicWeightedNode rootNode, String goalState){

		    List <HeuristicQueue> priorityQueue = new ArrayList<HeuristicQueue>();

		    HeuristicWeightedNode currentNode = rootNode;
		    HeuristicQueue currentMyQueue, temp;

		    currentMyQueue = new HeuristicQueue(0, new HeuristicWeightedNode[]{currentNode});

		    // Initialize Queue with Starting Node.
		    priorityQueue.add(currentMyQueue);
		    
		    int steps = 1;

		    String result= "";

		 // Repeat until Queue is empty  
		   while( !priorityQueue.isEmpty()) {
		    	
			   
			    //Pick minimum cost path from Queue.
		    	currentMyQueue = priorityQueue.get(0);
		        priorityQueue.remove(0);

		        currentNode = currentMyQueue.getPath()[0];

		        
		        //  If the minimum path is goal, stop algorithm you found the solution.
		        
		        if(currentMyQueue.getPath()[0].getItem().equalsIgnoreCase(goalState)){
		        	
		        	result += "\n\n Step # %s \n\t".formatted(steps) + "\n\t    " + currentMyQueue + "\n";

		        	result += "\n\tPriority Queue" + priorityQueue + "\n";
		        	
		        	return ("\n********************************** Uniform Cost Search Algorithm ****************************** \n"+"\n*********************** Shortest Path: " + currentMyQueue.toString().replaceAll("\n","").replaceAll("\t", "") + " ************************" +  "\n\n\tGoal State: " + goalState   + result);

		        }
		    
		        result +=  "\n\n Step # %s \n\tFrom the path we have:".formatted(steps) + "\n\t    " + currentMyQueue + "\n";

		        List<HeuristicWeightedNode> list ;

		        // For each neighbor node v add expanded path < v ,P > to Queue.
		        
		        for(int i = 0; i < currentNode.getchildren().length; i++){

		            list = new ArrayList<HeuristicWeightedNode>();

		            list.add(currentNode.getchildren()[i]); 

		            list.addAll(Arrays.asList(currentMyQueue.getPath()));     
		            
		            HeuristicWeightedNode[] path =  (HeuristicWeightedNode[]) list.toArray(new HeuristicWeightedNode[list.size()]);
		            
		            int cost = currentMyQueue.getCost() + currentNode.getCost()[i];
		            
		            temp = new HeuristicQueue(cost, path);
		    
		            if(!isCycle(temp)){
		                priorityQueue.add(temp);
		            }
		            
		        }
		    
		        Collections.sort(priorityQueue,new HeuristicPriorityComparator());

		        result += "\n\tPriority Queue" + priorityQueue + "\n";

		        steps++;
		    }
		   
		    return ("\n********************************** Uniform Cost Search Algorithm ****************************** \n"+ "\n\n************************************** Goal Does not Exist! **************************************\n"+ "\n\n\tGoal State: " + goalState   + result);

		    }

		    
		    static boolean isCycle(HeuristicQueue temp){

		        if(temp.getPath()[0] == temp.getPath()[temp.getPath().length-1]){

		            return true;
		        }

		        else{

		            for (int i = 0; i <temp.getPath().length - 1; i++){

		                for(int  j = i + 1; j < temp.getPath().length - 1; j++){

		                    if(temp.getPath()[i] == temp.getPath()[j]){

		                        return true;
		                    }
		                }

		            }
		        }

		        return false;

		    }
	
}
