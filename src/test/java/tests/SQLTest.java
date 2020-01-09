package tests;

import constants.CSVPaths;
import expressions.Requests;
import framework.utils.CSVUtils;
import framework.utils.SQLUtils;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SQLTest {
    private final String LOGFILE = "src/test/java/resources/log4j.properties";
    private static final String testDate = "2015-11-7";

    @BeforeTest
    public void init() {
        PropertyConfigurator.configure(LOGFILE);
    }

    @Test
    public static void sqlTest() {
        CSVUtils.toCSVFile(SQLUtils.getResult(Requests.SORTED_TESTS_PROJECTS), CSVPaths.SORTED_TESTS_PROJECTS);
        CSVUtils.toCSVFile(SQLUtils.getResult(Requests.TEST_COUNT), CSVPaths.TEST_COUNT);
        CSVUtils.toCSVFile(SQLUtils.getResult(String.format(Requests.TESTS_TILL_2015, testDate)), CSVPaths.TESTS_TILL_2015);
        CSVUtils.toCSVFile(SQLUtils.getResult(Requests.FIREFOX_CHROME_TESTS), CSVPaths.FIREFOX_CHROME_TESTS);
    }
}
