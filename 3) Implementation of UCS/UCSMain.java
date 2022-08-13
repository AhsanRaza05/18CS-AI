import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;

// import java.util.*;

// Define the Node
class Node{

    private String item;
    private Integer[] cost;
    private Node children[];

    // Constructors
    Node(String item, Node children[], Integer[] cost){

        this.item = item;
        this.children = children;
        this.cost = cost;
    }

    Node(String item, Integer[] cost){

        this(item, null, cost);
    }

    // Setters
    void setItem(String item){

        this.item = item;
    }

    void setAllchildren(Node children[]){

        this.children = children;
    }
    
    void setCost(Integer[] cost){

        this.cost = cost;
    }


    // Getters
    public String getItem(){

        return item;
    }

    public Node[] getchildren(){

        return children;
    }

    public Integer[] getCost(){

        return cost;
    }
    

    public String toString(){

        return item;
    }
}

class UniformCostSearch{

   static String search(Node rootNode, int totalNodes, String goalState){

    List <MyQueue> priorityQueue = new ArrayList<MyQueue>();

    Node currentNode = rootNode;
    MyQueue currentMyQueue, temp;

    currentMyQueue = new MyQueue(0, new Node[]{currentNode});

    int steps = 1;

    do{
        
        System.out.println("\n Step # %s \n\tFrom the path we have:".formatted(steps));
        System.out.println("\t    " + currentMyQueue);

        List<Node> list ;

        for(int i = 0; i < currentNode.getchildren().length; i++){

            list = new ArrayList<Node>();

            list.add(currentNode.getchildren()[i]); 

            list.addAll(Arrays.asList(currentMyQueue.getPath()));     
            
            Node[] path =  (Node[]) list.toArray(new Node[list.size()]);
            
            int cost = currentMyQueue.getCost() + currentNode.getCost()[i];
            
            temp = new MyQueue(cost, path);
    
            if(!isCycle(temp)){
                priorityQueue.add(temp);
            }
            
        }
    
        Collections.sort(priorityQueue,new PriorityComparator());

        //Collections.sort(priorityQueue, Comparator.comparing(MyQueue::getCost));

        System.out.println("\t Priority Queue" + priorityQueue);

        currentMyQueue = priorityQueue.get(0);
        priorityQueue.remove(0);

        currentNode = currentMyQueue.getPath()[0];

        steps++;
        
        //  If the minimum path is goal, stop algorithm you found the solution.
        
        //System.out.println(priorityQueue.get(0).getPath()[0].getItem());

        if(currentMyQueue.getPath()[0].getItem().equalsIgnoreCase(goalState)){
            return ("\nShortest Path = " + currentMyQueue);
        }

    // Repeat until Queue is empty  
    }while( !priorityQueue.isEmpty());
    //}while(a < 4);
    
   
    return ("\nGoal Does not Exist!");

    }

    
    static boolean isCycle(MyQueue temp){

        System.out.println(temp.getPath()[0] == temp.getPath()[temp.getPath().length -1 ]);

        if(temp.getPath()[0] == temp.getPath()[temp.getPath().length-1]){

            return true;
        }

        else{

            for (int i = 0; i <temp.getPath().length - 1; i++){

                for(int  j = i + 1; j < temp.getPath().length - 1; j++){

                    if(temp.getPath()[i] == temp.getPath()[j]){

                        return true;
                    }
                }

            }
        }

        return false;

    }

}

public class UCSMain{

