package com.uniformsearchalgorithms.nodesQueuesComparators;

public class Node {

//Define the Node

 private String item;
 private Node children[];

 // Constructors
 public Node(String item, Node children[]){

     this.item = item;
     this.children = children;
     
 }

 public Node(String item){

     this(item, new Node[] {});
 }

 // Setters
 public void setItem(String item){

     this.item = item;
 }

 public void setAllChildren(Node children[]){

     this.children = children;
 }
 
 // Getters
 public String getItem(){

     return item;
 }

 public Node[] getChildren(){

     return children;
 }

 public String toString(){

     return item;
 }

}