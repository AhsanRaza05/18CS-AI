import java.util.Stack;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

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

class DFSTraversal{

   static String traverse(Node rootNode, int size){

        Stack <Node> stack = new Stack<Node>(); 

        Node currentNode;

        String visitedNodes[] = new String[size];

        int index = 0;
        
        String result = "";

        // Choose the starting node, mark it as visited, push it on Stack and make it current node
        visitedNodes[index] = rootNode.getItem();
        stack.push(rootNode);
        currentNode = rootNode;

        int step = 1;

        result += "\n\tStep # " + step + "\n\tCurrent Node: " + currentNode + "\n\tStack: " + stack + "\n\tVisited: " + Arrays.toString(visitedNodes) + "\n";

        // Repeat Loop until Stack is empty
        l:while(!stack.isEmpty()){

            step++;

            // Find adjacent unvisited node of current node, push it on Stack, mark it visited and make it current node.
            for(int i = 0; i < currentNode.getChildren().length;i++){

                if(!isVisited(currentNode.getChildren()[i].getItem(), visitedNodes)){
    
                    stack.push(currentNode.getChildren()[i]);
                    visitedNodes[++index] = currentNode.getChildren()[i].getItem();
                    currentNode = currentNode.getChildren()[i];

                    result += "\n\tStep # " + step + "\n\tCurrent Node: " + currentNode + "\n\tStack: " + stack + "\n\tVisited: " + Arrays.toString(visitedNodes) + "\n" ;

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

           result += "\n\tStep # " + step + "\n\tCurrent Node: " + currentNode + "\n\tStack: " + stack + "\n\tVisited: " + Arrays.toString(visitedNodes) + "\n" ;

        }

        result += "\n****************** FINAL TRAVERSING ORDER: " + Arrays.toString(visitedNodes) + " ******************";
        return result;

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

        // create a JTextArea
        JTextArea textArea = new JTextArea(38,45);
        textArea.setEditable(false);

        JDialog dialgoue;

        JOptionPane pane;

        JScrollPane scrollPane;

        int size = 0;

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
        // System.out.println("\n*********** PROBLEM # 1 *********** ");
        // System.out.println("FINAL TRAVERSING ORDER: " + DFSTraversal.traverse(f, size));

        // Display Result in Dialogue Box
        textArea.setText(DFSTraversal.traverse(f, size));

        // wrap a scrollpane around it
        scrollPane = new JScrollPane(textArea);
        
        // display them in a message dialog
        pane = new JOptionPane(scrollPane);

        dialgoue = pane.createDialog(null, "PROBLEM # 1");
        // dialgoue.setLocation(0,0);
        dialgoue.setVisible(true);

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
        // System.out.println("\n*********** PROBLEM # 2 *********** ");
        // System.out.println("FINAL TRAVERSING ORDER: " + DFSTraversal.traverse(rootNode, size));

        // Display Result in Dialogue Box
        textArea.setText(DFSTraversal.traverse(rootNode, size));
        
        // wrap a scrollpane around it
        scrollPane = new JScrollPane(textArea);
        
        // display them in a message dialog
        pane = new JOptionPane(scrollPane);

        dialgoue = pane.createDialog(null, "PROBLEM # 2");
        // dialgoue.setLocation(0,0);
        dialgoue.setVisible(true);

        // PROBLEM # 3

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
        a.setAllChildren(new Node[]{b,c,d});
        b.setAllChildren(new Node[]{e});
        c.setAllChildren(new Node[]{f,g,h});
        d.setAllChildren(new Node[]{i,j});
        e.setAllChildren(new Node[]{k,l});
        f.setAllChildren(new Node[]{});
        g.setAllChildren(new Node[]{});
        h.setAllChildren(new Node[]{m});
        i.setAllChildren(new Node[]{});
        j.setAllChildren(new Node[]{});
        k.setAllChildren(new Node[]{});
        l.setAllChildren(new Node[]{});
        m.setAllChildren(new Node[]{});
        
        size = 13;
        // System.out.println("\n*********** PROBLEM # 3 *********** ");
        // System.out.println("FINAL TRAVERSING ORDER: " + DFSTraversal.traverse(a, size));
        
        // Display Result in Dialogue Box
        textArea.setText(DFSTraversal.traverse(a, size));
        
        // wrap a scrollpane around it
        scrollPane = new JScrollPane(textArea);
        
        // display them in a message dialog
        pane = new JOptionPane(scrollPane);

        dialgoue = pane.createDialog(null, "PROBLEM # 3");
        // dialgoue.setLocation(0,0);
        dialgoue.setVisible(true);

        // PROBLEM # 4

        // Define Node
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
        eig.setAllChildren(new Node[]{thr,ten});
        thr.setAllChildren(new Node[]{one, six});
        ten.setAllChildren(new Node[]{ftn});
        one.setAllChildren(new Node[]{});
        six.setAllChildren(new Node[]{fou, sev});
        ftn.setAllChildren(new Node[]{thn});
        fou.setAllChildren(new Node[]{});
        sev.setAllChildren(new Node[]{});
        thn.setAllChildren(new Node[]{});
        
        size = 9;
        // System.out.println("\n*********** PROBLEM # 4 *********** ");

        // Display Result in Dialogue Box
        textArea.setText(DFSTraversal.traverse(eig, size));
        
        // wrap a scrollpane around it
        scrollPane = new JScrollPane(textArea);
        
        // display them in a message dialog
        pane = new JOptionPane(scrollPane);

        dialgoue = pane.createDialog(null, "PROBLEM # 4");
        // dialgoue.setLocation(0,0);
        dialgoue.setVisible(true);


        // No Solution in Slides 

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
        one.setAllChildren(new Node[]{two, sev, eig});
        two.setAllChildren(new Node[]{thr, six});
        thr.setAllChildren(new Node[]{fou, fiv});
        fou.setAllChildren(new Node[]{});
        fiv.setAllChildren(new Node[]{});
        six.setAllChildren(new Node[]{});
        sev.setAllChildren(new Node[]{});
        eig.setAllChildren(new Node[]{nin, twe});
        nin.setAllChildren(new Node[]{ten, ele});
        ten.setAllChildren(new Node[]{});
        ele.setAllChildren(new Node[]{});
        twe.setAllChildren(new Node[]{});

        size = 12;
        // System.out.println("\n*********** PROBLEM # 5 *********** ");
        // System.out.println("FINAL TRAVERSING ORDER: " + DFSTraversal.traverse(one, size));
        // DFSTraversal.traverse(one, size);

        // Display Result in Dialogue Box
        textArea.setText(DFSTraversal.traverse(one, size));
        
        // display them in a message dialog
        pane = new JOptionPane(scrollPane);

        dialgoue = pane.createDialog(null, "PROBLEM # 5");
        dialgoue.setVisible(true);

        System.exit(0);        
    }

}
