
public class JuniorTeam extends TeamFactory {

	@Override
	public Team getGoalkeeper() {
		return new Team("Alex Fojticek","images/juniorTeam/fojticek","Slovakian",1,18,"0");
	}

	@Override
	public Team getRightBack() {
		return new Team("Brandon Williams","images/juniorTeam/williams","English",2,18,"1");
	}

	@Override
	public Team getRightCenterBack() {
		return new Team("Di'Shon Bernard","images/juniorTeam/bernard","English",3,18,"2");
	}

	@Override
	public Team getLeftCenterBack() {
		return new Team("Ethan Laird","images/juniorTeam/laird","English",4,17,"5");
	}

	@Override
	public Team getLeftBack() {
		return new Team("Lee O'Connor","images/juniorTeam/oConnor","English",5,18,"2");
	}

	@Override
	public Team getRightCenterMid() {
		return new Team("Aliou Traore","images/juniorTeam/traore","French",6,17,"7");
	}

	@Override
	public Team getCenterMid() {
		return new Team("Arnau Puigmal","images/juniorTeam/puigmal","Spanish",7,17,"16");
	}

	@Override
	public Team getLeftCenterMid() {
		return new Team("Dion Mcghee","images/juniorTeam/mcghee","English",8,18,"8");
	}

	@Override
	public Team getRightAttackMid() {
		return new Team("Aidan Barlow","images/juniorTeam/barlow","English",9,18,"33");
	}

	@Override
	public Team getForward() {
		return new Team("Angel Gomes","images/juniorTeam/gomes","English",10,18,"44");
	}

	@Override
	public Team getLeftAttackMid() {
		return new Team("D'mani Mellor","images/juniorTeam/mellor","English",11,18,"55");
	}
}//end class
