package com.uniformsearchalgorithms.node;

public class WeightedNode {

//Define the Node

 private String item;
 private Integer[] cost;
 private WeightedNode children[];

 // Constructors
 public WeightedNode(String item, WeightedNode children[], Integer[] cost){

     this.item = item;
     this.children = children;
     this.cost = cost;
 }

 public WeightedNode(String item, Integer[] cost){

     this(item, null, cost);
 }

 // Setters
 public void setItem(String item){

     this.item = item;
 }

 public void setAllchildren(WeightedNode children[]){

     this.children = children;
 }
 
 public void setCost(Integer[] cost){

     this.cost = cost;
 }


 // Getters
 public String getItem(){

     return item;
 }

 public WeightedNode[] getchildren(){

     return children;
 }

 public Integer[] getCost(){

     return cost;
 }
 

 public String toString(){

     return item;
 }
}
