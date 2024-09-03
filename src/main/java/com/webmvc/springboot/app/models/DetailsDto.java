package com.webmvc.springboot.app.models;

public class DetailsDto {
	private int id;
	private String name;
	
	public DetailsDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DetailsDto(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "detailsDto [id=" + id + ", name=" + name + "]";
	}
	
}
