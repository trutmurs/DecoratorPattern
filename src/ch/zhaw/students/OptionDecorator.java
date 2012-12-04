package ch.zhaw.students;

public abstract class OptionDecorator extends Automobile {

	Automobile automobile;
	
	OptionDecorator(Automobile automobile){
		this.automobile = automobile;
	}
	
	@Override
	public abstract String getDescription();

}
