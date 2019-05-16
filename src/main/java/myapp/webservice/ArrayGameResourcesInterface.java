package myapp.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ArrayGameResourcesInterface {
	@WebMethod
	public Monsters[] getRandomMonsterArray();
	@WebMethod
	public Items[] getRandomItemArray();
	@WebMethod
	public Events[] getRandomEventArray();
	@WebMethod
	public Rooms[] getRandomRoomArray();
}
