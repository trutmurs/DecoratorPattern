package ch.zhaw.students;

public class SideAirbags extends OptionDecorator {

	private final int COST_SIDEAIRBAGS = 4100;
	
	public SideAirbags(Automobile automobile){
		super(automobile);
	}
	
	@Override
	public String getDescription() {
		return automobile.getDescription() + ", side airbags";
	}

	@Override
	public int cost() {
		return COST_SIDEAIRBAGS + automobile.cost();
	}
}
