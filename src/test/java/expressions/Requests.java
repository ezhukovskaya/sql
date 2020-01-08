package expressions;

public class Requests {
    public static final String GET_SORTED_TESTS = "select project.name, test.name, test.end_time - test.start_time as minimal_time from test inner join project on test.project_id=project.id order by project.name, test.name asc;";
    public static final String TEST_COUNT = "select project.name, count(distinct test.name) as test_count from test inner join project on test.project_id=project.id group by project.name;";
    public static final String TESTS_BEFORE_DATE = "select project.name, test.name, test.start_time from test inner join project on test.project_id=project.id where DATE(test.start_time) >= '2015-11-7';";
    public static final String BROWSERS = "select count(browser) as browser from test where browser='firefox' union select count(browser) as browser from test where browser='chrome';";
}
