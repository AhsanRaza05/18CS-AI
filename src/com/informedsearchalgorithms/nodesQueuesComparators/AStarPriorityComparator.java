package com.informedsearchalgorithms.nodesQueuesComparators;

import java.util.Comparator;

import com.informedsearchalgorithms.nodesQueuesComparators.AStarQueue;

public class AStarPriorityComparator implements Comparator{

	 public int compare(Object o1,Object o2){  
		    
		 AStarQueue n1=(AStarQueue)o1;  
		 AStarQueue n2=(AStarQueue)o2;  

	        System.out.println(n1.getPath()[0] + " " + n1.getPath()[1] );
	        System.out.println(n1.getFinalCost());
	        System.out.println(n2.getFinalCost());
	        System.out.println(n2.getPath()[0] + " " + n2.getPath()[1]);
	        System.out.println(n1.getFinalCost() > n2.getFinalCost());
	        System.out.println(n1.getSNo());
	        System.out.println(n2.getSNo());
	        System.out.println();
	        
	        if(n1.getFinalCost() == n2.getFinalCost()) {
	        	
	        	if(n1.getSNo() > n2.getSNo())  
		            return 1;  
	        	
	        }
	        
	        if(n1.getFinalCost() > n2.getFinalCost())  
	            return 1;  
	        

	        return -1;  
	    }  
}
