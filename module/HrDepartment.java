package module;

public class HrDepartment extends SuperDepartment {

    private String departmentName = "Hr Department";
    private String getTodaysWork = "Fill today’s worksheet and mark your attendance";
    private String getWorkDeadline = "Complete by EOD";
    private String doActivity = "team Lunch";

    public String departmentName() {
        return departmentName;

    }

    public String getTodaysWork() {
        return getTodaysWork;

    }

    public String getWorkDeadline() {
        return getWorkDeadline;

    }

    public String doActivity() {
        return doActivity;

    }
}
