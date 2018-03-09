
public class Team {
	
	private String name, image, nationality, goals; 
	private int number, age;
	
	public Team(String name, String image, String nationality, int number, int age, String goals) {
		super();
		this.name = name;
		this.image = image;
		this.nationality = nationality;
		this.number = number;
		this.age = age;
		this.goals = goals;
	}//end constructor

	public String getName() {
		return name;
	}//end getName

	public void setName(String name) {
		this.name = name;
	}//end setImage

	public String getImage() {
		return image;
	}//end getImage

	public void setImage(String image) {
		this.image = image;
	}//end setImage

	public String getNationality() {
		return nationality;
	}//end getNationality

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}//end serNationality

	public int getNumber() {
		return number;
	}//end getNumber

	public void setNumber(int number) {
		this.number = number;
	}//end setNumber

	public int getAge() {
		return age;
	}//end getAge

	public void setAge(int age) {
		this.age = age;
	}//end setAge

	public String getGoals() {
		return goals;
	}//end getGoals

	public void setGoals(String goals) {
		this.goals = goals;
	}//end setGoals
}//end class
