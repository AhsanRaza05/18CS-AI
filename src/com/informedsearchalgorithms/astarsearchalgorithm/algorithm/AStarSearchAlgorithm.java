package com.informedsearchalgorithms.astarsearchalgorithm.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.informedsearchalgorithms.nodesQueuesComparators.AStarPriorityComparator;
import com.informedsearchalgorithms.nodesQueuesComparators.AStarQueue;
import com.informedsearchalgorithms.nodesQueuesComparators.HeuristicWeightedNode;

public class AStarSearchAlgorithm {

	 public static String search(HeuristicWeightedNode rootNode, String goalState){

		    List <AStarQueue> priorityQueue = new ArrayList<AStarQueue>();

		    HeuristicWeightedNode currentNode = rootNode;
		    AStarQueue currentMyQueue, temp;
		    
		    int sNo = 1;

		    currentMyQueue = new AStarQueue(0, new HeuristicWeightedNode[]{currentNode}, currentNode.getHeuristicCost());
		    currentMyQueue.setSNo(sNo);
		    
		    // Initialize Queue with Starting Node.
		    priorityQueue.add(currentMyQueue);
		    
		    int steps = 1;

		    String result= "";
		    
		    int cost = 0;
		    
		    int heuristciCost = 0;

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
		        	
		        	return ("\n********************************** A Star Search Algorithm ****************************** \n"+"\n*********************** Shortest Path: " + currentMyQueue.toString().replaceAll("\n","").replaceAll("\t", "") + " ************************" +  "\n\n\tGoal State: " + goalState   + result);

		        }
		    
		        result +=  "\n\n Step # %s \n\tFrom the path we have:".formatted(steps) + "\n\t    " + currentMyQueue + "\n";

		        List<HeuristicWeightedNode> list ;

		        // For each neighbor node v add expanded path < v ,P > to Queue.
		        
		        for(int i = 0; i < currentNode.getchildren().length; i++){

		            list = new ArrayList<HeuristicWeightedNode>();

		            list.add(currentNode.getchildren()[i]); 

		            list.addAll(Arrays.asList(currentMyQueue.getPath()));     
		            
		            HeuristicWeightedNode[] path =  (HeuristicWeightedNode[]) list.toArray(new HeuristicWeightedNode[list.size()]);
		            
		            cost = currentMyQueue.getCost() + currentNode.getCost()[i];
		            heuristciCost = currentNode.getchildren()[i].getHeuristicCost();
		            
		            temp = new AStarQueue(cost, path, heuristciCost);
		    
		            if(!isCycle(temp)){
		            	
		            	sNo++;
		            	temp.setSNo(sNo);
		                priorityQueue.add(temp);
		                
		            }
		            
		        }
		    
		        Collections.sort(priorityQueue,new AStarPriorityComparator());

		        result += "\n\tPriority Queue" + priorityQueue + "\n";

		        steps++;
		    }
		   
		    return ("\n********************************** A Star Search Algorithm ****************************** \n"+ "\n\n************************************** Goal Does not Exist! **************************************\n"+ "\n\n\tGoal State: " + goalState   + result);

		    }
	 
	 static boolean isCycle(AStarQueue temp){

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
