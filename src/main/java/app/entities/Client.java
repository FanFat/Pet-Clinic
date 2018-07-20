package app.entities;

public class Client {
    private String name;
    private Pet pet;

    public Client(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }
    public String getName() {
        return this.name;
    }

    public String getPetName() {
        return this.pet.getPetName();
    }

    public String getPetType() {
        return this.pet.getPetType();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPetName(String name) {
        this.pet.setPetName(name);
    }

    public boolean isExist() {
        if (pet != null)
            return true;
        else return false;
    }

    @Override
    public String toString() {
        if (isExist())
            return "Имя клиента: " + getName() + ", Питомец: " + getPetType() + " по имени " + getPetName();
        else return "Имя клиента: " + getName() + ", Питомца нет";
    }

    public void deletePet(String petName) {
        if (petName.equals(pet.getPetName()))
            pet = null;
    }
}
