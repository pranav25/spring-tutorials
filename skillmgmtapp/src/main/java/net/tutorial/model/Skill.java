package net.tutorial.model;

public class Skill {

	int id;
	String name;
	String complexity;
	
	public Skill(int id, String name, String complexity) {
		this.id = id;
		this.name = name;
		this.complexity = complexity;
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
	public String getComplexity() {
		return complexity;
	}
	public void setComplexity(String complexity) {
		this.complexity = complexity;
	}
	
}
