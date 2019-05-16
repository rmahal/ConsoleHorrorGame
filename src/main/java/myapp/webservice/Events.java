package myapp.webservice;

public class Events {

	private int id;
	private String name;
	private String description;
	private int sanityRoll;
	
	Events(){

	}
	
	Events(int id, String name, String description, int sanityRoll){
		this.id = id;
		this.name = name;
		this.description = description;
		this.sanityRoll = sanityRoll;
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

	public int getSanityRoll() {
		return sanityRoll;
	}

	public void setSanityRoll(int sanityRoll) {
		this.sanityRoll = sanityRoll;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
