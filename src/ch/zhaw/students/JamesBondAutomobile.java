package ch.zhaw.students;

public class JamesBondAutomobile {

	public static void main(String[] args) {
		Automobile automobile1 = new BMWRoadstar();
		automobile1 = new MissileLauncher(automobile1);
		System.out.println(automobile1.getDescription() +  " CHF" + automobile1.cost());
		
		Automobile automobile2 = new AstonMartin();
		automobile2 = new MissileLauncher(new BulletProofWindows(automobile2));
		System.out.println(automobile2.getDescription() + " CHF" + automobile2.cost());
	}
}
