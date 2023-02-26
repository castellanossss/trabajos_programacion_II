package model;

public class Person {
	
	private String name;
	private Direction direction;
	private String rut;
	
	public Person(String name, Direction direction, String rut) {
		super();
		this.name = name;
		this.direction = direction;
		this.rut = rut;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Direction getDirection() {
		return direction;
	}
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
}
