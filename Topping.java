package pkgPizza;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Topping {
    private final String ingredienteName;
    private double price;

    public Topping(String ingredienteName, double price) {
        this.ingredienteName = ingredienteName;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return ingredienteName + " (" + price + ")";
    }

    public static void main(String[] args) {
        // Crear toppings
        Topping pepperoni = new Topping("Pepperoni", 1.5);
        Topping mushrooms = new Topping("Mushrooms", 1.0);
        Topping onions = new Topping("Onions", 0.75);

        List<Topping> availableToppings = new ArrayList<>();
        availableToppings.add(pepperoni);
        availableToppings.add(mushrooms);
        availableToppings.add(onions);

        // Crear una pizza
        Pizza pizza = new Pizza("Pizza Margarita", 70.00);

        // Mostrar menú de toppings
        System.out.println("Menú de Toppings:");
        for (int i = 0; i < availableToppings.size(); i++) {
            System.out.println((i + 1) + ". " + availableToppings.get(i));
        }

        // Pedir al usuario que elija toppings
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Elige un topping (0 para terminar): ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            if (choice > 0 && choice <= availableToppings.size()) {
                pkgPizza.Topping selectedTopping = availableToppings.get(choice - 1);
                pizza.addTopping(selectedTopping);
                System.out.println("Topping agregado: " + selectedTopping);
            } else {
                System.out.println("Opción inválida.");
            }
        }

        // Calcular el precio total de la pizza
        double totalPrice = pizza.getPrice();
        for (Topping topping : pizza.getToppings()) {
            totalPrice += topping.getPrice();
        }

        // Mostrar información de la pizza y el precio total
        System.out.println("Pizza final:");
        System.out.println(pizza);
        System.out.println("Precio total: " + totalPrice);
    }

    public int getName() {
        return 0;
    }
}