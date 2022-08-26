package com.informedsearchalgorithms.greedybestfirstsearchalgorithm.examples;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.informedsearchalgorithms.greedybestfirstsearchalgorithm.algorithm.BestFirstSearchAlgorithm;
import com.informedsearchalgorithms.nodesQueuesComparators.HeuristicWeightedNode;


public class GreedyBestFirstSearchAlgorithmExamples {

public static void displayExamples(){
        
        // create a JTextArea
        JTextArea textArea = new JTextArea(38,45);
        textArea.setEditable(false);

        JDialog dialgoue;

        JOptionPane pane;

        JScrollPane scrollPane;

        int totalNodes = 0;

        
        // Problem # 1

        // Define Nodes
        HeuristicWeightedNode b = new HeuristicWeightedNode("B", new Integer[]{}, 374);
        HeuristicWeightedNode a = new HeuristicWeightedNode("A", new Integer[]{75, 118, 140}, 366);
        HeuristicWeightedNode c = new HeuristicWeightedNode("C", new Integer[]{111}, 329);
        HeuristicWeightedNode d = new HeuristicWeightedNode("D", new Integer[]{}, 244);
        HeuristicWeightedNode e = new HeuristicWeightedNode("E", new Integer[]{99, 80}, 253);
        HeuristicWeightedNode f = new HeuristicWeightedNode("F", new Integer[]{211}, 178);
        HeuristicWeightedNode g = new HeuristicWeightedNode("G", new Integer[]{97}, 193);
        HeuristicWeightedNode i = new HeuristicWeightedNode("I", new Integer[]{}, 0);
        HeuristicWeightedNode h = new HeuristicWeightedNode("H", new Integer[]{98}, 98);
        

        // Set Children

        b.setAllchildren(new HeuristicWeightedNode[]{});
        a.setAllchildren(new HeuristicWeightedNode[]{b, c, e});
        c.setAllchildren(new HeuristicWeightedNode[]{d});
        d.setAllchildren(new HeuristicWeightedNode[]{});
        e.setAllchildren(new HeuristicWeightedNode[]{f, g});
        f.setAllchildren(new HeuristicWeightedNode[]{i});
        g.setAllchildren(new HeuristicWeightedNode[]{h});
        h.setAllchildren(new HeuristicWeightedNode[]{i});
        i.setAllchildren(new HeuristicWeightedNode[]{});
        
     
        // Display Result in Dialogue Box
        textArea.setText(BestFirstSearchAlgorithm.search(a,  "I"));

        // wrap a scrollpane around it
        scrollPane = new JScrollPane(textArea);

        // display them in a message dialog
        pane = new JOptionPane(scrollPane);

        dialgoue = pane.createDialog(null, "***************************************** PROBLEM # 1 ***************************************** ");
        // dialgoue.setLocation(0,0);
        dialgoue.setVisible(true);

        
     // Problem # 2

        // Define Nodes
        HeuristicWeightedNode s = new HeuristicWeightedNode("S", new Integer[]{2,5}, 10);
        b = new HeuristicWeightedNode("B", new Integer[]{5}, 3);
        a = new HeuristicWeightedNode("A", new Integer[]{2, 4}, 2);
        c = new HeuristicWeightedNode("C", new Integer[]{3}, 1);
        d = new HeuristicWeightedNode("D", new Integer[]{2}, 4);
        g = new HeuristicWeightedNode("G", new Integer[]{}, 0);
        
        
        // Set Children
        s.setAllchildren(new HeuristicWeightedNode[]{a, b});
        b.setAllchildren(new HeuristicWeightedNode[]{g});
        a.setAllchildren(new HeuristicWeightedNode[]{c, d});
        c.setAllchildren(new HeuristicWeightedNode[]{d});
        d.setAllchildren(new HeuristicWeightedNode[]{g});
        g.setAllchildren(new HeuristicWeightedNode[]{});
    
        // Display Result in Dialogue Box
        textArea.setText(BestFirstSearchAlgorithm.search(s,  "g"));

        // wrap a scrollpane around it
        scrollPane = new JScrollPane(textArea);

        // display them in a message dialog
        pane = new JOptionPane(scrollPane);

        dialgoue = pane.createDialog(null, "***************************************** PROBLEM # 2 ***************************************** ");
        // dialgoue.setLocation(0,0);
        dialgoue.setVisible(true);


        
    }
    
	
}


