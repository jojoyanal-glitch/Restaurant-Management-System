
package oop_project;

import java.util.ArrayList;

public class Customer extends People {

    private String phoneNumber;
    private String email;

    public Customer() {
        super();
        this.phoneNumber = "There is no number";
        this.email = "There is no email";
    }

    public Customer(int id, String name, String phoneNumber, String email) {
        super(id, name);
        setPhoneNumber(phoneNumber);
        setEmail(email);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber != null && phoneNumber.matches("^07\\d{8}$")) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("THE NUMER IS WRONG");
            this.phoneNumber = "There is no phone number";
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && email.matches("^[A-Za-z0-9]+@gmail\\.com$")) {
            this.email = email;
        } else {
            System.out.println("THE EMAIL IS WRONG");
            this.email = "There is no email";
        }
    }

    public void printCustomerInfo() {
        super.printPersonInfo();
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
    }

    public boolean selectTable(ArrayList<Table> tables, int tableNumber) {
        if (tableNumber >= 1 && tableNumber <= tables.size()) {
            Table selectedTable = tables.get(tableNumber - 1);
            System.out.println(getName() + " is trying to reserve Table " + tableNumber);
            selectedTable.reserveTable(tables);
        } else {
            System.out.println("Invalid table number.");
        }
        return true;
    }

}
