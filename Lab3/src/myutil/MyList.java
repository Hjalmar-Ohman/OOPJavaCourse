package myutil;


public class MyList<E> {

	private Node<E> head, rear;
	private int size = 0;


	public MyList() {

	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void add(E data) {
		Node<E> tmp = new Node<E>(data, null);		
		if(size==0){
			//set the first node as head
			head = tmp;
		}else {
			//update the previous tmp's (rear) next to point at the new tmp
			rear.setNext(tmp);
		}
		rear = tmp;
		size+=1;
	}

	public E getElementAt(int i) throws OutOfBoundsException{
		if(i>=size) {
			throw new OutOfBoundsException("ERROR: Element index too large.");
		}else {
			Node<E> tmp = new Node<E>(null, head);
			//iterate until index i
			for (int j = 0; j < i; j++) {
				//set the tmp.next node to the current tmp.next's next node (next element in the map)
				tmp.setNext(tmp.getNext().getNext());  
			}
			return tmp.getNext().getData();
		}
	}
	
	public void reverse(){
		Node<E> current = head;
		Node<E> prev = null;
		Node<E> next = null;

		while (current!=null) {
			next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
		}
	}
}
