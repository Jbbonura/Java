package com.jamesbonura.abstractart;

public class Painting extends Art {
	private String paintType;

	public Painting(String title, String author, String description, String paintType) {
		this.title = title;
		this.author = author;
		this.description = description;
		this.paintType = paintType;
	}

	public String getPaintType() {
		return paintType;
	}

	public void setPaintType(String paintType) {
		this.paintType = paintType;
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
		System.out.println(paintType);
	}
	
	
}
