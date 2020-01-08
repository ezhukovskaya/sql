package framework.utils;

import constants.SQLServerConstants;
import framework.sql.SQLBrowser;
import models.DBConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SQLUtils {
    private static DBConnection dbModel = new DBConnection(SQLServerConstants.URL, SQLServerConstants.USERNAME, SQLServerConstants.PASSWORD);

    public static ResultSet getResult(String sqlRequest) {
        try {
            Statement stmt = SQLBrowser.getConnection(dbModel).createStatement();
            return stmt.executeQuery(sqlRequest);
        } catch (SQLException e) {
            System.out.println("failed!");
            e.printStackTrace();
        }
        return null;
    }
}
