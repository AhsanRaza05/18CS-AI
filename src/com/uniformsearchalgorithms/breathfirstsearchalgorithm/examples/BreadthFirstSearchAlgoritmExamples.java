package com.uniformsearchalgorithms.breathfirstsearchalgorithm.examples;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.uniformsearchalgorithms.breathfirstsearchalgorithm.algorithm.BreadthFirstSearchAlgorithm;
import com.uniformsearchalgorithms.node.Node;

public class BreadthFirstSearchAlgoritmExamples {

	public static void displayExamples() {

		// create a JTextArea
		JTextArea textArea = new JTextArea(38, 45);
		textArea.setEditable(false);

		JDialog dialgoue;

		JOptionPane pane;

		JScrollPane scrollPane;

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
		f.setAllChildren(new Node[] { b, g });
		b.setAllChildren(new Node[] { a, d });
		g.setAllChildren(new Node[] { i });
		a.setAllChildren(new Node[] {});
		d.setAllChildren(new Node[] { c, e });
		i.setAllChildren(new Node[] { h });
		c.setAllChildren(new Node[] {});
		e.setAllChildren(new Node[] {});
		h.setAllChildren(new Node[] {});

		totalNodes = 9;
		// System.out.println("\n*********** Problem # 1 *********** ");
		// System.out.println("FINAL TRAVERSING ORDER: " + BFSTraversal.traverse(f,
		// totalNodes));
		// System.out.println(BFSTraversal.traverse(f, totalNodes));

		// Display Result in Dialogue Box
		textArea.setText(BreadthFirstSearchAlgorithm.traverse(f, totalNodes));

		// wrap a scrollpane around it
		scrollPane = new JScrollPane(textArea);

		// display them in a message dialog
		pane = new JOptionPane(scrollPane);

		dialgoue = pane.createDialog(null,
				"***************************************** PROBLEM # 1 ***************************************** ");
		// dialgoue.setLocation(0,0);
		dialgoue.setVisible(true);

		// Problem # 2

		// Define Nodes
		Node rootNode = new Node("S");

		Node sNode = new Node("Q");

		Node tNode = new Node("W");

		Node fNode = new Node("T");

		Node fiNode = new Node("R");

		Node siNode = new Node("G");

		// Set children
		rootNode.setAllChildren(new Node[] { sNode, tNode, fNode });

		sNode.setAllChildren(new Node[] { fiNode, tNode });

		tNode.setAllChildren(new Node[] { fNode, siNode });

		fNode.setAllChildren(new Node[] { siNode });

		// siNode, tNode
		fiNode.setAllChildren(new Node[] { siNode, tNode });

		siNode.setAllChildren(new Node[] {});

		totalNodes = 6;
		// System.out.println("\n\n*********** Problem # 2 *********** ");
		// System.out.println("FINAL TRAVERSING ORDER: " +
		// BFSTraversal.traverse(rootNode, totalNodes));

		// Display Result in Dialogue Box
		textArea.setText(BreadthFirstSearchAlgorithm.traverse(rootNode, totalNodes));

		// wrap a scrollpane around it
		scrollPane = new JScrollPane(textArea);

		// display them in a message dialog
		pane = new JOptionPane(scrollPane);

		dialgoue = pane.createDialog(null,
				"***************************************** PROBLEM # 2 ***************************************** ");
		// dialgoue.setLocation(0,0);
		dialgoue.setVisible(true);

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
		a.setAllChildren(new Node[] { b, c, d });
		b.setAllChildren(new Node[] { e });
		c.setAllChildren(new Node[] { f, g, h });
		d.setAllChildren(new Node[] { i, j });
		e.setAllChildren(new Node[] { k, l });
		f.setAllChildren(new Node[] {});
		g.setAllChildren(new Node[] {});
		h.setAllChildren(new Node[] { m });
		i.setAllChildren(new Node[] {});
		j.setAllChildren(new Node[] {});
		k.setAllChildren(new Node[] {});
		l.setAllChildren(new Node[] {});
		m.setAllChildren(new Node[] {});

		totalNodes = 13;
		// System.out.println("\n\n*********** Problem # 3 *********** ");
		// System.out.println("FINAL TRAVERSING ORDER: " + BFSTraversal.traverse(a,
		// totalNodes));

		// Display Result in Dialogue Box
		textArea.setText(BreadthFirstSearchAlgorithm.traverse(a, totalNodes));

		// wrap a scrollpane around it
		scrollPane = new JScrollPane(textArea);

		// display them in a message dialog
		pane = new JOptionPane(scrollPane);

		dialgoue = pane.createDialog(null,
				"***************************************** PROBLEM # 3 ***************************************** ");
		// dialgoue.setLocation(0,0);
		dialgoue.setVisible(true);

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
		eig.setAllChildren(new Node[] { thr, ten });
		thr.setAllChildren(new Node[] { one, six });
		ten.setAllChildren(new Node[] { ftn });
		one.setAllChildren(new Node[] {});
		six.setAllChildren(new Node[] { fou, sev });
		ftn.setAllChildren(new Node[] { thn });
		fou.setAllChildren(new Node[] {});
		sev.setAllChildren(new Node[] {});
		thn.setAllChildren(new Node[] {});

		totalNodes = 9;
		// System.out.println("\n\n*********** Problem # 4 *********** ");
		// System.out.println("FINAL TRAVERSING ORDER: " + BFSTraversal.traverse(eig,
		// totalNodes));

		// Display Result in Dialogue Box
		textArea.setText(BreadthFirstSearchAlgorithm.traverse(eig, totalNodes));

		// wrap a scrollpane around it
		scrollPane = new JScrollPane(textArea);

		// display them in a message dialog
		pane = new JOptionPane(scrollPane);

		dialgoue = pane.createDialog(null,
				"***************************************** PROBLEM # 4 ***************************************** ");
		// dialgoue.setLocation(0,0);
		dialgoue.setVisible(true);

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
		one.setAllChildren(new Node[] { two, thr, fou });
		two.setAllChildren(new Node[] { fiv, six });
		thr.setAllChildren(new Node[] {});
		fou.setAllChildren(new Node[] { sev, eig });
		fiv.setAllChildren(new Node[] { nin, ten });
		six.setAllChildren(new Node[] {});
		sev.setAllChildren(new Node[] { ele, twe });
		eig.setAllChildren(new Node[] {});
		nin.setAllChildren(new Node[] {});
		ten.setAllChildren(new Node[] {});
		ele.setAllChildren(new Node[] {});
		twe.setAllChildren(new Node[] {});

		totalNodes = 12;
		// System.out.println("\n\n*********** Problem # 5 *********** ");
		// System.out.println("FINAL TRAVERSING ORDER: " + BFSTraversal.traverse(one,
		// totalNodes));

		// Display Result in Dialogue Box
		textArea.setText(BreadthFirstSearchAlgorithm.traverse(one, totalNodes));

		// display them in a message dialog
		pane = new JOptionPane(scrollPane);

		dialgoue = pane.createDialog(null,
				"***************************************** PROBLEM # 5 ***************************************** ");
		dialgoue.setVisible(true);

		System.exit(0);

	}

}

