package myapp.webservice;

public class Monsters {
	
	private int id;
	private int hp;
	private String name;
	private String description;
	private int mightRoll;
	
	Monsters(){

	}
	
	Monsters(int id, String name, String description,int hp, int mightRoll){
		this.id = id;
		this.name = name;
		this.description = description;
		this.hp = hp;
		this.mightRoll = mightRoll;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMightRoll() {
		return mightRoll;
	}

	public void setMightRoll(int mightRoll) {
		this.mightRoll = mightRoll;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
