package config;

import java.sql.*;

public class SQLConnection {

    static final String DB_URL = "jdbc:postgresql://217.66.99.253:5433/tickets_hub_foxminded";
    static final String DB_USER = "postgres";
    static final String DB_PASS = "Vittro56K";

    public static void main(String[] argv) throws SQLException{

        final Connection connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
//        final Connection connection = DriverManager.getConnection("db.dataBaseURL","db.DBUser","db.DBPass");

        try (PreparedStatement statement = connection.prepareStatement("select category.name, category.color from public.category ORDER BY RANDOM() LIMIT 1")){

            final ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()){
                String byName = "Name: " + resultSet.getString("name");
                String byColor = "Color: " + resultSet.getString("color");
                System.out.println(byName);
                System.out.println(byColor);
            }
        }finally {
            connection.close();
        }
    }
}
