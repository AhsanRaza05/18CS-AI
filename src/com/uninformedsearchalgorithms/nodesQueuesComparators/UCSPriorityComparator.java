package com.uninformedsearchalgorithms.nodesQueuesComparators;

import java.util.Comparator;

public class UCSPriorityComparator implements Comparator{  
    
    public int compare(Object o1,Object o2){  
    
        UCSQueue n1=(UCSQueue)o1;  
        UCSQueue n2=(UCSQueue)o2;  

        if(n1.getCost() > n2.getCost())  
            return 1;  

        return -1;  
    }  
}  