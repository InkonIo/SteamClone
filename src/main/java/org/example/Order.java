package org.example;

public class Order {
    private int id;
    private int userid;
    private String cart;
    private String orderDate;
    private String status;
    private float totalAmout;

    private void placeOrder(){}
    private void cancelOrder(){}
    private void confirmDelivery(){}

    public Order(int id, int userid, String cart, String orderDate, String status, float totalAmout) {
        this.id = id;
        this.userid = userid;
        this.cart = cart;
        this.orderDate = orderDate;
        this.status = status;
        this.totalAmout = totalAmout;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getCart() {
        return cart;
    }

    public void setCart(String cart) {
        this.cart = cart;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getTotalAmout() {
        return totalAmout;
    }

    public void setTotalAmout(float totalAmout) {
        this.totalAmout = totalAmout;
    }
}
