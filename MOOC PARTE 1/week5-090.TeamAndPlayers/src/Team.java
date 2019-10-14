
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Runnergo
 */
public class Team {

    private ArrayList<Player> players;
    private String name;
    private int maxSize;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
        this.maxSize = 16;
    }

    public String getName() {
        return name;

    }

    public void addPlayer(Player player) {
        if (players.size() < maxSize) {
            players.add(player);

        }

    }

    public void printPlayers() {
        for (Player playerList : players) {
            System.out.println(playerList);
        }

    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return players.size();
    }

    public int goals() {
        int tanteo = 0;
        for (Player player : players) {
            tanteo += player.goals();
        }
        return tanteo;
    }

}
