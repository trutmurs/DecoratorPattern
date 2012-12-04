package ch.zhaw.students;

public class AstonMartin extends Automobile {

	private final int COST_ASTONMARTIN = 89000;
	
	public AstonMartin() {
		description = "Aston Martin";
	}
	
	@Override
	public int cost() {
		return COST_ASTONMARTIN;
	}

}
