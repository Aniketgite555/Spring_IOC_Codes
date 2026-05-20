package com;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Example {

	private int id;
	private List<String> movies;
	private Set<String> electronics;
	private Map<String, String> numbers;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<String> getMovies() {
		return movies;
	}

	public void setMovies(List<String> movies) {
		this.movies = movies;
	}

	public Set<String> getElectronics() {
		return electronics;
	}

	public void setElectronics(Set<String> electronics) {
		this.electronics = electronics;
	}

	public Map<String, String> getNumbers() {
		return numbers;
	}

	public void setNumbers(Map<String, String> numbers) {
		this.numbers = numbers;
	}

	@Override
	public String toString() {
		return "Example [id=" + id + ", movies=" + movies + ", electronics=" + electronics + ", numbers=" + numbers
				+ "]";
	}

}
