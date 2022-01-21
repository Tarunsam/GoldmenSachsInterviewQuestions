package com.gs.ownpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchTree {
	static class BST  {

	    private Node root;

	    public BST() {
	      this.root = new Node();
	    }

	    public void put(int value) {

			
			root=put(root, value);
			
	      // your code
	    }
		
		private Node put(Node node, int value){
			
			if(node==null||node.val==null){
				Node newNode= new Node();
				newNode.val=value;	
				node=newNode;
				return node;
			}
		
			
				if(value<node.val)
					node.left=put(node.left,value);
				else
					node.right=
					put(node.right,value);
				return node;
			
		}

	    public boolean contains(int value) {
	      // your code
	    	
	      return contains(root, value);
	    }
	    
		private boolean contains(Node node, int value) {
			if (node == null)
				return false;
			if (node.val == value) {
				return true;
			}
			return value < node.val ? contains(node.left, value) : contains(node.right, value);
		}
	    public List<Integer> inOrderTraversal() {
	      final ArrayList<Integer> acc = new ArrayList<>();
	      inOrderTraversal(root, acc);
	      return acc;
	    }

		private void inOrderTraversal(Node node, List<Integer> acc) {
			if (node == null) {
				return;
			}
			inOrderTraversal(node.left, acc);
			acc.add(node.val);
			inOrderTraversal(node.right, acc);

		}

	    private static class Node {
	      Integer val;
	      Node left;
	      Node right;
	    }
	  }


public static void main(String[] args) {

  final BST searchTree = new BST();

    searchTree.put(3);
    searchTree.put(1);
    searchTree.put(2);
    searchTree.put(5);
    
    if(Arrays.asList(1,2,3,5).equals(searchTree.inOrderTraversal())
    		&& !searchTree.contains(0) 
    		&& searchTree.contains(1)
    		&& searchTree.contains(2)
    		&& searchTree.contains(3)
    		&& !searchTree.contains(4)
    		&& searchTree.contains(5)
    		&& !searchTree.contains(6)){
    	System.out.println("Pass");
    }else {
    	System.out.println("Fail");
    }
    		
}

}
