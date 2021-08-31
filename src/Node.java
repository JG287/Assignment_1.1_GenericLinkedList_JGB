/**A class that is used to define a Node. Node's are used within the a Linked list in order 
 * to store information sequentially.
 * 
 * @author Jose Garcia Balboa
 *
 * @param <T>
 */
class Node<T> {
	
	T data;
	T nextNode;

	public Node() {
		nextNode = null;
		int data = 0;
	}

	public void setData(T data) {
		this.data = data;
	}

	public T getNode() {
		return data;
	}

	public void setNextNode(T nextNode) {
		this.nextNode = nextNode;
	}

}