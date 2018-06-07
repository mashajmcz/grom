package lesson10.polyexample;

public class Human {
    private String name;
    void run(){
        System.out.println("Human class is called...");
        System.out.println(name + " is running");
    }

    public Human(String name) {
        this.name = name;
    }
}
