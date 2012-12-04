package ch.zhaw.students;

public class MissileLauncher extends OptionDecorator {

	private final int COST_MISSILE_LAUNCHER = 88000;
	
	public MissileLauncher(Automobile automobile){
		super(automobile);
	}
	
	@Override
	public String getDescription() {
		return automobile.getDescription() + ", missile launcher";
	}

	@Override
	public int cost() {
		return COST_MISSILE_LAUNCHER + automobile.cost();
	}

}
