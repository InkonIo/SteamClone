package Database;

import java.sql.*;

public class DatabaseManager {
    private static final String DB_URL = "jdbc:sqlite:database.db";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL);
    }

    public static void initializeDatabase() {
        try (Connection conn = getConnection(); Statement stmt = conn.createStatement()) {
            String sql = "CREATE TABLE IF NOT EXISTS users (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "email TEXT NOT NULL UNIQUE," +
                    "password TEXT NOT NULL" +
                    ")";
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println("Database init error: " + e.getMessage());
        }
    }
} // НЕ НАДО тут трогать ОПАСНО!
