package myapp.webservice;

public class ArrayGameResources implements ArrayGameResourcesInterface{
	public Monsters[] getRandomMonsterArray(){
		//Gets a Random array of 7 monsters
		Monsters monsterArray[] = new Monsters[7];
		ResourcesDaoImplementation rdi = new ResourcesDaoImplementation();
		monsterArray = rdi.getRandomMonsterArray();
		return monsterArray;
	}

	public Items[] getRandomItemArray(){
		//Gets a Random array of 11 items
		Items ItemsArray[] = new Items[10];
		ResourcesDaoImplementation rdi = new ResourcesDaoImplementation();
		ItemsArray = rdi.getRandomItemArray();
		return ItemsArray;
	}

	public Events[] getRandomEventArray(){
		//Gets a Random array of 7 events
		Events[] eventsArray = new Events[7];
		ResourcesDaoImplementation rdi = new ResourcesDaoImplementation();
		eventsArray = rdi.getRandomEventArray();
		return eventsArray;
	}
	
	public Rooms[] getRandomRoomArray(){
		//Gets a Random array of 24 rooms
		Rooms[] roomsArray = new Rooms[24];
		ResourcesDaoImplementation rdi = new ResourcesDaoImplementation();
		roomsArray = rdi.getRandomRoomArray();
		return roomsArray;
	}
	
	
}
