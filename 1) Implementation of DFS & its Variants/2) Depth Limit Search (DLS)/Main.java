import java.util.Stack;
import java.util.Arrays;

// import java.util.*;

// Define the Node
class Node{

    private String item;
    private Node children[];

    // Constructors
    Node(String item, Node children[]){

        this.item = item;
        this.children = children;
    }

    Node(String item){

        this(item, null);
    }

    // Setters
    void setItem(String item){

        this.item = item;
    }

    void setAllChildren(Node children[]){

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

class DLSTraversal{

   static String traverse(Node rootNode, int size){

        Stack <Node> stack = new Stack<Node>(); 

        Node currentNode;

        String visitedNodes[] = new String[size];

        int index = 0;
        
        // Choose the starting node, mark it as visited, push it on Stack and make it current node
        visitedNodes[index] = rootNode.getItem();
        stack.push(rootNode);
        currentNode = rootNode;

        int step = 1;

        System.out.println("\tStep # " + step);
        System.out.println("\tCurrent Node: " + currentNode);
        System.out.println("\tStack: " + stack);
        System.out.println("\tVisited: " + Arrays.toString(visitedNodes));
        
        System.out.println();

        // Repeat Loop until Stack is empty
        l:while(!stack.isEmpty()){

            step++;

            // Find adjacent unvisited node of current node, push it on Stack, mark it visited and make it current node.
            for(int i = 0; i < currentNode.getChildren().length;i++){

                if(!isVisited(currentNode.getChildren()[i].getItem(), visitedNodes)){
    
                    stack.push(currentNode.getChildren()[i]);
                    visitedNodes[++index] = currentNode.getChildren()[i].getItem();
                    currentNode = currentNode.getChildren()[i];

                    System.out.println("\tStep # " + step);
                    System.out.println("\tCurrent Node: " + currentNode);
                    System.out.println("\tStack: " + stack);
                    System.out.println("\tVisited: " + Arrays.toString(visitedNodes));
                    System.out.println();

                    continue l;
                    
                }
    
            }
    
            // If no unvisited adjacent node found, pop out node from Stack and make top of the stack as current node.

            if (!stack.isEmpty()) {
                stack.pop();
                // currentNode = stack.pop();
            }

            if (!stack.isEmpty()) {
                // // stack.pop();
                
                // currentNode = stack.pop();
                // stack.push(currentNode);

                currentNode = stack.peek();

            }
            //currentNode = stack.pop();
           // stack.remove(currentNode);
    
           System.out.println("\tStep # " + step);
           System.out.println("\tCurrent Node: " + currentNode);
           System.out.println("\tStack: " + stack);
           System.out.println("\tVisited: " + Arrays.toString(visitedNodes));
           System.out.println();

        }

        return Arrays.toString(visitedNodes);

    }

    static String limitedDepthSearchTraverse(Node rootNode, int size, int level){

        Stack <Node> stack = new Stack<Node>(); 

        int countLevel = 0;
        Node currentNode;

        String visitedNodes[] = new String[size];

        int index = 0;

        // Choose the starting node, mark it as visited, push it on Stack and make it current node.
        visitedNodes[index] = rootNode.getItem();
        stack.push(rootNode);
        currentNode = rootNode;

        int step = 1;

        System.out.println("\tStep # " + step);
        System.out.println("\tCurrent Node: " + currentNode);
        System.out.println("\tStack: " + stack);
        System.out.println("\tVisited: " + Arrays.toString(visitedNodes));
        System.out.println();

        // Repeat Loop until Stack is empty
        l:while(!stack.isEmpty()){

            step++;

            //  Find adjacent unvisited node of current node of given level, push it on Stack, mark it visited and make it current node.

            for(int i = 0; i < currentNode.getChildren().length;i++){

                if(!isVisited(currentNode.getChildren()[i].getItem(), visitedNodes) && countLevel < level){
    
                    stack.push(currentNode.getChildren()[i]);
                    countLevel++;
                    visitedNodes[++index] = currentNode.getChildren()[i].getItem();
                    currentNode = currentNode.getChildren()[i];

                    System.out.println("\tStep # " + step);
                    System.out.println("\tCurrent Node: " + currentNode);
                    System.out.println("\tStack: " + stack);
                    System.out.println("\tVisited: " + Arrays.toString(visitedNodes));
                    System.out.println();

                    continue l;
                    
                }
    
            }
            // If no unvisited adjacent node found, pop out node from Stack and make top of the stack as current node.
    
            if (!stack.isEmpty()) {
                stack.pop();
                
                // currentNode = stack.pop();
            }

            if (!stack.isEmpty()) {
                // stack.pop();
                //currentNode = stack.pop();
                //stack.push(currentNode);

                currentNode = stack.peek();
                countLevel--;
            }
            //currentNode = stack.pop();
           // stack.remove(currentNode);
    
           System.out.println("\tStep # " + step);
           System.out.println("\tCurrent Node: " + currentNode);
           System.out.println("\tStack: " + stack);
           System.out.println("\tVisited: " + Arrays.toString(visitedNodes));
           System.out.println();

        }

        return Arrays.toString(visitedNodes);

    }


    static boolean isVisited(String n, String visitedNodes[]){

        for(int i = 0; i < visitedNodes.length; i++){

            if(n.equalsIgnoreCase(visitedNodes[i])){

                return true;
            }
        }

        return false;

    }
    

}

public class Main{

    public static void main(String args[]){

        
        int size = 0;
        int level = 0;

        System.out.println("\n\n*************************** DEPTH LIMITED SEARCH ***************************");
        
        // PROBLEM # 1

        // Define Nodes
        Node f = new Node("F");
        Node b = new Node("B");
        Node g = new Node("G");
        Node a = new Node("A");
        Node d = new Node("D");
        Node i = new Node("I");
        Node c = new Node("C");
        Node e = new Node("E");
        Node h = new Node("H");

        // Set Children
        f.setAllChildren(new Node[]{b,g});
        b.setAllChildren(new Node[]{a,d});
        g.setAllChildren(new Node[]{i});
        a.setAllChildren(new Node[]{});
        d.setAllChildren(new Node[]{c,e});
        i.setAllChildren(new Node[]{h});
        c.setAllChildren(new Node[]{});
        e.setAllChildren(new Node[]{});
        h.setAllChildren(new Node[]{});

        size = 9;
        level = 2;
        System.out.println("\n*********** PROBLEM # 1 *********** ");
        System.out.println("FINAL Limited TRAVERSING ORDER: " + DLSTraversal.limitedDepthSearchTraverse(f, size,level));
   

        // PROBLEM # 2

        // Define Nodes
        Node rootNode = new Node("S");

        Node sNode = new Node("Q");
        
        Node tNode = new Node("W");

        Node fNode = new Node("T");

        Node fiNode = new Node("R");

        Node siNode = new Node("G");

        // Set Children
        rootNode.setAllChildren(new Node[] {sNode, tNode, fNode});

        sNode.setAllChildren(new Node[]{fiNode, tNode});

        tNode.setAllChildren(new Node[]{fNode, siNode});

        fNode.setAllChildren(new Node[]{siNode});

        // siNode, tNode
        fiNode.setAllChildren(new Node[]{ siNode, tNode});

        siNode.setAllChildren(new Node[]{});

        size = 6;
        level = 2;
        System.out.println("\n*********** PROBLEM # 2 *********** ");
        System.out.println(" Final Limited TRAVERSING ORDER: " + DLSTraversal.limitedDepthSearchTraverse(rootNode, size,level));
        
    }

}