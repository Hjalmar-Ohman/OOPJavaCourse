package myutil;

public class MyQueue<E>{

	private Node<E> head, rear;
	private int size = 0;


	public MyQueue() {
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void enqueue(E data){
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

	//return first node in queue's data and update head to head.next
	public E dequeue() throws IsEmptyException{
		
		if(isEmpty()) {
			throw new IsEmptyException("Queue");
		}else {
			E tmp = head.getData();
			this.head = head.getNext();
			size -= 1;
			return tmp;
		}
	}
}