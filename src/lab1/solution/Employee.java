package lab1.solution;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {

    private String firstName, lastName, ssn, cubeId;
    private Date birthDate, currentDate;

    public Employee() {
        currentDate = new Date();
    }

    public Employee(String fn, String ln, String soc, String cId) {
        firstName = fn;
        lastName = ln;
        ssn = soc;
        cubeId = cId;
        currentDate = new Date();

    }

    public String getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        String fmtDate = sdf.format(currentDate);
        return fmtDate;
    }

    public void employeeProcess() {
        meetWithHrForBenefitAndSalryInfo();
        meetDepartmentStaff();
        reviewDeptPolicies();
        moveIntoCubicle();
        getStatus();

    }

    // Assume this must be performed first
    private void meetWithHrForBenefitAndSalryInfo() {
        System.out.println("Met with Hr on " + getDate());

    }

    // Assume this is must be performed second
    private void meetDepartmentStaff() {

        System.out.println("Met with Dept. Staff on " + getDate());

    }

    // Assume this must be performed third
    private void reviewDeptPolicies() {

        System.out.println("Reviewed Dept. Policies on " + getDate());

    }

    // Assume this must be performed 4th
    private void moveIntoCubicle() {
        System.out.println("Moved into cube on " + getDate());
//        this.cubeId = cubeId;

    }

    public String getStatus() {

        return "Orientation is completed on: " + getDate();

    }
}
