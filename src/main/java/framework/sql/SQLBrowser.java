package framework.sql;

import models.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLBrowser {
    public static Connection getConnection(DBConnection dbModel){
        try {
            return DriverManager.getConnection(dbModel.getUrl(),dbModel.getUsername(),dbModel.getPassword());
        } catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}
