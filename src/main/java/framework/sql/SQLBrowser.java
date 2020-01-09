package framework.sql;

import models.DBConnection;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLBrowser {
    private static final Logger log = Logger.getLogger(SQLBrowser.class);

    public static Connection getConnection(DBConnection dbModel) {
        try {
            log.info("Getting connection to mySQL server");
            return DriverManager.getConnection(dbModel.getUrl(), dbModel.getUsername(), dbModel.getPassword());
        } catch (SQLException e) {
            log.error("mySQL server connection failed");
            e.printStackTrace();
        }
        return null;
    }
}
