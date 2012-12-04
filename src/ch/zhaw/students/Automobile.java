package ch.zhaw.students;

public abstract class Automobile {
	String description = "Unknown Automobile";
	
	public String getDescription(){
		return description;
	}
	
	public abstract int cost();

}
