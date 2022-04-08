package reposotory;

import config.ReadProperties;

import java.sql.*;

public class QueryResolver extends ReadProperties {
    public QueryResolver(){};

    static final String DB_URL = "jdbc:postgresql://217.66.99.253:5433/tickets_hub_foxminded";
    static final String DB_USER = "postgres";
    static final String DB_PASS = "Vittro56K";

//    String DB_URL = properties.getProperty("db.dataBaseURL");
//    String DB_USER = properties.getProperty("db.DBUser");
//    String DB_PASS = properties.getProperty("db.DBPass");

    public ResultSet getValues(String sql) {
        Connection connection = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
//        final Connection connection = DriverManager.getConnection("db.dataBaseURL","db.DBUser","db.DBPass");

        try (PreparedStatement statement
//             = connection.prepareStatement("select category.name, category.color from public.category ORDER BY RANDOM() LIMIT 1")) {
             = connection.prepareStatement(sql)) {

            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                String byName = "Name: " + resultSet.getString("name");
                String byColor = "Color: " + resultSet.getString("color");
                System.out.println(byName);
                System.out.println(byColor);
            }
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return resultSet;
    }
}
