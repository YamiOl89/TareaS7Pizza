package pkgPizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private double price;
    private List<pkgPizza.Topping> toppings = new ArrayList<>();

    // Constructor
    public Pizza(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // ... (métodos getter y setter)

    // Método para agregar un topping a la pizza
    public void addTopping(pkgPizza.Topping topping) {
        toppings.add(topping);
        price += topping.getPrice();  // Sumar el precio del topping al precio total de la pizza
    }

    // Método para mostrar los toppings de la pizza
    public void mostrarToppings() {
        System.out.println("Toppings de la pizza " + name + ":");
        for (pkgPizza.Topping topping : toppings) {
            System.out.println(topping);
        }
    }

    @Override
    public String toString() {
        return "Pizza: {" + name + ", Precio=" + price + "}";
    }

    public double getPrice() {
        return 0;
    }

    public Topping[] getToppings() {
        return new Topping[0];
    }



}