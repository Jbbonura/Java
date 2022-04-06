package com.jamesbonura.abstractart;

public class Museum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Painting painting1 = new Painting("First", "ME", "My First Painting", "Oil");
		Painting painting2 = new Painting("Second", "YOU", "My Second Painting", "Oil");
		Painting painting3 = new Painting("Last", "HER", "My Third Painting", "Oil");
		Sculpture sculpture1 = new Sculpture("First Sculpture", "ME", "My First Sculpture", "Stone");
		Sculpture sculpture2 = new Sculpture("Second Sculpture", "YOU", "My Second Sculpture", "Stone");
		
		System.out.println("----------FIRST PAINTING TEST----------");
		painting1.viewArt();
		System.out.println("----------SECOND PAINTING TEST----------");
		painting2.viewArt();
		System.out.println("----------THIRD PAINTING TEST----------");
		painting3.viewArt();
		System.out.println("----------FIRST SCULPTURE TEST----------");
		sculpture1.viewArt();
		System.out.println("----------SECOND SCULPTURE TEST----------");
		sculpture2.viewArt();
	}

}
