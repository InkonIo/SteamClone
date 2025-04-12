package org.example;

public class Sale {
    private int id;
    private UserAccount userid;
    private Product product;
    private float price;
    private  String status;

    public Sale(int id, UserAccount userid, Product product, float price, String status) {
        this.id = id;
        this.userid = userid;
        this.product = product;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserAccount getUserid() {
        return userid;
    }

    public void setUserid(UserAccount userid) {
        this.userid = userid;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}