package entities;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Player implements Serializable {
	private String name;
	private int hp;
	private int mightStat;
	private int sanityStat;
	
	public Player(String name, int hp, int mightStat, int sanityStat) {
		this.name = name;
		this.hp = hp;
		this.mightStat = mightStat;
		this.sanityStat = sanityStat;
	}
}
