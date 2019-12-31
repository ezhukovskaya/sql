package tests;

import expressions.Requests;
import framework.utils.CSVUtils;
import framework.utils.SQLUtils;
import org.testng.annotations.Test;

import java.sql.ResultSet;

public class SQLTest {
    @Test
    public static void sqlTest(){
        ResultSet resultSet = SQLUtils.getResult(Requests.GET_SORTED_TESTS);
        CSVUtils.toCSVFile(resultSet);
    }
}
