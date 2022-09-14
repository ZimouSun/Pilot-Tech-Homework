import java.util.Date;

public class Employee {

    private int id;
    private String name;
    private String job;
    private int manager;
    private Date hiredate;
    private double salary;
    private int deptid;

    public Employee(int id, String name, String job, int manager, Date hiredate, double salary, int deptid) {
        this.id = id;
        this.name = name;
        this.job = job;
        this.manager = manager;
        this.hiredate = hiredate;
        this.salary = salary;
        this.deptid = deptid;
    }

    public Employee() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getManager() {
        return manager;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public double getSalary() {
        return salary;
    }

    public int getDeptid() {
        return deptid;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setJob(String job) {
        this.job = job;
    }

    private void setManager(int manager) {
        this.manager = manager;
    }

    private void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    private void setSalary(double salary) {
        this.salary = salary;
    }

    private void setDeptid(int deptid) {
        this.deptid = deptid;
    }
}
