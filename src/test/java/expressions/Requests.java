package expressions;

public class Requests {
    public static final String GET_SORTED_TESTS = "select project.name, test.name, test.end_time - test.start_time as minimal_time from test inner join project on test.project_id=project.id order by project.name, test.name asc;";
}
