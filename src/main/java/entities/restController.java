package entities;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/player")
public class restController {
	
//	@GET
//	@Path("/{name}")
//	public void getPlayer(@PathParam("name")String name){
//		
//	}
	
	@POST
	@Path("/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public Player postPlayer(Player player){
		return player;
	}
}
