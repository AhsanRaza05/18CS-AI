package com.informedsearchalgorithms.nodesQueuesComparators;

import com.uninformedsearchalgorithms.nodesQueuesComparators.UCSQueue;

public class HeuristicPriorityComparator {

	 public int compare(Object o1,Object o2){  
		    
	        HeuristicQueue n1=(HeuristicQueue)o1;  
	        HeuristicQueue n2=(HeuristicQueue)o2;  

	        if(n1.getHeuristicCost() > n2.getHeuristicCost())  
	            return 1;  

	        return -1;  
	    }  
}
