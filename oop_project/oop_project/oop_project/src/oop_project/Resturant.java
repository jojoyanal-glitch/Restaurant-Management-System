package oop_project;

import java.util.ArrayList;
import java.util.Scanner;

public class Resturant {

    private String name;
    private String location;
    private ArrayList<Employee> employees = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<Table> tables = new ArrayList<>();

    public Resturant() {
        this.name = "Any Resturant";
        this.location = "Amman";
    }

    public Resturant(String name, String location) {
        setName(name);
        setLocation(location);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        if (location.equalsIgnoreCase("Amman")) {
            this.location = location;
        } else {
            System.out.println("There are no other branches");
            this.location = "Amman";
        }
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Table> getTables() {
        return tables;
    }

    public void setTables(ArrayList<Table> tables) {
        this.tables = tables;
    }

    public void addNewEmployee() {
        Employee a = new Employee();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter details for employee ");
        System.out.print("Employee ID: ");
        int employeeId = input.nextInt();
        input.nextLine();
        System.out.print("Employee Name: ");
        String employeeName = input.nextLine();
        System.out.print("Job Title: ");
        String jobTitle = input.nextLine();
        System.out.print("Salary: ");
        double salary = input.nextDouble();

        Employee employee = new Employee(employeeId, employeeName, jobTitle, salary);
        this.employees.add(employee);
        this.employees.add(a);
        System.out.println("\n***new Employee is add!!***");
    }

    void addNewCustomer(int TableNumber) {
        Customer B = new Customer();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter details for customer ");
        System.out.print("Customer ID: ");
        int customerId = input.nextInt();
        input.nextLine();
        System.out.print("Customer Name: ");
        String customerName = input.nextLine();
        System.out.print("Customer Email: ");
        String email = input.nextLine();
        System.out.print("Customer Phone: ");
        String phone = input.nextLine();
        Customer customer = new Customer(customerId, customerName, email, phone);
        this.customers.add(customer);
        this.customers.add(B);
        System.out.println("\n***there is a new customer***");
        customer.selectTable(this.tables, TableNumber);
    }

    public void changeRestaurantName() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the new restaurant name: ");
        String newName = input.nextLine();
        setName(newName);
        System.out.println("\n***Restaurant name changed to " + newName + "***");
    }

    public String toString(){
        return "Resturant : " 
                +"\nName : " + name
                +"\nLocation : " + location;
    }
}
