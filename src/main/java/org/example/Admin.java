package org.example;

import Database.DatabaseManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Scanner;

class Admin extends UserAccount {

    public Admin(int id, String email, String password,
                 LocalDateTime lastActive, String fullName, String address,
                 String tradeLink, String profileLink,
                 String paymentCard, String displayedGames,
                 int totalPlaytime, String decoration) {
        super(id, email, password, lastActive, fullName, address, tradeLink, profileLink,
                paymentCard, displayedGames, totalPlaytime, decoration);
    }

    public void displayRole() {
        System.out.println("I am an admin.");
    }

    public static boolean isAdmin(String loginEmail, String loginPassword) {
        // Проверка на администратора
        return loginEmail.equals("And") && loginPassword.equals("1");
    }

    // Метод для управления пользователями
    public void manageUsers(Scanner scanner) {
        while (true) {
            System.out.println("\nПривет, админ! Выберите действие:");
            System.out.println("1 - Показать всех пользователей");
            System.out.println("2 - Удалить пользователя");
            System.out.println("3 - Изменить пароль пользователя");
            System.out.println("0 - Выход");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Чистим буфер

            switch (choice) {
                case 1:
                    showUsers();
                    break;
                case 2:
                    System.out.print("Введите email пользователя для удаления: ");
                    String emailToDelete = scanner.nextLine();
                    removeUser(emailToDelete);
                    break;
                case 3:
                    System.out.print("Введите email пользователя для изменения пароля: ");
                    String emailToChange = scanner.nextLine();
                    System.out.print("Введите новый пароль: ");
                    String newPassword = scanner.nextLine();
                    updatePassword(emailToChange, newPassword);
                    break;
                case 0:
                    System.out.println("Выход из админ панели.");
                    return;
                default:
                    System.out.println("❌ Неверный выбор. Попробуйте еще раз.");
            }
        }
    }

    // Показать всех пользователей
    public void showUsers() {
        String sql = "SELECT * FROM users";
        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            int count = 1;
            while (rs.next()) {
                String email = rs.getString("email");
                String password = rs.getString("password");
                System.out.println(count + ". " + email + " (" + password + ")");
                count++;
            }
        } catch (SQLException e) {
            System.out.println("Ошибка при выводе пользователей: " + e.getMessage());
        }
    }

    // Удаление пользователя
    public void removeUser(String email) {
        String sql = "DELETE FROM users WHERE email = ?";
        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, email);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("✅ Пользователь удален.");
            } else {
                System.out.println("❌ Пользователь с таким email не найден.");
            }
        } catch (SQLException e) {
            System.out.println("Ошибка при удалении пользователя: " + e.getMessage());
        }
    }

    // Изменение пароля пользователя
    public void updatePassword(String email, String newPassword) {
        String sql = "UPDATE users SET password = ? WHERE email = ?";
        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, newPassword);
            pstmt.setString(2, email);
            pstmt.executeUpdate();
            System.out.println("✅ Пароль изменен.");
        } catch (SQLException e) {
            System.out.println("Ошибка при изменении пароля: " + e.getMessage());
        }
    }
}