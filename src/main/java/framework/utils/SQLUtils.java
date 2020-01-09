package framework.utils;

import constants.SQLServerConstants;
import models.DBConnection;
import org.apache.log4j.Logger;

import java.sql.*;


public class SQLUtils {
    private static DBConnection dbModel = new DBConnection(SQLServerConstants.URL, SQLServerConstants.USERNAME, SQLServerConstants.PASSWORD);
    private static final Logger log = Logger.getLogger(SQLUtils.class);

    private static Connection getConnection(DBConnection dbModel) {
        try {
            log.info("Getting connection to mySQL server");
            return DriverManager.getConnection(dbModel.getUrl(), dbModel.getUsername(), dbModel.getPassword());
        } catch (SQLException e) {
            log.error("mySQL server connection failed");
            e.printStackTrace();
        }
        return null;
    }

    public static ResultSet getResult(String sqlRequest) {
        try (Statement stmt = getConnection(dbModel).createStatement()){
            log.info("Request execution");
            return stmt.executeQuery(sqlRequest);
        } catch (SQLException e) {
            log.error("Execution failed");
            e.printStackTrace();
        }
        return null;
    }
}
