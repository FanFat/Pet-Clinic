package app.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import app.entities.*;

public class Clinic {
    private static Clinic instance = new Clinic();

    /**
     * Список клиентов
     */
    private ArrayList<Client> clients;

    private Clinic() {
        this.clients = new ArrayList<>();
    }

    public static Clinic getInstance() {
        return instance;
    }

    public List<String> list() {
        return clients.stream()
                .map(Client::getName)
                .collect(Collectors.toList());
    }

    public List<String> listPet() {
        return clients.stream()
                .map(Client::getPetName)
                .collect(Collectors.toList());
    }

    public List<String> listKindPet() {
        return clients.stream()
                .map(Client::getPetType)
                .collect(Collectors.toList());
    }

    /**
     * Добавить клиента
     * @param clientName имя клиента
     * @param petName имя питомца
     * @param kindPet вид питомца
     */
    public void addClient(String clientName, String petName, String kindPet) {

        /*
        if (kindPet.equals("Кошка"))
            clients.add(new Client(clientName, new Cat(petName)));
        else if (kindPet.equals("Собака"))
            clients.add(new Client(clientName, new Dog(petName)));
        else throw new IllegalArgumentException("there is no such animal");
*/

        switch (kindPet) {
            case "Cat" :
                clients.add(new Client(clientName, new Cat(petName)));
                break;
            case "Dog" :
                clients.add(new Client(clientName, new Dog(petName)));
                break;
                default:
                    throw new IllegalArgumentException("there is no such animal");
        }
    }

    /**
     * Вывести всю базу по клиентам
     */
    public void showDatabase() {
        for (Client client : this.clients) {
            System.out.println(client.toString());
        }
    }

    /**
     * Поиск клиента по имени питомца
     * @param petName имя питомца
     * @return клиента
     */
    public ArrayList<Client> findClientsByPetName(final String petName) {
        ArrayList<Client> result = new ArrayList<>();
        for (Client client : this.clients) {
            if (petName.equals(client.getPetName()))
                result.add(client);
        }
        return result;
    }

    /**
     * Поиск клиента по его имени
     * @param clientName имя клиента
     * @return клиента
     */
    public ArrayList<Client> findClientsByName(final String clientName) {
        ArrayList<Client> result = new ArrayList<>();
        for (Client client : this.clients) {
            if (clientName.equals(client.getName()))
                result.add(client);
        }
        return result;
    }

    /**
     * Редактирование имени клиента
     * @param oldName старое имя
     * @param newName новое имя
     */
    public void setClientName(String oldName, String newName) {
        for (Client client : this.clients) {
            if (oldName.equals(client.getName()))
                client.setName(newName);
        }
    }

    /**
     * Редактирование имени питомца
     * @param oldName старое имя
     * @param newName новое имя
     */
    public void setPetName(String oldName, String newName) {
        for (Client client : this.clients) {
            if (oldName.equals(client.getPetName()))
                client.setPetName(newName);
        }
    }

    /**
     * Удаление клиента по его имени
     * @param clientName имя клиента
     */
    public void deleteClientByName(String clientName) {
        for (int i = 0; i < clients.size(); i++) {
            if (clientName.equals(clients.get(i).getName())) {
                clients.remove(i);
                i--;
            }
        }
    }

    /**
     * Удаление питомца по имени клиента и питомца
     * @param clientName имя клиента
     * @param petName имя питомца
     */
    public void deletePetByClientNameAndPetName(String clientName, String petName) {
        for (Client client : clients) {
            if (clientName.equals(client.getName()) && petName.equals(client.getPetName()))
                client.deletePet(petName);
        }
    }

    /**
     * Проверить наличие клиента по имени
     * @param clientName имя клиента
     * @return существует ли клиент
     */
    public boolean isExistClient(String clientName) {
        for (Client client : clients) {
            if (clientName.equals(client.getName()))
                return true;
        }
        return false;
    }
}
