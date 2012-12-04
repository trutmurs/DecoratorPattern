package ch.zhaw.students;

public class Leather extends OptionDecorator {

	private final int COST_LEATHER = 3700;
	
	public Leather(Automobile automobile){
		super(automobile);
	}
	
	@Override
	public String getDescription() {
		return automobile.getDescription() + ", Leather";
	}

	@Override
	public int cost() {
		return COST_LEATHER + automobile.cost();
	}

}
