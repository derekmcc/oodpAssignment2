
public class FirstTeam extends TeamFactory {
	
	@Override
	public Team getGoalkeeper() {
		return new Team("David De Gea","images/firstTeam/degea","Spanish",1,28,"0");
	}

	@Override
	public Team getRightBack() {
		return new Team("Valencia","images/firstTeam/valencia","Ecuador",25,32,"25");
	}

	@Override
	public Team getRightCenterBack() {
		return new Team("Eric Bailly","images/firstTeam/bailly","Ivory Coast",3,24,"1");
	}

	@Override
	public Team getLeftCenterBack() {
		return new Team("Marcos Rojo","images/firstTeam/rojo","Argintinan",5,28,"2");
	}

	@Override
	public Team getLeftBack() {
		return new Team("Luke Shaw","images/firstTeam/shaw","English",23,23,"0");
	}

	@Override
	public Team getRightCenterMid() {
		return new Team("Paul Pogba","images/firstTeam/pogba","French",6,25,"12");
	}

	@Override
	public Team getCenterMid() {
		return new Team("Nemanja Matic","images/firstTeam/matic","Serbian",31,30,"1");
	}

	@Override
	public Team getLeftCenterMid() {
		return new Team("Ander Herrera","images/firstTeam/herrera","Spanish",21,29,"16");
	}

	@Override
	public Team getRightAttackMid() {
		return new Team("Anthony Martial","images/firstTeam/martial","French",11,23,"36");
	}

	@Override
	public Team getForward() {
		return new Team("Romelu Lukaku","images/firstTeam/lukaku","Belgian",9,25,"23");
	}

	@Override
	public Team getLeftAttackMid() {
		return new Team("Alexis Sanchez","images/firstTeam/alexis","Chilian",7,30,"1");
	}
}//end class
