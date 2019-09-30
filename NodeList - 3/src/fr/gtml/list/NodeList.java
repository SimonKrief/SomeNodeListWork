package fr.gtml.list;

public class NodeList<T> {
	
	private class Node<R> {
		R data;
		Node<R> next=null;	
		public Node(R data) {
			this.data = data;
		}
	}
	private Node<T> first;
	
	public int pop() {
		return 0;
	}
	
	public void clear() {
		// on fait confiance au GC
		first = null;
	}
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
	
	public void roll() {
		if(first == null) {
			//first = newNode;
			return;
		}
		Node<T> n = first;
		while(true) {
			System.out.println(n.data);
			n = n.next;
		}
	}
	
	
	public void show() {
		if(first == null) {
			System.out.println("List vide");
			return;
		}
		for(Node<T> n = first ; n != null ; n = n.next) {
			System.out.print(n.data+" ");
		}
		
//		Node n1 = first;
//		while(n1!=null) {
//			System.out.print(n1.data+" ");
//			n1 = n1.next;
//		}
		System.out.println();		
	}
	
	public int count() {
		int count = 0;
		for(Node<T> n = first ; n != null ; n = n.next) {
			count++;
		}
		return count;
	}
	
	public void delete(T data) {
		if(first==null)
			return;
		if(first.data.equals(data)) {
			first = first.next;
		}
		Node<T> n = first;
		while(n.next != null){
			if(n.next.data.equals(data)) {
				n.next = n.next.next;
				return;
			}
			n = n.next;
		}	
	}
	
	public void insert(T data, int position) {
		Node<T> newNode = new Node<T>(data);
		// ajouter avant le noead n°0 (premier noeud)
		if(position == 0) {
			newNode.next = first;
			first = newNode;
			return;
		}
		// ajouter en dernier
		if(position > count()-1) {
			add(data);
			return;
		}
		// autre position
		Node<T> n = first;
		for(int i=0 ; i<position-1 ; i++) {
			n = n.next;
		}
		newNode.next = n.next;
		n.next = newNode;
	}
	
}
