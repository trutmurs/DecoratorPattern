package ch.zhaw.students;

public class BMWRoadstar extends Automobile {

	private final int COST_BMWROADSTAR = 79000;
	
	public BMWRoadstar(){
		description = "BMW Roadstar";
	}
	
	@Override
	public int cost() {
		return COST_BMWROADSTAR;
	}

}
