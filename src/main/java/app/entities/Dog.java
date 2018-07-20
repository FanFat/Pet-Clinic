package app.entities;

public class Dog implements Pet {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getPetName() {
        return this.name;
    }

    public String getPetType() {
        return "Собака";
    }

    public void setPetName(String name) {
        this.name = name;
    }
}
