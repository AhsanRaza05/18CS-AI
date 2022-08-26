package com.uninformedsearchalgorithms.depthlimitedsearchalgorithm.examples;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.uninformedsearchalgorithms.depthlimitedsearchalgorithm.algorithm.DepthLimitedSearchAlgorithm;
import com.uninformedsearchalgorithms.nodesQueuesComparators.*;

public class DepthLimitedSearchAlgorithmExamples {

	public static void dsiplay() {
		
		 // create a JTextArea
        JTextArea textArea = new JTextArea(38,45);
        textArea.setEditable(false);

        JDialog dialgoue;

        JOptionPane pane;

        JScrollPane scrollPane;
		
		int size = 0;
        int level = 0;
        
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
//        System.out.println("\n*********** PROBLEM # 1 *********** ");
//        System.out.println("FINAL Limited TRAVERSING ORDER: " + DLSTraversal.limitedDepthSearchTraverse(f, size,level));
//   
        // Display Result in Dialogue Box
        textArea.setText(DepthLimitedSearchAlgorithm.traverse(f, size,level));

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
        level = 2;
     // Display Result in Dialogue Box
        textArea.setText(DepthLimitedSearchAlgorithm.traverse(rootNode, size,level));
        
        // wrap a scrollpane around it
        scrollPane = new JScrollPane(textArea);
        
        // display them in a message dialog
        pane = new JOptionPane(scrollPane);

        dialgoue = pane.createDialog(null, "PROBLEM # 2");
        // dialgoue.setLocation(0,0);
        dialgoue.setVisible(true); 

	}

}
