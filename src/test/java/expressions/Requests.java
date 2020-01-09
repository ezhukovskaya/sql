package expressions;

public class Requests {
    public static final String SORTED_TESTS_PROJECTS = "SELECT project.name, test.name, test.end_time - test.start_time AS minimal_time FROM test INNER JOIN project ON test.project_id=project.id ORDER BY project.name, test.name asc;";
    public static final String TEST_COUNT = "SELECT project.name, COUNT(DISTINCT test.name) AS test_count FROM test INNER JOIN project ON test.project_id=project.id GROUP BY project.name;";
    public static final String TESTS_TILL_2015 = "SELECT project.name, test.name, test.start_time FROM test INNER JOIN project ON test.project_id=project.id WHERE DATE(test.start_time) >= '%s';";
    public static final String FIREFOX_CHROME_TESTS = "SELECT COUNT(browser) AS browser FROM test WHERE browser='firefox' UNION SELECT COUNT(browser) AS browser FROM test WHERE browser='chrome';";
}
