package ch.zhaw.students;

public class BulletProofWindows extends OptionDecorator{
	
	private final int COST_BULLETPROOFWINDOWS = 28000;
	
	public BulletProofWindows(Automobile automobile){
		super(automobile);
	}
	
	public String getDescription(){
		return automobile.getDescription() + ", bulletproof windows";
	}
	
	public int cost(){
		return COST_BULLETPROOFWINDOWS + automobile.cost();
	}
}
