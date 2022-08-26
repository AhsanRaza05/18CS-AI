package com.informedsearchalgorithms.nodesQueuesComparators;

import java.util.Comparator;

import com.uninformedsearchalgorithms.nodesQueuesComparators.UCSQueue;

public class HeuristicPriorityComparator implements Comparator{

	 public int compare(Object o1,Object o2){  
		    
	        HeuristicQueue n1=(HeuristicQueue)o1;  
	        HeuristicQueue n2=(HeuristicQueue)o2;  

	        System.out.println(n1.getPath()[0] + " " + n1.getPath()[1] );
	        System.out.println(n1.getHeuristicCost());
	        System.out.println(n2.getHeuristicCost());
	        System.out.println(n2.getPath()[0] + " " + n2.getPath()[1]);
	        System.out.println(n1.getHeuristicCost() > n2.getHeuristicCost());
	        System.out.println(n1.getSNo());
	        System.out.println(n2.getSNo());
	        System.out.println();
	        
	        if(n1.getHeuristicCost() == n2.getHeuristicCost()) {
	        	
	        	if(n1.getSNo() > n2.getSNo())  
		            return 1;  
	        	
	        }
	        
	        if(n1.getHeuristicCost() > n2.getHeuristicCost())  
	            return 1;  
	        

	        return -1;  
	    }  
}
