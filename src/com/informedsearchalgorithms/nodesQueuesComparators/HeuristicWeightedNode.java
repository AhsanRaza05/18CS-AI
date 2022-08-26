package com.informedsearchalgorithms.nodesQueuesComparators;

public class HeuristicWeightedNode {

	//Define the Node

	 private String item;
	 private Integer[] cost;
	 private HeuristicWeightedNode children[];
	 private Integer heuristicCost;

	 // Constructors
	 public HeuristicWeightedNode(String item, HeuristicWeightedNode children[], Integer[] cost, Integer heuristicCost){

	     this.item = item;
	     this.children = children;
	     this.cost = cost;
	     this.heuristicCost = heuristicCost;
	 }

	 public HeuristicWeightedNode(String item, Integer[] cost, Integer heuristicCost){

	     this(item, new HeuristicWeightedNode[] {}, cost, heuristicCost);
	 }

	 public HeuristicWeightedNode(String item){

//	     this(item, null,null);
	     
	     this(item, new HeuristicWeightedNode[]{}, new Integer[]{0}, 0);
	     
	 }
	 // Setters
	 public void setItem(String item){

	     this.item = item;
	 }

	 public void setAllchildren(HeuristicWeightedNode children[]){

	     this.children = children;
	 }
	 
	 public void setCost(Integer[] cost){

	     this.cost = cost;
	 }

	 public void setChildren(HeuristicWeightedNode[] children) {
			this.children = children;
	 }
	 
	 public void setHeuristicCost(Integer heuristicCost) {
			this.heuristicCost = heuristicCost;
	 }


	// Getters
	 public String getItem(){

	     return item;
	 }

	 public HeuristicWeightedNode[] getchildren(){

	     return children;
	 }

	 public Integer[] getCost(){

	     return cost;
	 }
	 

	 public String toString(){

	     return item;
	 }
	 
	 public HeuristicWeightedNode[] getChildren() {
			return children;
	 }

		
	 public Integer getHeuristicCost() {
			return heuristicCost;
	 }
	
}
