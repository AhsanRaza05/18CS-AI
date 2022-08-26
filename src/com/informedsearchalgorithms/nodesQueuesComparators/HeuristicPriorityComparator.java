package com.informedsearchalgorithms.nodesQueuesComparators;

import java.util.Comparator;

import com.uninformedsearchalgorithms.nodesQueuesComparators.UCSQueue;

public class HeuristicPriorityComparator implements Comparator{

	 public int compare(Object o1,Object o2){  
		    
	        HeuristicQueue n1=(HeuristicQueue)o1;  
	        HeuristicQueue n2=(HeuristicQueue)o2;  

	        if(n1.getHeuristicCost() > n2.getHeuristicCost())  
	            return 1;  

	        return -1;  
	    }  
}