    public static void main(String args[]){
        
        int totalNodes = 0;

        // // Problem # 1

        // // Define Nodes
        // Node f = new Node("F");
        // Node b = new Node("B");
        // Node g = new Node("G");
        // Node a = new Node("A");
        // Node d = new Node("D");
        // Node i = new Node("I");
        // Node c = new Node("C");
        // Node e = new Node("E");
        // Node h = new Node("H");
        
        // // Set Children
        // f.setAllchildren(new Node[]{b,g});
        // b.setAllchildren(new Node[]{a,d});
        // g.setAllchildren(new Node[]{i});
        // a.setAllchildren(new Node[]{});
        // d.setAllchildren(new Node[]{c,e});
        // i.setAllchildren(new Node[]{h});
        // c.setAllchildren(new Node[]{});
        // e.setAllchildren(new Node[]{});
        // h.setAllchildren(new Node[]{});
        
        // totalNodes = 9;
        // System.out.println("\n*********** Problem # 1 *********** ");
        // System.out.println("FINAL TRAVERSING ORDER: " + BFSTraversal.traverse(f, totalNodes));
    
        // Problem # 1

        // Define Nodes
        Node rootNode = new Node("S",new Integer[]{1,6,7});

        Node sNode = new Node("Q",new Integer[]{1,4});
        
        Node tNode = new Node("W",new Integer[]{3,2});

        Node fNode = new Node("T",new Integer[]{2});

        Node fiNode = new Node("R",new Integer[]{1,2});

        Node siNode = new Node("G",new Integer[]{0});

        // Set children
        rootNode.setAllchildren(new Node[] {sNode, tNode, fNode});

        sNode.setAllchildren(new Node[]{fiNode, tNode});

        tNode.setAllchildren(new Node[]{fNode, siNode});

        fNode.setAllchildren(new Node[]{siNode});

        // siNode, tNode
        fiNode.setAllchildren(new Node[]{ siNode, tNode});

        siNode.setAllchildren(new Node[]{});

        totalNodes = 6;
        // System.out.println("\n\n*********** Problem # 1 *********** ");
        // System.out.println(UniformCostSearch.search(rootNode, totalNodes, "G"));
        
        // Problem # 2

        // Define Nodes
        Node b = new Node("B", new Integer[]{10});
        Node a = new Node("A", new Integer[]{12,60});
        Node c = new Node("C", new Integer[]{20,32});
        Node d = new Node("D", new Integer[]{});
        Node e = new Node("E", new Integer[]{7});
        
        // Set Children

        b.setAllchildren(new Node[]{a});
        a.setAllchildren(new Node[]{c,d});
        c.setAllchildren(new Node[]{b,d});
        d.setAllchildren(new Node[]{});
        e.setAllchildren(new Node[]{a});
        
        totalNodes = 5;
        System.out.println("\n*********** Problem # 2 *********** ");
        System.out.println(UniformCostSearch.search(b, totalNodes, "D"));


        // Problem # 3

        // Define Nodes
        Node f = new Node("F", new Integer[]{2,6});
        b = new Node("B", new Integer[]{7,1});
        Node g = new Node("G", new Integer[]{9});
        a = new Node("A", new Integer[]{8,2,7});
        d = new Node("D", new Integer[]{2,6});
        Node i = new Node("I", new Integer[]{9});
        c = new Node("C", new Integer[]{10,7,2});
        e = new Node("E", new Integer[]{6, 9});
        Node h = new Node("H", new Integer[]{3,8});
        Node j = new Node("J", new Integer[]{3,8});
        

        // Set Children
        a.setAllchildren(new Node[]{b,d,e});
        b.setAllchildren(new Node[]{c,e});
        c.setAllchildren(new Node[]{b,f,j});
        d.setAllchildren(new Node[]{a,h});
        e.setAllchildren(new Node[]{a,d});
        f.setAllchildren(new Node[]{b,i});
        g.setAllchildren(new Node[]{c});
        h.setAllchildren(new Node[]{e,i});
        i.setAllchildren(new Node[]{e});
        j.setAllchildren(new Node[]{g,i});

        totalNodes = 10;
        System.out.println("\n\n*********** Problem # 3 *********** ");
        System.out.println(UniformCostSearch.search(d, totalNodes, "X"));

        // // No Solution in Slides 
        // // Problem # 4

        // // Define Nodes
        // Node eig = new Node("8");
        // Node thr = new Node("3");
        // Node ten = new Node("10");
        // Node one = new Node("1");
        // Node six = new Node("6");
        // Node ftn = new Node("14");
        // Node fou = new Node("4");
        // Node sev = new Node("7");
        // Node thn = new Node("13");

        // // Set Chidren
        // eig.setAllchildren(new Node[]{thr,ten});
        // thr.setAllchildren(new Node[]{one, six});
        // ten.setAllchildren(new Node[]{ftn});
        // one.setAllchildren(new Node[]{});
        // six.setAllchildren(new Node[]{fou, sev});
        // ftn.setAllchildren(new Node[]{thn});
        // fou.setAllchildren(new Node[]{});
        // sev.setAllchildren(new Node[]{});
        // thn.setAllchildren(new Node[]{});
        
        // totalNodes = 9;
        // System.out.println("\n\n*********** Problem # 4 *********** ");
        // System.out.println("FINAL TRAVERSING ORDER: " + BFSTraversal.traverse(eig, totalNodes));

        // // Problem # 5

        // // Define Nodes
        // one = new Node("1");
        // Node two = new Node("2");
        // thr = new Node("3");
        // fou = new Node("4");
        // Node fiv = new Node("5");
        // six = new Node("6");
        // sev = new Node("7");
        // eig = new Node("8");
        // Node nin = new Node("9");
        // ten = new Node("10");
        // Node ele = new Node("11");
        // Node twe = new Node("12");

        // // Set Chidren
        // one.setAllchildren(new Node[]{two, thr, fou});
        // two.setAllchildren(new Node[]{fiv, six});
        // thr.setAllchildren(new Node[]{});
        // fou.setAllchildren(new Node[]{sev, eig});
        // fiv.setAllchildren(new Node[]{nin, ten});
        // six.setAllchildren(new Node[]{});
        // sev.setAllchildren(new Node[]{ele, twe});
        // eig.setAllchildren(new Node[]{});
        // nin.setAllchildren(new Node[]{});
        // ten.setAllchildren(new Node[]{});
        // ele.setAllchildren(new Node[]{});
        // twe.setAllchildren(new Node[]{});
       
        
        // totalNodes = 12;
        // System.out.println("\n\n*********** Problem # 5 *********** ");
        // System.out.println("FINAL TRAVERSING ORDER: " + BFSTraversal.traverse(one, totalNodes));

        
        
        
    }

}

class PriorityComparator implements Comparator{  
    
    public int compare(Object o1,Object o2){  
    
        MyQueue n1=(MyQueue)o1;  
        MyQueue n2=(MyQueue)o2;  

        // if(n1.getCost() == n2.getCost())  
        // return 0;  

        if(n1.getCost() > n2.getCost())  
            return 1;  

        return -1;  
    }  
}  

class MyQueue{

    private Integer cost;
    
    private Node[] path; 

    // Constructor
    MyQueue(int cost, Node[] path){
        this.cost = cost;
        this.path = path;
    }

    // Setters
    void setCost(Integer cost){
        this.cost = cost;
    }

    void setPath(Node[] path){
        this.path = path;
    }

    // Getters
    Integer getCost(){
        return cost;
    }

    Node[] getPath(){
        return path;
    }

    public String toString(){

        String path = "\n<";

        for(int i = 0; i < this.path.length ;i++){

            path += this.path[i].getItem() + ",";    

        }

        path = path.substring(0, path.length() - 1);
        path += "> = %s\n".formatted(this.cost);

        return path;
    }

}

// Change Cyclic Function whether there is a cycle or a repetation of Nodes in Priority Queue
// Check Weight for Problem # 3 (Slide and Code result is different)
// Change Priority Queue both MyQueue is same then that Myqueue will come which was firsrt IN.when Cost of 