package developexTask;

public class BinaryTreeTask {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Tree theTree = new Tree();
		theTree.insert(50);
		theTree.insert(25);
		theTree.insert(75);
		theTree.insert(45);
		theTree.insert(85);
		theTree.insert(105);
		theTree.insert(15);

		theTree.displayTree();

		/*
		 * HashMap<Integer, LinkedList<Node>> nodes = new HashMap<Integer,
		 * LinkedList<Node>>(); theTree.inOrder(theTree.getRoot(), 0, nodes);
		 * theTree.linkNodesAtSameLevel(nodes);
		 */
		theTree.linkSameLevel(theTree.getRoot());
		theTree.displayTree();

	}
}
