package myapp.webservice;


public class IndividualGameResources implements IndividualGameResourcesInterface {
	@Override
	public String helloWorldFun(String name) {
		String cat = "Hello" + name;
		return cat;
	}

	public Monsters getMonstersById(int id){
		// Gets 1 Room by ID
		ResourcesDaoImplementation rdi = new ResourcesDaoImplementation();
		Monsters monster = rdi.getMonstersById(id);
		System.out.println(monster.getId());
		System.out.println(monster.getName());
		System.out.println(monster);
		return monster;
	}
	
	public Items getItemsById(int id){
		// Gets 1 Item by ID
		ResourcesDaoImplementation rdi = new ResourcesDaoImplementation();
		Items item = rdi.getItemsById(id);
		System.out.println(item.getId());
		System.out.println(item.getName());
		System.out.println(item);
		return item;
	}
	
	public Events getEventsById(int id){
		// Gets 1 Event by ID
		ResourcesDaoImplementation rdi = new ResourcesDaoImplementation();
		Events event = rdi.getEventsById(id);
		System.out.println(event.getId());
		System.out.println(event.getName());
		System.out.println(event);
		return event;
	}
	
	public Rooms getRoomsById(int id){
		// Gets 1 Room by ID
		ResourcesDaoImplementation rdi = new ResourcesDaoImplementation();
		Rooms room = rdi.getRoomsById(id);
		System.out.println(room.getId());
		System.out.println(room.getName());
		System.out.println(room);
		return room;
	}
	
}
