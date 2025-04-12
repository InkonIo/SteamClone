package org.example;


public class Review {
    private int id;
    private int productid;
    private int rating;
    private String comment;

    private  void submitReview(){
    }

    public Review(int id, int productid, int rating, String comment) {
        this.id = id;
        this.productid = productid;
        this.rating = rating;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}