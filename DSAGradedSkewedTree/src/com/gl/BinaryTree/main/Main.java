package com.gl.BinaryTree.main;

import com.gl.BinaryTree.beans.Node;
import com.gl.BinaryTree.service.BTtoSkew;

public class Main {
	public static Node node;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
			BTtoSkew tree = new BTtoSkew();
			BTtoSkew.node = new Node(50);
			BTtoSkew.node.left = new Node(30);
			BTtoSkew.node.right = new Node(60);
			BTtoSkew.node.left.left = new Node(10);
			BTtoSkew.node.left.right = new Node(40);

			tree.changeBTToSkew(BTtoSkew.node);
			tree.traverseTree(BTtoSkew.headNode);

		}
	

}
