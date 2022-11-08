package myutil;

public class MyStack<E> {

	private Node<E> head;
	private int size = 0;

	public MyStack() {
		// TODO Auto-generated constructor stub
	}	

	public boolean isEmpty() {
		return this.size == 0; 
	}

	public int size() {
		return this.size;
	}

	//new tmp points to head (old tmp) and then update head to new tmp
	public void push(E data) {
		Node<E> tmp = new Node<E>(data, head);
		head = tmp;
		size += 1;
	}

	//return head's data and update head to head.next
	public E pop() throws IsEmptyException{
		if(isEmpty()) {
			throw new IsEmptyException("Stack");
		}else {
			E tmp = head.getData();
			head = head.getNext();
			size -= 1;
			return tmp;
		}
	}

}