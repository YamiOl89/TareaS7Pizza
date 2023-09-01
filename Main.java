import pkgPizza.Pizza;
import pkgPizza.Topping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear una pizza
        Pizza pizza = new Pizza("Pizza Especial", 150.00);

        // Crear toppings con precios
        Topping pepperoni = new Topping("Pepperoni", 10);
        Topping mushrooms = new Topping("Mushrooms", 20);
        Topping onions = new Topping("Onions", 30);

        List<Topping> availableToppings = new ArrayList<>();
        availableToppings.add(pepperoni);
        availableToppings.add(mushrooms);
        availableToppings.add(onions);

        // Mostrar menú y agregar toppings
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenú de Toppings:");
            for (int i = 0; i < availableToppings.size(); i++) {
                Topping topping = availableToppings.get(i);
                System.out.println((i + 1) + ". " + topping.getName() + " - $" + topping.getPrice());
            }

            System.out.print("Elige un topping para agregar (0 para terminar): ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            if (choice > 0 && choice <= availableToppings.size()) {
                Topping selectedTopping = availableToppings.get(choice - 1);
                pizza.addTopping(selectedTopping);
                System.out.println("Topping agregado: " + selectedTopping.getName());
            } else {
                System.out.println("Opción inválida.");
            }
        }

        // Mostrar información final de la pizza
        System.out.println("\nPizza final:");
        System.out.println(pizza);
    }
}
