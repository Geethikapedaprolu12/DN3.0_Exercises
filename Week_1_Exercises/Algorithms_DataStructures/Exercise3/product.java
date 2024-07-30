package sortingCustomerOrders;

import java.util.Scanner;

public class Order {
    private int orderId;
    private String customerName;
    private double totalAmount;

    public Order(int orderId, String customerName, double totalAmount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
    }

    // Bubble sort implementation
    public static void sortOrdersByBubble(Order[] orders, int size) {
        for (int i = 0; i < size - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < size - i - 1; j++) {
                if (orders[j].totalAmount > orders[j + 1].totalAmount) {
                    // Swap orders[j] and orders[j + 1]
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    // Quick sort implementation
    public static void sortOrdersByQuick(Order[] orders, int low, int high) {
        if (low < high) {
            int partitionIndex = partitionOrders(orders, low, high);

            sortOrdersByQuick(orders, low, partitionIndex - 1);
            sortOrdersByQuick(orders, partitionIndex + 1, high);
        }
    }

    // Partition function for quick sort
    public static int partitionOrders(Order[] orders, int low, int high) {
        Order pivot = orders[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (orders[j].totalAmount <= pivot.totalAmount) {
                i++;
                // Swap orders[i] and orders[j]
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        // Swap orders[i + 1] and orders[high]
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;

        return i + 1;
    }

    // Print orders
    public static void printOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println("Order ID: " + order.orderId + ", Customer: " + order.customerName + ", Total Amount: $" + order.totalAmount);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of orders:");
        int size = sc.nextInt();
        Order[] orders = new Order[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the Order ID:");
            int orderId = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.println("Enter the Customer Name:");
            String customerName = sc.nextLine();
            System.out.println("Enter the Total Amount:");
            double totalAmount = sc.nextDouble();
            orders[i] = new Order(orderId, customerName, totalAmount);
        }

        System.out.println("Orders before sorting:");
        printOrders(orders);

        System.out.println("Orders after Bubble Sort:");
        sortOrdersByBubble(orders, size);
        printOrders(orders);

        System.out.println("Orders after Quick Sort:");
        sortOrdersByQuick(orders, 0, size - 1);
        printOrders(orders);

        sc.close();
    }
}