package zoo;

import java.util.Scanner;

public class MainZoo {
    private Zoo zoo = new Zoo();

    public static void main(String[] args) {
        new MainZoo();
    }

    private void adds(String nameAnimal) {
        zoo.addsAnimal(nameAnimal);
        if (nameAnimal.equals("cow"))
            System.out.println("Появилась корова");
        else if (nameAnimal.equals("crocodile"))
            System.out.println("Появился крокодил");
    }

    private void deleted(String nameAnimal) {
        zoo.deletedAnimal(nameAnimal);
        if (nameAnimal.equals("cow"))
            System.out.println("Корова переехала в другой зоопарк");
        else if (nameAnimal.equals("crocodile"))
            System.out.println("Крокодил переехал в другой зоопарк");
    }

    private void removeAll(String nameAnimal) {
        zoo.removeAll(nameAnimal);
        if (nameAnimal.equals("cow"))
            System.out.println("В зоопарке все еще есть коровы");
        else if (nameAnimal.equals("crocodile"))
            System.out.println("В зоопарке все еще есть крокодилы");
    }

    public MainZoo() {
        String order = "";
        String[] parts;
        Scanner sc = new Scanner(System.in);
        System.out.println("Зоопарк открывает свои двери");
        do {
            order = sc.nextLine();
            parts = order.split(" ");
            if (parts.length == 1) {
                if (parts[0].equals("look")) {
                    System.out.println(zoo.lookAt());
                }
            } else if (parts.length == 2) {
                if (parts[0].equals("add")) {
                    adds(parts[1]);
                }
                if (parts[0].equals("delete")) {
                    deleted(parts[1]);
                }
            } else if (parts.length == 3) {
                if (parts[0].equals("deleted") && parts[1].equals("all")) {
                    removeAll(parts[2]);
                }
            }
            System.out.println(zoo.toString()); // Uncomment to see the entire zoo
        } while (!order.equals("leaves"));
        sc.close();
    }

}