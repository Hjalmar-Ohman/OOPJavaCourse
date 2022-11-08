package myutil;

public class NodeDict<K, V> {
	private K key;
	private V value;
	private NodeDict<K, V> next;


	public NodeDict(K key, V value, NodeDict<K, V> next) {
		this.key = key;
		this.value = value;
		this.setNext(next);
	}


	public NodeDict<K, V> getNext() {
		return next;
	}


	public void setNext(NodeDict<K, V> next) {
		this.next = next;
	}

	public K getKey() {
		return key;
	}


	public V getValue() {
		return value;
	}
	
}