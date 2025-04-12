package org.example;

import Database.DatabaseManager;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DatabaseManager.initializeDatabase();

        System.out.println("Хало!!!");
        System.out.println("Для выхода введите 0");

        while (true) {
            System.out.print("Выбери 1 - регистр, 2 - это вход, 0 - завершить: ");
            int choice = -1;

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("❌ Введи норм!! а не то по шапке");
                continue;
            }

            if (choice == 0) {
                System.out.println("Выход из системы.");
                break;
            }

            if (choice == 1) {
                System.out.print("Введи email: ");
                String email = scanner.nextLine();
                System.out.print("Введи пароль: ");
                String password = scanner.nextLine();

                boolean success = UserAccount.register(email, password);
                if (success) {
                    System.out.println("✅ Регистрация успешна!");
                } else {
                    System.out.println("❌Такой email уже существует");
                }
            }

            if (choice == 2) {
                System.out.println("\nТеперь войдите в систему");
                System.out.print("Логин: ");
                String loginEmail = scanner.nextLine();
                System.out.print("Пароль: ");
                String loginPassword = scanner.nextLine();

                if (UserAccount.login(loginEmail, loginPassword)) {
                    if (Admin.isAdmin(loginEmail, loginPassword)) {
                        System.out.println("✅ Вход выполнен как администратор: " + loginEmail);
                        Admin admin = new Admin(0, loginEmail, loginPassword, null,
                                "Admin User", "", "", "", "", "", 0, "");
                        admin.displayRole();
                        admin.manageUsers(scanner);
                    } else {
                        System.out.println("✅ Вход выполнен как обычный пользователь: " + loginEmail);
                    }
                    break;
                } else {
                    System.out.println("❌ Неверный логин или пароль.");
                }
            } else {
                System.out.println("❌ Неверный выбор. ПжПж, выберите 1, 2 или 0.");
            }
        }

        scanner.close();
    }
}
