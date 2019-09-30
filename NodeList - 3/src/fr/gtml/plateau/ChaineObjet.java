package fr.gtml.plateau;

public class ChaineObjet<T> {
	
	private class Node<R> {
		R data;
		Node<R> next=null;	
		public Node(R data) {
			this.data = data;
		}
	}
	private Node<T> first;

	public void add(T data) {
		Node<T> newNode = new Node<T>(data);
		if(first == null) {
			first = newNode;
			return;
		}
		Node<T> n = first;
		while(n.next != null){
			n = n.next;
		}
		n.next = newNode;
		//newNode.next=first;
	}
	
	public void link() {
		//Node<T> newNode = new Node<T>(data);
		if(first == null) {
			//first = newNode;
			return;
		}
		Node<T> n = first;
		while(n.next != null){
			n = n.next;
		}
		n.next = first;
	}
	
	public void roll(int step) {
		if(first == null) {
			//first = newNode;
			return;
		}
		Node<T> n = first;
		int i = 0;
		while(i<step) {
			System.out.println(n.data);
			n = n.next;
			i+=1;
		}
	}
	
}

