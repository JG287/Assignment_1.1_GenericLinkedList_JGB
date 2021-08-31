/**A class that is a linear data structure. It starts first at the head node, and keeps moving down
 * until the tail is reached. Unlike arrays, Linked lists are sequential. 
 * 
 * @author Jose Garcia Balboa
 *
 * @param <T>
 */
public class LinkedList<T> {

	T head;
	int length;
	T tail;
	T nextNode;

	public LinkedList() {
		head = null;
		length = 0;
		tail = head;
	}

	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else
			return false;
	}

	public T getList() {
		return head;
	}

	public void addNode(T aNode) {
		if (isEmpty()) {
			head = aNode;
			tail = head;
			return;
		}
	}
     
	public static void main(String[] args) {

		LinkedList<String> myList = new LinkedList<String>();

		Node<Integer> aNode = new Node<Integer>();
		
		aNode.setData(1);
		myList.addNode("Steven");

		String tempnode = myList.getList();
		int node = aNode.getNode();
		
			System.out.println(tempnode);
			System.out.println(node);
	}
}