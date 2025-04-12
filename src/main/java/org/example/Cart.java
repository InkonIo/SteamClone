package org.example;

public class Cart {
    private final String removeitem;
    private int id;
    private int userid;
    private String  product;

    private void addItem(Product product) {
    }

    private void removeItem(Product product) {
    }

    private void clearCart() {
    }

    public Cart(String removeitem, int id, int userid, String product) {
        this.removeitem = removeitem;
        this.id = id;
        this.userid = userid;
        this.product = product;
    }

    public String getRemoveitem() {
        return removeitem;
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

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}