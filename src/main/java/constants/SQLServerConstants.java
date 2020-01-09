package constants;

import framework.utils.PropertiesRead;

public class SQLServerConstants {
    public static final String URL = PropertiesRead.readFromFrameworkConfig("url");
    public static final String USERNAME = PropertiesRead.readFromFrameworkConfig("username");
    public static final String PASSWORD = PropertiesRead.readFromFrameworkConfig("password");
}
