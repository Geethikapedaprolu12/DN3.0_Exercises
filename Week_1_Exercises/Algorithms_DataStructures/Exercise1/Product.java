package InventoryManagementSystem;

import java.util.HashMap;
import java.util.Scanner;

public class Product {
    int id;
    String name;
    double quantity;
    double price;

    public Product(int id, String name, double quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    static HashMap<Integer, Product> inventory = new HashMap<>();

    public static void addProduct(int id, String name, double quantity, double price) {
        Scanner sc = new Scanner(System.in);
        if (!inventory.containsKey(id)) {
            inventory.put(id, new Product(id, name, quantity, price));
            System.out.println("The product with ID " + id + " has been added.");
        } else {
            System.out.println("The product with ID " + id + " already exists.");
            System.out.println("Do you want to update the quantity of the item? [Y/N]");
            String response = sc.next();
            if (response.equalsIgnoreCase("Y")) {
                System.out.println("Enter the quantity to add:");
                double addQuantity = sc.nextDouble();
                updateQuantity(id, addQuantity);
            }
        }
        displayInventory();
    }

    public static void deleteProduct(int id) {
        if (inventory.containsKey(id)) {
            inventory.remove(id);
            System.out.println("The product with ID " + id + " has been deleted.");
        } else {
            System.out.println("Product with ID " + id + " not found.");
        }
        displayInventory();
    }

    public static void updateQuantity(int id, double quantityChange) {
        Scanner sc = new Scanner(System.in);
        if (inventory.containsKey(id)) {
            Product product = inventory.get(id);
            System.out.println("Do you want to update the quantity of the item? [1: increase  2: decrease]");
            int response = sc.nextInt();
            if (response == 1) {
                product.quantity += quantityChange;
            } else if (response == 2) {
                product.quantity -= quantityChange;
            } else {
                System.out.println("Please enter either 1 or 2.");
            }
            System.out.println("Updated product: " + product);
        } else {
            System.out.println("Product with ID " + id + " not found.");
        }
        displayInventory();
    }

    public static void updatePrice(int id, double priceChange) {
        Scanner sc = new Scanner(System.in);
        if (inventory.containsKey(id)) {
            Product product = inventory.get(id);
            System.out.println("Do you want to update the price of the item? [1: increase  2: decrease]");
            int response = sc.nextInt();
            if (response == 1) {
                product.price += priceChange;
            } else if (response == 2) {
                product.price -= priceChange;
            } else {
                System.out.println("Please enter either 1 or 2.");
            }
            System.out.println("Updated product: " + product);
        } else {
            System.out.println("Product with ID " + id + " not found.");
        }
        displayInventory();
    }

    public static void updateProductName(int id, String newName) {
        Scanner sc = new Scanner(System.in);
        if (inventory.containsKey(id)) {
            Product product = inventory.get(id);
            System.out.println("Do you want to update the name of the item? [Y/N]");
            String response = sc.next();
            if (response.equalsIgnoreCase("Y")) {
                product.name = newName;
                System.out.println("Updated product: " + product);
            }
        } else {
            System.out.println("Product with ID " + id + " not found.");
        }
        displayInventory();
    }

    public static void displayInventory() {
        System.out.println("------------------------------------------------------");
        System.out.printf("| %-10s | %-20s | %-10s | %-10s |\n", "Product ID", "Product Name", "Quantity", "Price");
        System.out.println("------------------------------------------------------");
        for (Product product : inventory.values()) {
            System.out.printf("| %-10d | %-20s | %-10.2f | %-10.2f |\n", product.id, product.name, product.quantity, product.price);
        }
        System.out.println("------------------------------------------------------");
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("----- Inventory Management System -----");
            System.out.println("1. Add Product");
            System.out.println("2. Delete Product");
            System.out.println("3. Update Quantity of the Product");
            System.out.println("4. Update Price of the Product");
            System.out.println("5. Update Name of the Product");
            System.out.println("6. Display Inventory");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Product Name: ");
                    String name = sc.next();
                    System.out.print("Enter Product Quantity: ");
                    double quantity = sc.nextDouble();
                    System.out.print("Enter Product Price: ");
                    double price = sc.nextDouble();
                    addProduct(id, name, quantity, price);
                    break;
                case 2:
                    System.out.print("Enter Product ID: ");
                    int deleteId = sc.nextInt();
                    deleteProduct(deleteId);
                    break;
                case 3:
                    System.out.print("Enter Product ID: ");
                    int updateQuantityId = sc.nextInt();
                    System.out.print("Enter Quantity Change: ");
                    double quantityChange = sc.nextDouble();
                    updateQuantity(updateQuantityId, quantityChange);
                    break;
                case 4:
                    System.out.print("Enter Product ID: ");
                    int priceUpdateId = sc.nextInt();
                    System.out.print("Enter Price Change: ");
                    double priceChange = sc.nextDouble();
                    updatePrice(priceUpdateId, priceChange);
                    break;
                case 5:
                    System.out.print("Enter Product ID: ");
                    int nameUpdateId = sc.nextInt();
                    System.out.print("Enter New Product Name: ");
                    String newName = sc.next();
                    updateProductName(nameUpdateId, newName);
                    break;
                case 6:
                    displayInventory();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
