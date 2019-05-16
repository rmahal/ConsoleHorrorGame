package myapp.webservice;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResourcesDaoImplementation implements ResourcesDao{

	@Override
	public String helloWorldFun(String name) {
		return null;
	}

	@Override
	public Monsters getMonstersById(int id) {
		String sql="SELECT * FROM public.monsters WHERE id="+id;	
		try (
				Connection connection = new ConnectionFactory().getConnection();
				Statement statement = connection.createStatement();
				) { 
			ResultSet resSet = statement.executeQuery(sql);

			resSet.next();
			System.out.println(resSet);
			Monsters monster = new Monsters(resSet.getInt("id"), resSet.getString("name"), resSet.getString("description"), resSet.getInt("hp"), resSet.getInt("strength"));
			connection.close();
			return monster;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			return null;
		}
	}

	@Override
	public Items getItemsById(int id) {
		String sql="SELECT * FROM public.items WHERE id="+id;	
		try (
				Connection connection = new ConnectionFactory().getConnection();
				Statement statement = connection.createStatement();
				) { 
			ResultSet resSet = statement.executeQuery(sql);

			resSet.next();
			System.out.println(resSet);
			Items item = new Items(resSet.getInt("id"), resSet.getString("name"), resSet.getString("description"), resSet.getInt("mightBonus"), resSet.getInt("sanityBonus"));
			connection.close();
			return item;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			return null;
		}
	}

	@Override
	public Events getEventsById(int id) {
		String sql="SELECT * FROM public.events WHERE id="+id;	
		try (
				Connection connection = new ConnectionFactory().getConnection();
				Statement statement = connection.createStatement();
				) { 
			ResultSet resSet = statement.executeQuery(sql);

			resSet.next();
			System.out.println(resSet);
			Events event = new Events(resSet.getInt("id"), resSet.getString("name"), resSet.getString("description"), resSet.getInt("sanityRoll"));
			connection.close();
			return event;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			return null;
		}
	}
	
	@Override
	public Rooms getRoomsById(int id) {
		String sql="SELECT * FROM public.rooms WHERE id="+id;	
		try (
				Connection connection = new ConnectionFactory().getConnection();
				Statement statement = connection.createStatement();
				) { 
			ResultSet resSet = statement.executeQuery(sql);

			resSet.next();
			System.out.println(resSet);
			Rooms room = new Rooms(resSet.getInt("id"), resSet.getString("name"), resSet.getString("description"));
			connection.close();
			return room;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			return null;
		}
	}
	
	@Override
	public Monsters[] getRandomMonsterArray() {
		String sql="SELECT * FROM public.monsters ORDER BY Random() LIMIT 7;";	
		try (
				Connection connection = new ConnectionFactory().getConnection();
				Statement statement = connection.createStatement();
				) { 
			ResultSet resSet = statement.executeQuery(sql);
			Monsters[] monsters = new Monsters[7];
			int i=0;
			System.out.println(resSet);
			while(resSet.next()){
			Monsters monster = new Monsters(resSet.getInt("id"), resSet.getString("name"), resSet.getString("description"), resSet.getInt("hp"),  resSet.getInt("strength"));
			monsters[i] = monster;
				i++;
			}
			connection.close();
			return monsters;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			return null;
		}
	}

	@Override
	public Items[] getRandomItemArray() {
		String sql="SELECT * FROM public.items ORDER BY Random() LIMIT 10;";	
		try (
				Connection connection = new ConnectionFactory().getConnection();
				Statement statement = connection.createStatement();
				) { 
			ResultSet resSet = statement.executeQuery(sql);
			Items[] items = new Items[10];
			int i=0;
			System.out.println(resSet);
			while(resSet.next()){
			Items item = new Items(resSet.getInt("id"), resSet.getString("name"), resSet.getString("description"), resSet.getInt("mightBonus"),  resSet.getInt("sanityBonus"));
			items[i] = item;
				i++;
			}
			connection.close();
			return items;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			return null;
		}
	}

	@Override
	public Events[] getRandomEventArray() {
		String sql="SELECT * FROM public.events ORDER BY Random() LIMIT 7;";	
		try (
				Connection connection = new ConnectionFactory().getConnection();
				Statement statement = connection.createStatement();
				) { 
			ResultSet resSet = statement.executeQuery(sql);
			Events[] events = new Events[7];
			int i=0;
			System.out.println(resSet);
			while(resSet.next()){
			Events event = new Events(resSet.getInt("id"), resSet.getString("name"), resSet.getString("description"), resSet.getInt("sanityRoll"));
			events[i] = event;
				i++;
			}
			connection.close();
			return events;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			return null;
		}
	}
	
	@Override
	public Rooms[] getRandomRoomArray() {
		String sql="SELECT * FROM public.rooms ORDER BY Random() LIMIT 24;";	
		try (
				Connection connection = new ConnectionFactory().getConnection();
				Statement statement = connection.createStatement();
				) { 
			ResultSet resSet = statement.executeQuery(sql);
			Rooms[] rooms = new Rooms[24];
			int i=0;
			System.out.println(resSet);
			while(resSet.next()){
			Rooms room = new Rooms(resSet.getInt("id"), resSet.getString("name"), resSet.getString("description"));
			rooms[i] = room;
				i++;
			}
			connection.close();
			return rooms;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			return null;
		}
	}
	
	

}
