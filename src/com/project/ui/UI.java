/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.project.ui;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.uniformsearchalgorithms.breathfirstsearchalgorithm.examples.BreadthFirstSearchAlgoritmExamples;
import com.uniformsearchalgorithms.depthfirstsearchalgorithm.examples.DepthFirstSearchAlgorithmExamples;
import com.uniformsearchalgorithms.depthlimitedsearchalgorithm.examples.DepthLimitedSearchAlgorithmExamples;
import com.uniformsearchalgorithms.uniformcostsearchalgorithm.examples.UniformCostSearchAlgorithmExamples;
import com.uniformsearchalgorithms.node.*;

/**
 *
 * @author AHSAN
 */
public class UI extends javax.swing.JFrame {

    /**
     * Creates new form UI
     */
	
	public static String allNodes, allNeighbourgroups, goalState, depthLimit, allcostGroups = "";
	
	public static List<String> selectedAlgorithmsList;
	
	public static boolean isTraversing;
	
    public UI() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
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
        questionPanel = new javax.swing.JPanel();
        graphLbl = new javax.swing.JLabel();
        yesRButton = new javax.swing.JRadioButton();
        noRButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        subButton = new javax.swing.JButton();

        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BFSCBox.setText("BFS");

        typeLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        typeLbl.setText("Select Type of Search");

        DFSCBox.setText("DFS");

        DLSCBox.setText("DLS");

        UCSCBox.setText("UCS");

        BFSCBox.setSelected(true);
        
        noRButton.setSelected(true);
        
        
        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addComponent(BFSCBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DFSCBox))
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addComponent(DLSCBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UCSCBox)))
                .addGap(37, 37, 37))
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(typeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(typeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BFSCBox)
                    .addComponent(DFSCBox))
                .addGap(18, 18, 18)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DLSCBox)
                    .addComponent(UCSCBox))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        graphLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        graphLbl.setText("Do You Wanna Define New Graph ?");

        questionGroup.add(yesRButton);
        yesRButton.setText("Yes");

        questionGroup.add(noRButton);
        noRButton.setText("No. I will use example problem");
        noRButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noRButtonActionPerformed(evt);
            }
        });

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(questionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(110, 110, 110))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(subButton)
                        .addGap(149, 149, 149))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(questionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subButton, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void noRButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noRButtonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_noRButtonActionPerformed

    private void subButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subButtonActionPerformed
    	
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
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox BFSCBox;
    private javax.swing.JCheckBox DFSCBox;
    private javax.swing.JCheckBox DLSCBox;
    private javax.swing.JCheckBox UCSCBox;
    private javax.swing.JLabel graphLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton noRButton;
    private javax.swing.ButtonGroup questionGroup;
    private javax.swing.JPanel questionPanel;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JButton subButton;
    private javax.swing.JLabel typeLbl;
    private javax.swing.JRadioButton yesRButton;
    // End of variables declaration//GEN-END:variables
}
