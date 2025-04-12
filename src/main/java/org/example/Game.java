package org.example;

public class Game implements Nameable {
    private int id;
    private String title;
    private int playtime;

    public Game(int id, String title, int playtime) {
        this.id = id;
        this.title = title;
        this.playtime = playtime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPlaytime() {
        return playtime;
    }

    public void setPlaytime(int playtime) {
        this.playtime = playtime;
    }

    @Override
    public String getName() {
        return title;
    }
}
