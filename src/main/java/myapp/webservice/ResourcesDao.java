package myapp.webservice;

public interface ResourcesDao {
	String helloWorldFun(String name);
	public Monsters getMonstersById(int id);	
	public Items getItemsById(int id);
	public Events getEventsById(int id);
	public Rooms getRoomsById(int id);
	public Monsters[] getRandomMonsterArray();
	public Items[] getRandomItemArray();
	public Events[] getRandomEventArray();
	public Rooms[] getRandomRoomArray();
}
