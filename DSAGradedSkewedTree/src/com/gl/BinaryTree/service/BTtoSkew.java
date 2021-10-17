package com.gl.BinaryTree.service;

import com.gl.BinaryTree.beans.Node;
public class BTtoSkew {

		public static Node node, prevNode = null, headNode = null;

		// method to convert BST to Skewed Tree
		public void changeBTToSkew(Node root) {
			// check for null tree
			if (root == null) {
				return;
			}

			// use recursion
			changeBTToSkew(root.left);
			Node rightNode = root.right;

			if (headNode == null) {
				headNode = root;
			} else {
				prevNode.right = root;
			}
			root.left = null;
			prevNode = root;

			// do recursion with rightNode
			changeBTToSkew(rightNode);
		}

		// traverse the right skewed tree using recursion
		public void traverseTree(Node root) {
			if (root == null) {
				return;
			}

			System.out.print(root.data + " ");
			traverseTree(root.right);
		}

	}

