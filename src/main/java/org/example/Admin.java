package org.example;

import java.time.LocalDateTime;

public class Admin extends UserAccount {

    public Admin(int id, String email, String password,
                 LocalDateTime lastActive, String fullName, String address,
                 String tradeLink, String profileLink,
                 String paymentCard, String displayedGames,
                 int totalPlaytime, String decoration) {
        super(id, email, password, lastActive, fullName, address, tradeLink, profileLink,
                paymentCard, displayedGames, totalPlaytime, decoration);
    }

    public static boolean isAdmin(String email, String password) {
        return email.equals("And") && password.equals("1");
    }

    public void displayRole() {
        System.out.println("I am an admin.");
    }

    @Override
    public void showRole() {
        System.out.println("I am an admin.");
    }

    public void banUser(UserAccount user) {
        System.out.println("User " + user.getFullName() + " has been banned by admin " + this.getFullName());
    }
}
