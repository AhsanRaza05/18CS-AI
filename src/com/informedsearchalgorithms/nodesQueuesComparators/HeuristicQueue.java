package com.informedsearchalgorithms.nodesQueuesComparators;

import com.uninformedsearchalgorithms.nodesQueuesComparators.WeightedNode;

public class HeuristicQueue {
	
    private Integer cost;
    
    private WeightedNode[] path; 
    
    private Integer heuristicCost;

    // Constructor
    public HeuristicQueue(int cost, WeightedNode[] path, Integer heuristicCost){
        this.cost = cost;
        this.path = path;
        this.heuristicCost = heuristicCost;
    }

    // Setters
    public void setCost(Integer cost){
        this.cost = cost;
    }

    public void setPath(WeightedNode[] path){
        this.path = path;
    }
    
    public void setHeuristicCost(Integer heuristicCost) {
		this.heuristicCost = heuristicCost;
	}

    // Getters
    public Integer getCost(){
        return cost;
    }

    public WeightedNode[] getPath(){
        return path;
    }
	public Integer getHeuristicCost() {
		return heuristicCost;
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
