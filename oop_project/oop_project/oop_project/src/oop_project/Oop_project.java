package oop_project;

import java.util.ArrayList;
import java.util.Scanner;

public class Oop_project {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Resturant resturant = new Resturant();
        System.out.println(resturant);
        ArrayList<Table> tables = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            tables.add(new Table(i)); 
        }      
     
        resturant.setTables(tables);

        int choice = -1;
        do {
            printMenu();
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n----- Add a New Employee -----");
                    resturant.addNewEmployee();
                    break;
                
                case 2:
                   
                    System.out.print("\nEnter Table Number you want to reserve and: ");
                    int tableNumber = input.nextInt();
                    resturant.addNewCustomer(tableNumber); 
                    break;
            
                case 3:
                    System.out.println("\n----- Check Table Status -----");
                    for(Table table : resturant.getTables()){
                        table.checkTableStatus(); 
                    }
                    break;
                
                case 4:
                    System.out.println("\n----- Change Restaurant Name -----");
                    resturant.changeRestaurantName();
                    break;
                
                case 5:
                    System.out.println("\n----- Program Ended -----");
                    break;

                default:
                    System.out.println("\nNo such choice");
            }

        } while (choice != 5); 
    }

    public static void printMenu() {
        System.out.println("\n---What would you like to do?---");
        System.out.println("1 - Add Employee");
        System.out.println("2 - Add Customer and reseve table");
        System.out.println("3 - Check Table Status");
        System.out.println("4 - Change Restaurant Name");
        System.out.println("5 - Exit");
        System.out.print("\n**Enter a choice: ");
    }
    
}
