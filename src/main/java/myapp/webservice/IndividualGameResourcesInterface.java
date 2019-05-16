package myapp.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface IndividualGameResourcesInterface {
	@WebMethod
	String helloWorldFun(@WebParam(name = "name") String name);
	@WebMethod
	public Monsters getMonstersById(@WebParam(name = "id") int id);
	@WebMethod
	public Items getItemsById(@WebParam(name = "id") int id);
	@WebMethod
	public Events getEventsById(@WebParam(name = "id") int id);
	@WebMethod
	public Rooms getRoomsById(@WebParam(name = "id") int id);
}