package com.uninformedsearchalgorithms.nodesQueuesComparators;

public class UCSQueue{

    private Integer cost;
    
    private WeightedNode[] path; 
    
    private Integer SNo;

    // Constructor
    public UCSQueue(int cost, WeightedNode[] path){
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
    
	public void setSNo(Integer sNo) {
		this.SNo = sNo;
	}
    

    // Getters
    public Integer getCost(){
        return cost;
    }

    public WeightedNode[] getPath(){
        return path;
    }

	public Integer getSNo() {
		return SNo;
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

