package alan.Homework2.model;

public class Department {
    private int deptid;
    private String name;
    private String loc;

    public Department(int deptid, String name, String loc) {
        this.deptid = deptid;
        this.name = name;
        this.loc = loc;
    }

    public Department(int deptid) {
        this.deptid=deptid;
        this.name = "";
        this.loc = "";
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoc() {
        return loc;
    }

    private void setLoc(String loc) {
        this.loc = loc;
    }
}
