package cs.up.catan.catangamestate;

import java.util.ArrayList;
import java.util.HashMap;

public class Player extends GameState {

	//instance variables

	private int localScore; // score of player that accounts for the players dev cards, must greater or eqaul to global score
	private HashMap<Integer, Integer> resources;
	private ArrayList<DevelopmentCards> developmentCards;

	public Player(int localScore, HashMap<Integer, Integer> resources, ArrayList<DevelopmentCards> developmentCards) {
		this.localScore = localScore;
		this.resources = resources;
		this.developmentCards = developmentCards;
	}

	@Override
	public String toString() {
		return "Player{" +
				"localScore=" + localScore +
				", resources=" + resources +
				", developmentCards=" + developmentCards +
				'}';
	}
}
