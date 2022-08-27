package com.uninformedsearchalgorithms.nodesQueuesComparators;

import java.util.Comparator;

public class UCSPriorityComparator implements Comparator{  
    
    public int compare(Object o1,Object o2){  
    
        UCSQueue n1=(UCSQueue)o1;  
        UCSQueue n2=(UCSQueue)o2;  

        System.out.println(n1.getPath()[0] + " " + n1.getPath()[1] );
        System.out.println(n1.getCost());
        System.out.println(n2.getCost());
        System.out.println(n2.getPath()[0] + " " + n2.getPath()[1]);
        System.out.println(n1.getCost() > n2.getCost());
        System.out.println();
        
        if(n1.getCost() == n2.getCost()) {
        	
        	if(n1.getSNo() > n2.getSNo())  
	            return 1;  
        	
        }
        
        if(n1.getCost() > n2.getCost())  
            return 1;  

        return -1;  
    }  
}  