package org.example;

public class Decoration {
    private int id;
    private String name;
    private String image;
    private double isCustom;
    private int creatorid;

    public Decoration(int id, String name, String image, double isCustom, int creatorid) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.isCustom = isCustom;
        this.creatorid = creatorid;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getCustom() {
        return isCustom;
    }

    public void setCustom(double custom) {
        isCustom = custom;
    }

    public int getCreatorid() {
        return creatorid;
    }

    public void setCreatorid(int creatorid) {
        this.creatorid = creatorid;
    }
}