package myutil;

public class MyMap <K,V>{

	private NodeDict<K,V> head, rear;
	private int size = 0;

	public MyMap() {
	}

	public void put(K key, V value) {
		//create tmp node
		NodeDict<K, V> tmp = new NodeDict<K, V>(key, value, null);		
		if(size==0){
			//set the first node as head
			head = tmp;
		}else {
			//update the previous tmp's (rear) next to point at the new tmp
			rear.setNext(tmp);
		}
		//set rear to the latest node (aka "new tmp")
		rear = tmp;
		size+=1;
	}

	public V get(K key) {
		//create new node used to point at elements in the map
		NodeDict<K, V> tmp = new NodeDict<K, V>(null, null, head);

		//search for when tmp is pointing at the right key
		while (tmp.getNext().getKey() != key){
			//set the tmp.next node to the current tmp.next's next node (next element in the map)
			tmp.setNext(tmp.getNext().getNext()); 
		}

		if (tmp.getNext().getValue() != null) {
			return tmp.getNext().getValue();
		} else {
			return null;
		}

	}



	public boolean isEmpty() {
		return this.size == 0; 
	}

	public int size() {
		return this.size;
	}
}

