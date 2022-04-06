package com.jamesbonura.abstractart;

public class Sculpture extends Art {
	private String material;
	
	public Sculpture(String title, String author, String description, String material) {
		this.title = title;
		this.author = author;
		this.description = description;
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public void viewArt() {
		// TODO Auto-generated method stub
		System.out.println(title);
		System.out.println(author);
		System.out.println(description);
		System.out.println(material);
	}
}
