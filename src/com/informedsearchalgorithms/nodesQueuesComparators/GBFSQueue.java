package com.informedsearchalgorithms.nodesQueuesComparators;

import com.informedsearchalgorithms.nodesQueuesComparators.HeuristicWeightedNode;

public class GBFSQueue {
	
    private Integer cost;
    
    private HeuristicWeightedNode[] path; 
    
    private Integer heuristicCost;
    
    private Integer sNo;

    // Constructor
    public GBFSQueue(int cost, HeuristicWeightedNode[] path, int heuristicCost){
        this.cost = cost;
        this.path = path;
        this.heuristicCost = heuristicCost;
    }

    // Setters
    public void setCost(Integer cost){
        this.cost = cost;
    }

    public void setPath(HeuristicWeightedNode[] path){
        this.path = path;
    }
    
    public void setHeuristicCost(Integer heuristicCost) {
		this.heuristicCost = heuristicCost;
	}

    // Getters
    public Integer getCost(){
        return cost;
    }

    public HeuristicWeightedNode[] getPath(){
        return path;
    }
	public Integer getHeuristicCost() {
		return heuristicCost;
	}

	

    public Integer getSNo() {
		return sNo;
	}

	public void setSNo(Integer sNo) {
		this.sNo = sNo;
	}

	public String toString(){

        String path = "\n\t<";

        for(int i = 0; i < this.path.length ;i++){

            path += this.path[i].getItem() + ",";    

        }

        path = path.substring(0, path.length() - 1);
        path += "> = %s (Cost)".formatted(this.cost);
        path += ", Heuristic Cost = %s".formatted(this.heuristicCost);

        return path;
    }


}
