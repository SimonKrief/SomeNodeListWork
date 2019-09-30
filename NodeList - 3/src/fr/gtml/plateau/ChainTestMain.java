package fr.gtml.plateau;

import fr.gtml.plateau.ChaineObjet;

public class ChainTestMain {
	public static void main(String[] args) {
		ChaineObjet<Integer> list = new ChaineObjet<>();		

		for(int i=1 ; i<=40 ; i++) {
			list.add(i);
		}

		list.link();
		list.roll(50);
	}

}
