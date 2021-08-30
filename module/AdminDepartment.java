package module;

public class AdminDepartment extends SuperDepartment {

    private String departmentName = "Admin Department";
    private String getTodaysWork = "Complete your documents Submission";
    private String getWorkDeadline = "Complete by EOD";

    public String departmentName() {
        return departmentName;

    }

    public String getTodaysWork() {
        return getTodaysWork;

    }

    public String getWorkDeadline() {
        return getWorkDeadline;

    }

}
