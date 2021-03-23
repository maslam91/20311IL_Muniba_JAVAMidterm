package design;

//public class className -> public abstract className
public abstract class AbstractEmployeeData implements Employee { //can only implement interface not classes


    public AbstractEmployeeData(int id, String name, String department, int hours, int dayOfWeek, int salary, String benefits, int dob, int ssn, String ptOrFt, boolean workspace, int employeeYearsOfExperience, String level, String nationality, int startDate, boolean isAlive, int laughForLaughs) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.hours = hours;
        this.dayOfWeek = dayOfWeek;
        Salary = salary;
        this.benefits = benefits;
        this.dob = dob;
        this.ssn = ssn;
        PtOrFt = ptOrFt;
        this.workspace = workspace;
        this.employeeYearsOfExperience = employeeYearsOfExperience;
        this.level = level;
        this.nationality = nationality;
        this.startDate = startDate;
        this.isAlive = isAlive;
        this.laughForLaughs = laughForLaughs;

    }

    //Create Variables
    int id;
    String name;
    String department;
    int hours;
    int dayOfWeek;
    int Salary = hours * dayOfWeek;
    String benefits;
    int dob;
    int ssn;
    String PtOrFt;
    boolean workspace;
    int employeeYearsOfExperience;
    String level;
    String nationality;
    int startDate;
    boolean isAlive;

    //private
    private int laughForLaughs;

    protected AbstractEmployeeData() {
    }

    public  void employeeId(int laughForLaughs) {
        this.laughForLaughs = laughForLaughs;
    }



    public String setEmployeeName(String name) {
        return name;
    }

    public void assignDepartment(String department) {

    }

    public int calculateSalary(int hours) {
        return hours;
    }


    public void benefitLayout(String benefits) {

    }


    public int employeeDOB(int dob) {
        return dob;
    }


    public int employeeSSN(int ssn) {
        return ssn;
    }

    public void employeePTorFT(String ptOrFt) {

    }

    public boolean employeeIsWorkingFromHome(boolean workspace) {
        return false;
    }

    public int employeeExperience(int employeeYearsOfExperience) {
        return employeeYearsOfExperience;
    }


    public String employeeJobLevel(String level) {
        return level;
    }

    public abstract void employeeNationality(String nationality);

    public int employeeStartDate(int startDate) {
        return startDate;
    }

    public boolean employeeIsaLive(boolean isAlive) {
        return isAlive;

    }
}
