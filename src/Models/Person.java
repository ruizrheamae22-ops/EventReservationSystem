package Models;

public abstract class Person {
    private int id;
    private String name;
    private String contact;

    public Person(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

   
}