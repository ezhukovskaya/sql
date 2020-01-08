package tests;

import constants.CSVPaths;
import expressions.Requests;
import framework.utils.CSVUtils;
import framework.utils.SQLUtils;
import org.testng.annotations.Test;

public class SQLTest {
    @Test
    public static void sqlTest(){
        CSVUtils.toCSVFile(SQLUtils.getResult(Requests.GET_SORTED_TESTS), CSVPaths.FIRST_REQUEST);
        CSVUtils.toCSVFile(SQLUtils.getResult(Requests.TEST_COUNT), CSVPaths.TEST_COUNT);
        CSVUtils.toCSVFile(SQLUtils.getResult(Requests.TESTS_BEFORE_DATE), CSVPaths.THIRD_REQUEST);
        CSVUtils.toCSVFile(SQLUtils.getResult(Requests.BROWSERS), CSVPaths.FOURTH_REQUEST);
    }
}
