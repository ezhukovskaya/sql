package framework.utils;

import constants.SQLServerConstants;
import framework.sql.SQLBrowser;
import models.DBConnection;
import org.apache.log4j.Logger;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SQLUtils {
    private static DBConnection dbModel = new DBConnection(SQLServerConstants.URL, SQLServerConstants.USERNAME, SQLServerConstants.PASSWORD);
    private static final Logger log = Logger.getLogger(SQLUtils.class);

    public static ResultSet getResult(String sqlRequest) {
        try {
            Statement stmt = SQLBrowser.getConnection(dbModel).createStatement();
            log.info("Request execution");
            return stmt.executeQuery(sqlRequest);
        } catch (SQLException e) {
            log.error("Execution failed");
            e.printStackTrace();
        }
        return null;
    }
}
