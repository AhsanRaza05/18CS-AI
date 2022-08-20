package com.uniformsearchalgorithms.breathfirstsearchalgorithm.algorithm;

import java.util.Queue;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.uniformsearchalgorithms.node.Node;

import java.util.LinkedList;
import java.util.Arrays;

// import java.util.*;

public class BreadthFirstSearchAlgorithm {

	public static String traverse(Node rootNode, int totalNodes) {

		Queue<Node> queue = new LinkedList<Node>();

		Node currentNode;

		String visitedNodes[] = new String[totalNodes];

		int index = 0;

		// Choose the root node, mark it as visited, make it current node.
		visitedNodes[index] = rootNode.getItem();
		currentNode = rootNode;

		int step = 1;

		String result = "";

		result += "\n\tStep # " + step + "\n\tCurrent Node: " + currentNode + "\n\tQueue: " + queue + "\n\tVisited: "
				+ Arrays.toString(visitedNodes) + "\n";

		l: do {

			step++;

			// Find adjacent unvisited node of current node, place it in Queue and mark it
			// visited.
			for (int i = 0; i < currentNode.getChildren().length; i++) {

				if (!isVisited(currentNode.getChildren()[i].getItem(), visitedNodes)) {

					queue.add(currentNode.getChildren()[i]);
					visitedNodes[++index] = currentNode.getChildren()[i].getItem();

					// result += "\n\tStep # " + step + "\tCurrent Node: " + currentNode + "\tQueue:
					// " + queue + "\tVisited: " + Arrays.toString(visitedNodes) + "\n";

					result += "\n\tStep # " + step + "\n\tCurrent Node: " + currentNode + "\n\tQueue: " + queue
							+ "\n\tVisited: " + Arrays.toString(visitedNodes) + "\n";
					

					continue l;

				}

			}

			// If no unvisited adjacent node found, dequeue node from Queue and make it
			// current node.
			currentNode = queue.poll();


			result += "\n\tStep # " + step + "\n\tCurrent Node: " + currentNode + "\n\tQueue: " + queue
					+ "\n\tVisited: " + Arrays.toString(visitedNodes) + "\n";
			// result += "\n\tStep # " + step + "\tCurrent Node: " + currentNode + "\tQueue:
			// " + queue + "\tVisited: " + Arrays.toString(visitedNodes) + "\n";
			// Repeat Loop until Queue is empty and Current Node is null
		} while (!(currentNode == null && queue.isEmpty()));
		// } while(currentNode != null || !queue.isEmpty());
		// } while(!queue.isEmpty());

		// return Arrays.toString(visitedNodes);
		result = "\n********************************** Breadth First Search Algorithm ****************************** \n"+"\n****************** FINAL TRAVERSING ORDER: " + Arrays.toString(visitedNodes)
				+ " ******************\n" + result;
		return result;

	}

	
	
	static boolean isVisited(String n, String visitedNodes[]) {

		for (int i = 0; i < visitedNodes.length; i++) {

			if (n.equalsIgnoreCase(visitedNodes[i])) {

				return true;
			}
		}

		return false;

	}

}

