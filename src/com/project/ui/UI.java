package com.project.ui;

import java.util.LinkedList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.informedsearchalgorithms.astarsearchalgorithm.examples.AStarSearchAlgorithmExamples;
import com.informedsearchalgorithms.greedybestfirstsearchalgorithm.examples.GreedyBestFirstSearchAlgorithmExamples;
import com.informedsearchalgorithms.nodesQueuesComparators.HeuristicWeightedNode;
import com.uninformedsearchalgorithms.breathfirstsearchalgorithm.algorithm.BreadthFirstSearchAlgorithm;
import com.uninformedsearchalgorithms.breathfirstsearchalgorithm.examples.BreadthFirstSearchAlgoritmExamples;
import com.uninformedsearchalgorithms.depthfirstsearchalgorithm.algorithm.DepthFirstSearchAlgorithm;
import com.uninformedsearchalgorithms.depthfirstsearchalgorithm.examples.DepthFirstSearchAlgorithmExamples;
import com.uninformedsearchalgorithms.depthlimitedsearchalgorithm.examples.DepthLimitedSearchAlgorithmExamples;
import com.uninformedsearchalgorithms.nodesQueuesComparators.*;
import com.uninformedsearchalgorithms.uniformcostsearchalgorithm.examples.UniformCostSearchAlgorithmExamples;


public class UI extends javax.swing.JFrame {

 
	public static String allNodes, allNeighbourgroups, goalState, depthLimit, allcostGroups, allHeuristicCosts = "";
	
	public static List<String> selectedAlgorithmsList;
	
	public static boolean isTraversing;
	
    public UI() {
        initComponents();
        
        BFSCBox.setSelected(true);
        noRButton.setSelected(true);
        
    }


    @SuppressWarnings("unchecked")
    
