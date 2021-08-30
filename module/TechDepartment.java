package module;

public class TechDepartment extends SuperDepartment {
    private String departmentName = "Tech Department";
    private String getTodaysWork = "Complete coding of module 1";
    private String getWorkDeadline = "Complete by EOD";
    private String getTechStackInformation = "core Java";

    public String departmentName() {
        return departmentName;

    }

    public String getTodaysWork() {
        return getTodaysWork;

    }

    public String getWorkDeadline() {
        return getWorkDeadline;

    }

    public String getTechStackInformation() {
        return getTechStackInformation;

    }

}
