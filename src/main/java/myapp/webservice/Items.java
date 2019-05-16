package myapp.webservice;

public class Items {
	
	private int id;
	private String name;
	private String description;
	private int mightBonus;
	private int sanityBonus;
	
	Items(){
	}
	
	Items(int id, String name, String description, int mightBonus, int sanityBonus){
		this.id = id;
		this.name = name;
		this.description = description;
		this.mightBonus = mightBonus;
		this.sanityBonus = sanityBonus;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMightBonus() {
		return mightBonus;
	}

	public void setMightBonus(int mightBonus) {
		this.mightBonus = mightBonus;
	}

	public int getSanityBonus() {
		return sanityBonus;
	}

	public void setSanityBonus(int sanityBonus) {
		this.sanityBonus = sanityBonus;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
