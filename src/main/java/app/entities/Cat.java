package app.entities;

public class Cat implements Pet {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getPetName() {
        return this.name;
    }

    public String getPetType() {
        return "Кошка";
    }

    public void setPetName(String name) {
        this.name = name;
    }

}
