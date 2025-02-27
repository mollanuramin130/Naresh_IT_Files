package com.ssnmarket.static_factory_method.feb_21_2025.program2;

public class Movie {
	private String title;
	private int releaseYear;
	private String genre;

	public Movie(String title, int releaseYear, String genre) {
		this.title = title;
		this.releaseYear = releaseYear;
		this.genre = genre;
	}

	public void setTitle(String title) {
		this.title=title;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	
}
