
package oop_project;

public class People {
    private int id;
    private String name;

    public People() {
        this.id = 000;
        this.name = "unknown";
    }

    public People(int id, String name) {
        setId(id);
        setName(name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id >= 0 && id <= 999 && String.valueOf(id).length() == 3){
            System.out.println("THE ID : ");
            this.id = id;
        }
        else{
            System.out.println("NO ID : ");
            this.id = 000;
        }
            
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null){
            System.out.println("NO NAME : ");
            this.name = "unknown";
        }
        else{
            this.name = name;
        }
    }
    
    public void printPersonInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
    
}
