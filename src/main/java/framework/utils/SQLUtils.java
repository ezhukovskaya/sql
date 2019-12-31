package framework.utils;

import Constants.SQLServerConstants;
import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.*;


public class SQLUtils {

    public static ResultSet getResult(String sqlRequest) {
        try {
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection(SQLServerConstants.URL, SQLServerConstants.USERNAME, SQLServerConstants.PASSWORD); Statement statement = connection.createStatement()){
            return statement.executeQuery(sqlRequest);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
