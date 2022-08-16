package com.uniformsearchalgorithms.uniformcostsearchalgorithm;

import java.util.Comparator;

public class PriorityComparator implements Comparator{  
    
    public int compare(Object o1,Object o2){  
    
        MyQueue n1=(MyQueue)o1;  
        MyQueue n2=(MyQueue)o2;  

        if(n1.getCost() > n2.getCost())  
            return 1;  

        return -1;  
    }  
}  