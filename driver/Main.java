package driver;

import module.AdminDepartment;
import module.HrDepartment;
import module.SuperDepartment;
import module.TechDepartment;

public class Main {
    public static void main(String[] args) {
        HrDepartment hr1 = new HrDepartment();
        TechDepartment tech1 = new TechDepartment();
        AdminDepartment admin1 = new AdminDepartment();

        System.out.println("Welcome to " + admin1.departmentName());
        System.out.println(admin1.getTodaysWork());
        System.out.println(admin1.getWorkDeadline());
        System.out.println(admin1.isTodayAHoliday());

        System.out.println("\nWelcome to " + hr1.departmentName());
        System.out.println(hr1.doActivity());
        System.out.println(hr1.getTodaysWork() + "\b");
        System.out.println("\b\b\b\b\b" + hr1.getWorkDeadline());
        System.out.println(hr1.isTodayAHoliday());

        System.out.println("\nWelcome to " + tech1.departmentName());
        System.out.println(tech1.getTodaysWork());
        System.out.println(tech1.getWorkDeadline());
        System.out.println(tech1.getTechStackInformation());
        System.out.println(tech1.isTodayAHoliday());

    }

}
