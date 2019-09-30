package fr.gtm.main;

import fr.gtml.list.NodeList;

public class NodeListMain {

	public static void main(String[] args) {
		NodeList<Integer> list = new NodeList<>();
//		NodeList<Point> points = new NodeList<Point>();
//		
//		points.add(new Point(1,1));
//		points.add(new Point(2,2));
//		points.show();
		
		list.show();
		System.out.println("Nombre d'éléments dans la liste : "+list.count());
		
		for(int i=1 ; i<9 ; i++) {
			list.add(i);
		}
		list.show();
		list.link();
		list.roll();
				
		
		
		//System.out.println("Nombre d'éléments dans la liste : "+list.count());
		
//		System.out.println("Nombre d'éléments dans la liste : "+list.count());
//		
//		list.delete(5);
//		list.show();
//		System.out.println("Nombre d'éléments dans la liste : "+list.count());
//		list.insert(10, 7);
//		list.show();
//		list.insert(100, 100);
//		list.show();
//		list.insert(20, 2);		
//		list.show();
	}

}
