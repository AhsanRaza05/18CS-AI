import java.util.Queue;
import java.util.LinkedList;
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

    void setAllchildren(Node children[]){

        this.children = children;
    }
    
    // Getters
    public String getItem(){

        return item;
    }

    public Node[] getchildren(){

        return children;
    }

    public String toString(){

        return item;
    }
}

class BFSTraversal{

   static String traverse(Node rootNode, int totalNodes){

        Queue <Node> queue = new LinkedList<Node>();
     
        Node currentNode;

        String visitedNodes[] = new String[totalNodes];

        int index = 0;

        // Choose the root node, mark it as visited, make it current node.
        visitedNodes[index] = rootNode.getItem();
        currentNode = rootNode;

        int step = 1;

        System.out.println("\tStep # " + step);
        System.out.println("\tCurrent Node: " + currentNode);
        System.out.println("\tQueue: " + queue);
        System.out.println("\tVisited: " + Arrays.toString(visitedNodes));
        System.out.println();

        l:do{

            step++;

            // Find adjacent unvisited node of current node, place it in Queue and mark it visited.
            for(int i = 0; i < currentNode.getchildren().length;i++){

                if(!isVisited(currentNode.getchildren()[i].getItem(), visitedNodes)){
                    
                    queue.add(currentNode.getchildren()[i]);
                    visitedNodes[++index] = currentNode.getchildren()[i].getItem();

                    System.out.println("\tStep # " + step);
                    System.out.println("\tCurrent Node: " + currentNode);
                    System.out.println("\tQueue: " + queue);
                    System.out.println("\tVisited: " + Arrays.toString(visitedNodes));
                    System.out.println();

                    continue l;
                    
                }
    
            }

            // If no unvisited adjacent node found, dequeue node from Queue and make it current node.
            currentNode = queue.poll();
        
           System.out.println("\tStep # " + step);
           System.out.println("\tCurrent Node: " + currentNode);
           System.out.println("\tQueue: " + queue);
           System.out.println("\tVisited: " + Arrays.toString(visitedNodes));
           System.out.println();

        // Repeat Loop until Queue is empty
        } while(currentNode!= null && !queue.isEmpty());
        // } while(!queue.isEmpty());
        
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

        
        int totalNodes = 0;

        // Problem # 1

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
        f.setAllchildren(new Node[]{b,g});
        b.setAllchildren(new Node[]{a,d});
        g.setAllchildren(new Node[]{i});
        a.setAllchildren(new Node[]{});
        d.setAllchildren(new Node[]{c,e});
        i.setAllchildren(new Node[]{h});
        c.setAllchildren(new Node[]{});
        e.setAllchildren(new Node[]{});
        h.setAllchildren(new Node[]{});
        
        totalNodes = 9;
        System.out.println("\n*********** Problem # 1 *********** ");
        System.out.println("FINAL TRAVERSING ORDER: " + BFSTraversal.traverse(f, totalNodes));
    
        // Problem # 2

        // Define Nodes
        Node rootNode = new Node("S");

        Node sNode = new Node("Q");
        
        Node tNode = new Node("W");

        Node fNode = new Node("T");

        Node fiNode = new Node("R");

        Node siNode = new Node("G");

        // Set children
        rootNode.setAllchildren(new Node[] {sNode, tNode, fNode});

        sNode.setAllchildren(new Node[]{fiNode, tNode});

        tNode.setAllchildren(new Node[]{fNode, siNode});

        fNode.setAllchildren(new Node[]{siNode});

        // siNode, tNode
        fiNode.setAllchildren(new Node[]{ siNode, tNode});

        siNode.setAllchildren(new Node[]{});

        totalNodes = 6;
        System.out.println("\n\n*********** Problem # 2 *********** ");
        System.out.println("FINAL TRAVERSING ORDER: " + BFSTraversal.traverse(rootNode, totalNodes));
    
        
        // Problem # 3

        // Define Nodes
        f = new Node("F");
        b = new Node("B");
        g = new Node("G");
        a = new Node("A");
        d = new Node("D");
        i = new Node("I");
        c = new Node("C");
        e = new Node("E");
        h = new Node("H");
        Node j = new Node("J");
        Node k = new Node("K");
        Node l = new Node("L");
        Node m = new Node("M");

        // Set Children
        a.setAllchildren(new Node[]{b,c,d});
        b.setAllchildren(new Node[]{e});
        c.setAllchildren(new Node[]{f,g,h});
        d.setAllchildren(new Node[]{i,j});
        e.setAllchildren(new Node[]{k,l});
        f.setAllchildren(new Node[]{});
        g.setAllchildren(new Node[]{});
        h.setAllchildren(new Node[]{m});
        i.setAllchildren(new Node[]{});
        j.setAllchildren(new Node[]{});
        k.setAllchildren(new Node[]{});
        l.setAllchildren(new Node[]{});
        m.setAllchildren(new Node[]{});
       
        totalNodes = 13;
        System.out.println("\n\n*********** Problem # 3 *********** ");
        System.out.println("FINAL TRAVERSING ORDER: " + BFSTraversal.traverse(a, totalNodes));

        // No Solution in Slides 
        // Problem # 4

        // Define Nodes
        Node eig = new Node("8");
        Node thr = new Node("3");
        Node ten = new Node("10");
        Node one = new Node("1");
        Node six = new Node("6");
        Node ftn = new Node("14");
        Node fou = new Node("4");
        Node sev = new Node("7");
        Node thn = new Node("13");

        // Set Chidren
        eig.setAllchildren(new Node[]{thr,ten});
        thr.setAllchildren(new Node[]{one, six});
        ten.setAllchildren(new Node[]{ftn});
        one.setAllchildren(new Node[]{});
        six.setAllchildren(new Node[]{fou, sev});
        ftn.setAllchildren(new Node[]{thn});
        fou.setAllchildren(new Node[]{});
        sev.setAllchildren(new Node[]{});
        thn.setAllchildren(new Node[]{});
        
        totalNodes = 9;
        System.out.println("\n\n*********** Problem # 4 *********** ");
        System.out.println("FINAL TRAVERSING ORDER: " + BFSTraversal.traverse(eig, totalNodes));

        // Problem # 5

        // Define Nodes
        one = new Node("1");
        Node two = new Node("2");
        thr = new Node("3");
        fou = new Node("4");
        Node fiv = new Node("5");
        six = new Node("6");
        sev = new Node("7");
        eig = new Node("8");
        Node nin = new Node("9");
        ten = new Node("10");
        Node ele = new Node("11");
        Node twe = new Node("12");

        // Set Chidren
        one.setAllchildren(new Node[]{two, thr, fou});
        two.setAllchildren(new Node[]{fiv, six});
        thr.setAllchildren(new Node[]{});
        fou.setAllchildren(new Node[]{sev, eig});
        fiv.setAllchildren(new Node[]{nin, ten});
        six.setAllchildren(new Node[]{});
        sev.setAllchildren(new Node[]{ele, twe});
        eig.setAllchildren(new Node[]{});
        nin.setAllchildren(new Node[]{});
        ten.setAllchildren(new Node[]{});
        ele.setAllchildren(new Node[]{});
        twe.setAllchildren(new Node[]{});
       
        
        totalNodes = 12;
        System.out.println("\n\n*********** Problem # 5 *********** ");
        System.out.println("FINAL TRAVERSING ORDER: " + BFSTraversal.traverse(one, totalNodes));

        
        
    }

}