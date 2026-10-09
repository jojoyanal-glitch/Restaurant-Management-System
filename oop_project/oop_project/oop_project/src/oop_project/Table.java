package oop_project;

import java.util.ArrayList;
import java.util.Scanner;

public class Table {

    private int tableNumber;
    private boolean isEmpty;

    public Table(int tableId) {
        this.tableNumber = tableId;
        this.isEmpty = true;
    }
    
    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setIsEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    public void reserveTable(ArrayList<Table> tables) {
        if (isEmpty) {
            isEmpty = false;
            System.out.println("Table " + tableNumber + " Reserved successfully. ");
        } else {
            System.out.println("Table " + tableNumber + " is already occupied. ");

            Scanner input = new Scanner(System.in);
            boolean tableReserved = false;

            while (!tableReserved) {
                System.out.println("Pleas choose another available table : ");

                boolean anyAvailable = false;
                for (int i = 0; i < tables.size(); i++) {
                    if (tables.get(i).isEmpty()) {
                        System.out.println("Table " + (i + 1) + " (Available)");
                        anyAvailable = true;
                    }//if
                }//for 

                if (!anyAvailable) {
                    System.out.println("Sorry , not table are available at the moment.");
                    break;
                }//if

                System.out.println("Enter new table number to reserve : ");
                int newTableNumber = input.nextInt();

                if (newTableNumber < 1 || newTableNumber > tables.size()) {
                    System.out.println("Invalid table number . please try again.");
                    continue;
                }//if

                Table selecedTable = tables.get(newTableNumber - 1);
                if (selecedTable.isEmpty()) {
                    selecedTable.reserveTable(tables);
                    tableReserved = true;
                    System.out.println("Table " + newTableNumber + " reserved successfully. ");
                }//if
                else {
                    System.out.println("Table " + newTableNumber + " is occupied, please select another. ");
                }

            }//while
        }//else 
    }//method

    public void checkTableStatus() {
        if (isEmpty) {
            System.out.println("Table " + tableNumber + " is empty.");
        } else {
            System.out.println("Table " + tableNumber + " is occupied.");
        }
    }

}//class