    private void initComponents() {

    	questionGroup = new javax.swing.ButtonGroup();
        questionGroup.add(yesRButton);
        questionGroup.add(noRButton);
        searchPanel = new javax.swing.JPanel();
        BFSCBox = new javax.swing.JCheckBox();
        typeLbl = new javax.swing.JLabel();
        DFSCBox = new javax.swing.JCheckBox();
        DLSCBox = new javax.swing.JCheckBox();
        UCSCBox = new javax.swing.JCheckBox();
        typeLbl1 = new javax.swing.JLabel();
        typeLbl2 = new javax.swing.JLabel();
        GBFSBox = new javax.swing.JCheckBox();
        AStarBox = new javax.swing.JCheckBox();
        BSBox = new javax.swing.JCheckBox();
        HCSBox = new javax.swing.JCheckBox();
        questionPanel = new javax.swing.JPanel();
        graphLbl = new javax.swing.JLabel();
        yesRButton = new javax.swing.JRadioButton();
        noRButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        subButton = new javax.swing.JButton();
        informationJButton = new javax.swing.JButton();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BFSCBox.setText("BFS");

        typeLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        typeLbl.setText("Select Type of Search");

        DFSCBox.setText("DFS");
//        DFSCBox.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                DFSCBoxActionPerformed(evt);
//            }
//        });

        DLSCBox.setText("DLS");
        
        UCSCBox.setText("UCS");
       

        typeLbl1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        typeLbl1.setText("Un-Informed Search");

        typeLbl2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        typeLbl2.setText("Informed Search");

        GBFSBox.setText("GBFS");

        AStarBox.setText("A*");
        
        BSBox.setText("BS");
        

        HCSBox.setText("HCS");
        

        informationJButton.setText("i");
        informationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informationJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BFSCBox)
                    .addComponent(DLSCBox))
                .addGap(76, 76, 76)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UCSCBox)
                    .addComponent(DFSCBox))
                .addGap(46, 46, 46)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GBFSBox)
                    .addComponent(BSBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AStarBox)
                    .addComponent(HCSBox))
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchPanelLayout.createSequentialGroup()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(typeLbl)
                        .addGap(81, 81, 81)
                        .addComponent(informationJButton)
                        .addGap(9, 9, 9))
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(typeLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(typeLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(typeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(informationJButton))
                .addGap(18, 18, 18)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DFSCBox)
                    .addComponent(BFSCBox)
                    .addComponent(GBFSBox)
                    .addComponent(AStarBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UCSCBox)
                    .addComponent(DLSCBox)
                    .addComponent(BSBox)
                    .addComponent(HCSBox))
                .addGap(21, 21, 21))
        );

        graphLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        graphLbl.setText("Do You Wanna Define New Graph ?");

        questionGroup.add(yesRButton);
        yesRButton.setText("Yes");

        questionGroup.add(noRButton);
        noRButton.setText("No. I will use example problem");

        javax.swing.GroupLayout questionPanelLayout = new javax.swing.GroupLayout(questionPanel);
        questionPanel.setLayout(questionPanelLayout);
        questionPanelLayout.setHorizontalGroup(
            questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, questionPanelLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yesRButton)
                    .addComponent(noRButton)
                    .addComponent(graphLbl))
                .addGap(32, 32, 32))
        );
        questionPanelLayout.setVerticalGroup(
            questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(graphLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yesRButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(noRButton)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("AI Searching Algorithm");

        subButton.setText("Submit");
        subButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(questionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(subButton)
                        .addGap(197, 197, 197))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(searchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(searchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(questionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        
        setLocationRelativeTo(null);
        
    }

//    private void DFSCBoxActionPerformed(java.awt.event.ActionEvent evt) {                                        
//        // TODO add your handling code here:
//    }                                       
// 
    
    private void informationJButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                   
    	
    	
    	try {
			java.awt.Desktop.getDesktop().browse(java.net.URI.create("https://github.com/AhsanRaza05/Search-Algorithms-in-Artificial-Intelligence-Java/blob/main/README.md#Overview_Head"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    }
    

    private void subButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	
    	selectedAlgorithmsList = new ArrayList<String>(4);
    	
    	if(noRButton.isSelected()) {
    		System.out.println("HI");
    		
    		if(BFSCBox.isSelected()) {
    			
    			BreadthFirstSearchAlgoritmExamples.displayExamples();
    		}
    		
    		if(DFSCBox.isSelected()) {
    			
    			DepthFirstSearchAlgorithmExamples.displayExamples();
    		}
    		
    		if(DLSCBox.isSelected()) {
    			
    			DepthLimitedSearchAlgorithmExamples.dsiplay();
    		}
    		
    		if(UCSCBox.isSelected()) {
    			
    			UniformCostSearchAlgorithmExamples.displayExamples();
    		}
    		
    		if(GBFSBox.isSelected()) {
    			GreedyBestFirstSearchAlgorithmExamples.displayExamples();
    		}
    		
    		if(AStarBox.isSelected()) {
    			
    			AStarSearchAlgorithmExamples.displayExamples();
    		}
    		
    		if(BSBox.isSelected()) {
    			
    			JOptionPane.showMessageDialog(null, "Enter Its CODE First! You Moron.");
    		}

    		if(HCSBox.isSelected()) {
    			
    			JOptionPane.showMessageDialog(null, "Enter Its CODE First! You Moron.");
    		}

    	}
    	else {
    		
    		System.out.println("Bye");
    		
    		if(BFSCBox.isSelected()) {
    			
    			
    			selectedAlgorithmsList.add("BFS");
    		}
    		
    		if(DFSCBox.isSelected()) {
   
    			
    			selectedAlgorithmsList.add("DFS");
    		}
    		
    		if(DLSCBox.isSelected()) {
    
    			
    			selectedAlgorithmsList.add("DLS");
    		}
    		
    		if(UCSCBox.isSelected()) {
    
    			
    			selectedAlgorithmsList.add("UCS");
    		}
    		
    		if(GBFSBox.isSelected()) {
    			
    			selectedAlgorithmsList.add("GBFS");
    		}
    		
    		if(AStarBox.isSelected()) {
    			
    			selectedAlgorithmsList.add("AS");
    		}
    		
    		if(BSBox.isSelected()) {
    			
    			selectedAlgorithmsList.add("BS");
    		}

    		if(HCSBox.isSelected()) {
    			
    			selectedAlgorithmsList.add("HCS");
    		}
    		
    		// Creating the Window of operation based on List of Selected Algorithms
        	UI.createWindow(UI.selectedAlgorithmsList);
    	}
    	
    	
    }//GEN-LAST:event_subButtonActionPerformed

    public static void createWindow(List <String> selectedAlgorithmsList) {
    	
    	System.out.println("Before Removing; " + selectedAlgorithmsList);
    	
    	String item ;
    	
    	if(!selectedAlgorithmsList.isEmpty()) {
    		
    		item = selectedAlgorithmsList.remove(0);
    		
    		System.out.println("After Removing; " + selectedAlgorithmsList);
        	
        	System.out.println();
        	
        	if(item.equalsIgnoreCase("BFS")) {
    			
    			new DefineGraphBasic("BFS").setVisible(true);	
    		}
    		
        	else if(item.equalsIgnoreCase("DFS")) {
    			
    			new DefineGraphBasic("DFS").setVisible(true);
    		}
    		
        	else if(item.equalsIgnoreCase("DLS")) {
    			
    			new DefineGraphDLS().setVisible(true);
    		}
    		
        	else if(item.equalsIgnoreCase("UCS")) {
    			
    			new DefineGraphUCS().setVisible(true);

    		}
        	else if(item.equalsIgnoreCase("GBFS")) {
    			
    			new DefineGraphHeuristic("GBFS").setVisible(true);
    		}
        	
			else if(item.equalsIgnoreCase("AS")) {
				
				new DefineGraphHeuristic("AS").setVisible(true);
			}
        	
    	}
    	
    	
    }
    
    public static String[] getNodesListOfString(String allNodes) {
		
		return (allNodes.split(" "));
		
	}
    
    public static Map<String, Node> getNodesListOfNode(String[] nodesList){
    	
    	Map <String, Node> allNodes = new HashMap<String, Node>();
    	
    	for(String item: nodesList) {
    		
    		allNodes.put(item, new Node(item));
    	}
    	
    	System.out.println(allNodes);
    	
    	return (allNodes);
    	
    }
    
    public static Map<String, WeightedNode> getNodesListOfWeightNode(String[] nodesList){
    	
    	Map <String, WeightedNode> allNodes = new HashMap<String, WeightedNode>();
    	
    	for(String item: nodesList) {
    		
    		allNodes.put(item, new WeightedNode(item));
    	}
    	
    	System.out.println(allNodes);
    	
    	return (allNodes);
    	
    }
    
    // To Convert List of String to List of HeuristicWeightedNode
    public static Map<String, HeuristicWeightedNode> getNodesListOfHeuristicWeightedNode(String[] nodesList){
    	
    	Map <String, HeuristicWeightedNode> allNodes = new HashMap<String, HeuristicWeightedNode>();
    	
    	for(String item: nodesList) {
    		
    		allNodes.put(item, new HeuristicWeightedNode(item));
    	}
    	
    	System.out.println(allNodes);
    	
    	return (allNodes);
    	
    }
    
    public static Map<String, Node> setChildren( Map<String, Node> nodes, String allNeighbourgroups, String[] getNodes) {
    	
    	// Make String Array of Children.
    	String childrenGroups[] = allNeighbourgroups.split(" ");
    	System.out.println("Children Groups" + Arrays.toString(childrenGroups));
    	
    	// Add children to Nodes.
    	Node childNodes[] = new Node[0];
    	String children[];
    	String parentNode = "";
    	
    	for(int i = 0; i < childrenGroups.length; i++) {
    		
    		children = childrenGroups[i].split(",");
    		
    		childNodes = new Node[children.length];
    		
    		for(int j = 0; j < children.length; j++) {
    			
    			childNodes[j] = nodes.get(children[j]);
    			
    			parentNode = getNodes[i];
    			
    		}
    		
    		nodes.get(parentNode).setAllChildren(childNodes);
    		
//    		if(getNodes.length > childrenGroups.length) {
//    			
//    			nodes.get(getNodes[getNodes.length - 1]).setAllChildren(new Node[] {});
//    		}
    	}
    	
    	return nodes;
    		
    }
    
    public static Map<String, WeightedNode> setChildrenAndCost( Map<String, WeightedNode> nodes, String allNeighbourgroups, String[] getNodes, String allCostGroups) {
    	
    	// Make String Array of Children.
    	String childrenGroups[] = allNeighbourgroups.split(" ");
    	System.out.println("Children Groups" + Arrays.toString(childrenGroups));
    	
    	
    	// Make String Array of Cost.
    	String costGroups[] = allCostGroups.split(" ");
    	System.out.println("Cost Groups" + Arrays.toString(costGroups));
    	
    	
    	WeightedNode childNodes[] = new WeightedNode[0];
    	String childrenItem[];
    	
    	Integer costs[];
    	
    	String parentNodeItem = "";
    	
    	// Add children to Nodes.
    	for(int i = 0; i < childrenGroups.length; i++) {
    		
    		// Split a child group to its children items array
    		childrenItem = childrenGroups[i].split(",");
    		
    		costs = new Integer[childrenItem.length];
    		childNodes = new WeightedNode[childrenItem.length];
    		
    		for(int j = 0; j < childrenItem.length; j++) {
    			
    			// Convert Items(String) to Nodes 
    			childNodes[j] = nodes.get(childrenItem[j]);	
    			
    			// Split a Cost group to its children cost items array and casting each element to Integer
    			costs[j] = Integer.parseInt(costGroups[i].split(",")[j]);
    		}
    		
    		// Get Items in Parent Node
    		parentNodeItem = getNodes[i];
    		
    		// Add Children array in node
    		nodes.get(parentNodeItem).setAllchildren(childNodes);
    		
    		// Add Cost array in node
    		nodes.get(parentNodeItem).setCost(costs);
    		
    		
//    		if(getNodes.length > childrenGroups.length) {
//    			
//    			nodes.get(getNodes[getNodes.length - 1]).setAllChildren(new Node[] {});
//    		}
    	}
    	
    	return nodes;
    		
    }
       
    public static Map<String, HeuristicWeightedNode> setChildrenAndCostAndHeuristciCost( Map<String, HeuristicWeightedNode> nodes, String allNeighbourgroups, String[] getNodes, String allCostGroups, String allHeuristicCostGroups) {
    	
    	// Make String Array of Children.
    	String childrenGroups[] = allNeighbourgroups.split(" ");
    	System.out.println("Children Groups" + Arrays.toString(childrenGroups));
    	
    	
    	// Make String Array of Cost.
    	String costGroups[] = allCostGroups.split(" ");
    	System.out.println("Cost Groups" + Arrays.toString(costGroups));
    	
    	// Make String Array of Heuristic Cost.
    	String HeuristicCostGroups[] = allHeuristicCostGroups.split(" ");
    	System.out.println("Heuristc Cost Groups" + Arrays.toString(HeuristicCostGroups));
    	
    	HeuristicWeightedNode childNodes[] = new HeuristicWeightedNode[0];
    	String childrenItem[];
    	
    	Integer costs[];
    	
    	Integer heuristicCost = 0;
    	
    	String parentNodeItem = "";
    	
    	// Add children to Nodes.
    	for(int i = 0; i < childrenGroups.length; i++) {
    		
    		// Split a child group to its children items array
    		childrenItem = childrenGroups[i].split(",");
    		
    		costs = new Integer[childrenItem.length];
    		childNodes = new HeuristicWeightedNode[childrenItem.length];
    		
    		// Casting Heuristic Cost from String to Integer.
    		heuristicCost = Integer.parseInt(HeuristicCostGroups[i]);
    		
    		for(int j = 0; j < childrenItem.length; j++) {
    			
    			// Convert Items(String) to Nodes 
    			childNodes[j] = nodes.get(childrenItem[j]);	
    			
    			// Split a Cost group to its children cost items array and casting each element to Integer
    			costs[j] = Integer.parseInt(costGroups[i].split(",")[j]);
    		}
    		
    		// Get Items in Parent Node
    		parentNodeItem = getNodes[i];
    		
    		// Add Children array in node
    		nodes.get(parentNodeItem).setAllchildren(childNodes);
    		
    		// Add Cost array in node
    		nodes.get(parentNodeItem).setCost(costs);
    		
    		// Add Cost array in node
    		nodes.get(parentNodeItem).setHeuristicCost(heuristicCost);
    		
    		
//    		if(getNodes.length > childrenGroups.length) {
//    			
//    			nodes.get(getNodes[getNodes.length - 1]).setAllChildren(new Node[] {});
//    		}
    	}
    	
    	return nodes;
    		
    }
    
    public static void displayResult(String text) {
    	
    	// create a JTextArea
	   	JTextArea textArea = new JTextArea(38, 45);
	   	textArea.setEditable(false);
	
	   	JDialog dialgoue;
	
	   	JOptionPane pane;
	
	   	JScrollPane scrollPane;
  	
	    // Display Result in Dialogue Box
	   	
	   	textArea.setText(text);
	   	
		// wrap a scrollpane around it
		scrollPane = new JScrollPane(textArea);

		// display them in a message dialog
		pane = new JOptionPane(scrollPane);

		dialgoue = pane.createDialog(null,
				"***************************************** PROBLEM # 1 ***************************************** ");
		// dialgoue.setLocation(0,0);
		dialgoue.setVisible(true);
    }

    // Variables declaration - do not modify                     
    private javax.swing.JCheckBox AStarBox;
    private javax.swing.JCheckBox BFSCBox;
    private javax.swing.JCheckBox BSBox;
    private javax.swing.JCheckBox DFSCBox;
    private javax.swing.JCheckBox DLSCBox;
    private javax.swing.JCheckBox GBFSBox;
    private javax.swing.JCheckBox HCSBox;
    private javax.swing.JCheckBox UCSCBox;
    private javax.swing.JLabel graphLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton noRButton;
    private javax.swing.ButtonGroup questionGroup;
    private javax.swing.JPanel questionPanel;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JButton subButton;
    private javax.swing.JLabel typeLbl;
    private javax.swing.JLabel typeLbl1;
    private javax.swing.JLabel typeLbl2;
    private javax.swing.JRadioButton yesRButton;
    private javax.swing.JButton informationJButton;
    // End of variables declaration                   
}

