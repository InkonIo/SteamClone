package org.example;

public class Skin {
    private int id;
    private String name;
    private int gameid;
    private String rarity;

    public Skin(int id, String name, int gameid, String rarity) {
        this.id = id;
        this.name = name;
        this.gameid = gameid;
        this.rarity = rarity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGameid() {
        return gameid;
    }

    public void setGameid(int gameid) {
        this.gameid = gameid;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }
}