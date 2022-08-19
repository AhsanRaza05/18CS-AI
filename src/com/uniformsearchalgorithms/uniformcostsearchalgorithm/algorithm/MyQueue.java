package com.uniformsearchalgorithms.uniformcostsearchalgorithm.algorithm;

import com.uniformsearchalgorithms.node.WeightedNode;

public class MyQueue{

    private Integer cost;
    
    private WeightedNode[] path; 

    // Constructor
    public MyQueue(int cost, WeightedNode[] path){
        this.cost = cost;
        this.path = path;
    }

    // Setters
    public void setCost(Integer cost){
        this.cost = cost;
    }

    public void setPath(WeightedNode[] path){
        this.path = path;
    }

    // Getters
    public Integer getCost(){
        return cost;
    }

    public WeightedNode[] getPath(){
        return path;
    }

    public String toString(){

        String path = "\n\t<";

        for(int i = 0; i < this.path.length ;i++){

            path += this.path[i].getItem() + ",";    

        }

        path = path.substring(0, path.length() - 1);
        path += "> = %s (Cost)".formatted(this.cost);

        return path;
    }

}

