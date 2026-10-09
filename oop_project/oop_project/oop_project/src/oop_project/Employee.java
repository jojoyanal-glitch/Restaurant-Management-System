
package oop_project;

public class Employee extends People {

    private String jobTitle;
    private double salary;

    public Employee() {
        super();
        this.jobTitle = "chif";
        this.salary = 290;
    }

    public Employee(int id, String name, String jobTitle, double salary) {
        super(id, name);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle != null) {
            this.jobTitle = jobTitle;
            System.out.println(getName() + " HAS BEEN ASSIGNED THE JOB TITLE : " + jobTitle);
        } else {
            System.out.println("Invalid job title for " + getName());
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary>=290)
            this.salary = salary;
        else{
            System.out.println("THE MINIMUM IS 290JD");
            this.salary = 290;
        }
    }

     @Override
    public String toString(){
        return "Employee : " 
                +"\nJob Title : " + jobTitle
                +"\nSalary : " + salary;
    }
    
}
