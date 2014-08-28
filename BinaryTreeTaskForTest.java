package developexTask;

import java.util.HashMap;
import java.util.LinkedList;

public class BinaryTreeTaskForTest {
	
	public void linkSameLevel(Node node) {
		HashMap<Integer, LinkedList<Node>> nodes = new HashMap<Integer, LinkedList<Node>>();
		inOrder(node, 0, nodes);
		linkNodesAtSameLevel(nodes);
	}
	
	// Symmetric Order Traversal
	private void inOrder(Node localRoot, int level, HashMap<Integer, LinkedList<Node>> hashMap) {
		if (localRoot != null) {
			inOrder(localRoot.leftChild, ++level, hashMap);
			if (hashMap.get(level) == null) {
				hashMap.put(level, new LinkedList<Node>());
			}
			hashMap.get(level).add(localRoot);
			--level;
			inOrder(localRoot.rightChild, ++level, hashMap);
		}
	}
	
	private void linkNodesAtSameLevel(HashMap<Integer, LinkedList<Node>> hashMap) {
		for(Integer key : hashMap.keySet()) {

			Node prevNode = null;
			for (Node node : hashMap.get(key)) {
				if (prevNode != null) {
					prevNode.levelPointer = node;
				}
				prevNode = node;
			}
		}
	}
	
	private class Node {
		Node leftChild;
		Node rightChild;
		Node levelPointer;
	}

}
