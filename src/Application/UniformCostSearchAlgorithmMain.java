package Application;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.uniformsearchalgorithms.uniformcostsearchalgorithm.UniformCostSearchAlgorithm;
import com.uniformsearchingalgorithms.node.WeightedNode;

public class UniformCostSearchAlgorithmMain {


    public static void main(String args[]){
        
        // create a JTextArea
        JTextArea textArea = new JTextArea(38,45);
        textArea.setEditable(false);

        JDialog dialgoue;

        JOptionPane pane;

        JScrollPane scrollPane;

        int totalNodes = 0;

        
        // Problem # 1

        // Define Nodes
        WeightedNode rootNode = new WeightedNode("S",new Integer[]{1,6,7});

        WeightedNode sNode = new WeightedNode("Q",new Integer[]{1,4});
        
        WeightedNode tNode = new WeightedNode("W",new Integer[]{3,2});

        WeightedNode fNode = new WeightedNode("T",new Integer[]{2});

        WeightedNode fiNode = new WeightedNode("R",new Integer[]{1,2});

        WeightedNode siNode = new WeightedNode("G",new Integer[]{0});

        // Set children
        rootNode.setAllchildren(new WeightedNode[] {sNode, tNode, fNode});

        sNode.setAllchildren(new WeightedNode[]{fiNode, tNode});

        tNode.setAllchildren(new WeightedNode[]{fNode, siNode});

        fNode.setAllchildren(new WeightedNode[]{siNode});

        // siNode, tNode
        fiNode.setAllchildren(new WeightedNode[]{ siNode, tNode});

        siNode.setAllchildren(new WeightedNode[]{});

        totalNodes = 6;
        // System.out.println("\n\n*********** Problem # 1 *********** ");
        // System.out.println(UniformCostSearch.search(rootNode, totalNodes, "G"));

         // Display Result in Dialogue Box
         textArea.setText(UniformCostSearchAlgorithm.search(rootNode, totalNodes, "G"));

         // wrap a scrollpane around it
         scrollPane = new JScrollPane(textArea);

         // display them in a message dialog
         pane = new JOptionPane(scrollPane);

         dialgoue = pane.createDialog(null, "***************************************** PROBLEM # 1 ***************************************** ");
         // dialgoue.setLocation(0,0);
         dialgoue.setVisible(true);

        // Problem # 2

        // Define Nodes
        WeightedNode b = new WeightedNode("B", new Integer[]{10});
        WeightedNode a = new WeightedNode("A", new Integer[]{12,60});
        WeightedNode c = new WeightedNode("C", new Integer[]{20,32});
        WeightedNode d = new WeightedNode("D", new Integer[]{});
        WeightedNode e = new WeightedNode("E", new Integer[]{7});
        
        // Set Children

        b.setAllchildren(new WeightedNode[]{a});
        a.setAllchildren(new WeightedNode[]{c,d});
        c.setAllchildren(new WeightedNode[]{b,d});
        d.setAllchildren(new WeightedNode[]{});
        e.setAllchildren(new WeightedNode[]{a});
        
        totalNodes = 5;
        // System.out.println("\n*********** Problem # 2 *********** ");
        // System.out.println(UniformCostSearch.search(b, totalNodes, "D"));

        // Display Result in Dialogue Box
        textArea.setText(UniformCostSearchAlgorithm.search(b, totalNodes, "D"));

        // wrap a scrollpane around it
        scrollPane = new JScrollPane(textArea);

        // display them in a message dialog
        pane = new JOptionPane(scrollPane);

        dialgoue = pane.createDialog(null, "***************************************** PROBLEM # 2 ***************************************** ");
        // dialgoue.setLocation(0,0);
        dialgoue.setVisible(true);


        // Problem # 3

        // Define Nodes
        WeightedNode f = new WeightedNode("F", new Integer[]{2,6});
        b = new WeightedNode("B", new Integer[]{7,1});
        WeightedNode g = new WeightedNode("G", new Integer[]{9});
        a = new WeightedNode("A", new Integer[]{8,2,7});
        d = new WeightedNode("D", new Integer[]{2,6});
        WeightedNode i = new WeightedNode("I", new Integer[]{9});
        c = new WeightedNode("C", new Integer[]{10,7,2});
        e = new WeightedNode("E", new Integer[]{6, 9});
        WeightedNode h = new WeightedNode("H", new Integer[]{3,8});
        WeightedNode j = new WeightedNode("J", new Integer[]{3,8});
        

        // Set Children
        a.setAllchildren(new WeightedNode[]{b,d,e});
        b.setAllchildren(new WeightedNode[]{c,e});
        c.setAllchildren(new WeightedNode[]{b,f,j});
        d.setAllchildren(new WeightedNode[]{a,h});
        e.setAllchildren(new WeightedNode[]{a,d});
        f.setAllchildren(new WeightedNode[]{b,i});
        g.setAllchildren(new WeightedNode[]{c});
        h.setAllchildren(new WeightedNode[]{e,i});
        i.setAllchildren(new WeightedNode[]{e});
        j.setAllchildren(new WeightedNode[]{g,i});

        totalNodes = 10;
        // System.out.println("\n\n*********** Problem # 3 *********** ");
        // System.out.println(UniformCostSearch.search(d, totalNodes, "X"));

        // Display Result in Dialogue Box
        textArea.setText(UniformCostSearchAlgorithm.search(d, totalNodes, "G"));

        // wrap a scrollpane around it
        scrollPane = new JScrollPane(textArea);

        // display them in a message dialog
        pane = new JOptionPane(scrollPane);

        dialgoue = pane.createDialog(null, "***************************************** PROBLEM # 3 ***************************************** ");
        // dialgoue.setLocation(0,0);
        dialgoue.setVisible(true);

    }
    
}    
