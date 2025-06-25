import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;

class Product {
    int id;
    String name;
    double price;
    int stock;
    String category;

    public Product(int id, String name, double price, int stock, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }

    public void displayInfo() {
        System.out.printf("ID: %d | %s | ₱%.2f | Stock: %d | Category: %s\n", id, name, price, stock, category);
    }
}




 interface PaymentMethod {
    void pay(double amount);
}


class GcashPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paying ₱" + amount + " via GCash...");
    }
}


 class ShopeePayPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paying ₱" + amount + " via ShopeePay...");
    }
}


class Cart {
    ArrayList<Product> productsInCart = new ArrayList<>();
    ArrayList<Integer> quantities = new ArrayList<>();

    public void addProduct(Product product, int quantity) {
        productsInCart.add(product);
        quantities.add(quantity);
        System.out.println(product.name + " added to cart.");
    }

    public void viewCart() {
        System.out.println("📦 Your Cart:");
        for (int i = 0; i < productsInCart.size(); i++) {
            Product p = productsInCart.get(i);
            int q = quantities.get(i);
            System.out.println("- " + p.name + " x " + q + " = ₱" + (p.price * q));
        }
        System.out.println("Total: ₱" + getTotal());
    }

    public double getTotal() {
        double total = 0;
        for (int i = 0; i < productsInCart.size(); i++) {
            total += productsInCart.get(i).price * quantities.get(i);
        }
        return total;
    }

    public void clearCart() {
        productsInCart.clear();
        quantities.clear();
    }
}


class Order {
    ArrayList<Product> products;
    ArrayList<Integer> quantities;
    double totalAmount;
    LocalDate orderDate;

    public Order(ArrayList<Product> products, ArrayList<Integer> quantities, double totalAmount) {
        this.products = new ArrayList<>(products);
        this.quantities = new ArrayList<>(quantities);
        this.totalAmount = totalAmount;
       
    }

    public void displayOrderSummary() {
        System.out.println("🧾 Order Summary - " + orderDate);
        for (int i = 0; i < products.size(); i++) {
            System.out.println("- " + products.get(i).name + " x " + quantities.get(i));
        }
        System.out.println("Total Paid: ₱" + totalAmount);
    }
}



 class User {
    String username;
    String password;
    Cart cart = new Cart();
    ArrayList<Order> orderHistory = new ArrayList<>();

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(String uname, String pass) {
        return this.username.equals(uname) && this.password.equals(pass);
    }

    public void checkout(PaymentMethod paymentMethod) {
        double total = cart.getTotal();
        paymentMethod.pay(total);
        Order order = new Order(cart.productsInCart, cart.quantities, total);
        orderHistory.add(order);
        cart.clearCart();
        System.out.println("✅ Checkout successful!");
    }

    public void viewOrders() {
        if (orderHistory.isEmpty()) {
            System.out.println("No past orders yet.");
        } else {
            for (Order order : orderHistory) {
                order.displayOrderSummary();
            }
        }
    }
}






class Shop {
    ArrayList<Product> products = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();

    public void loadProducts() {
        products.add(new Product(1, "Smartphone", 10999, 10, "Electronics"));
        products.add(new Product(2, "Laptop", 39999, 5, "Computers"));
        products.add(new Product(3, "Earbuds", 999, 25, "Accessories"));
    }

    public void showAllProducts() {
        System.out.println("\n🛍️ Product List:");
        for (Product p : products) {
            p.displayInfo();
        }
    }

    public void registerUser(String username, String password) {
        users.add(new User(username, password));
        System.out.println("✅ User registered!");
    }

    public User authenticateUser(String username, String password) {
        for (User user : users) {
            if (user.login(username, password)) {
                return user;
            }
        }
        return null;
    }

    public Product getProductById(int id) {
        for (Product p : products) {
            if (p.id == id) {
                return p;
            }
        }
        return null;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shop shop = new Shop();
        shop.loadProducts();

        User currentUser = null;
 
        while (true) {
            System.out.println("\n--- MINI SHOPEE ---");
            System.out.println("1. Register\n2. Login\n3. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter username: ");
                String uname = sc.nextLine();
                System.out.print("Enter password: ");
                String pass = sc.nextLine();
                shop.registerUser(uname, pass);
            } else if (choice == 2) {
                System.out.print("Username: ");
                String uname = sc.nextLine();
                System.out.print("Password: ");
                String pass = sc.nextLine();

                currentUser = shop.authenticateUser(uname, pass);

                if (currentUser != null) {
                    System.out.println("✅ Login successful!");

                    int option;
                    do {
                        System.out.println("\n1. View Products\n2. Add to Cart\n3. View Cart\n4. Checkout\n5. View Orders\n6. Logout");
                        System.out.print("Choose: ");
                        option = sc.nextInt();

                        switch (option) {
                            case 1:
                                shop.showAllProducts();
                                break;
                            case 2:
                                shop.showAllProducts();
                                System.out.print("Enter product ID: ");
                                int id = sc.nextInt();
                                System.out.print("Enter quantity: ");
                                int qty = sc.nextInt();
                                Product product = shop.getProductById(id);
                                if (product != null && product.stock >= qty) {
                                    currentUser.cart.addProduct(product, qty);
                                } else {
                                    System.out.println("❌ Not enough stock or invalid ID.");
                                }
                                break;
                            case 3:
                                currentUser.cart.viewCart();
                                break;
                            case 4:
                                System.out.println("Choose payment: 1. GCash  2. ShopeePay");
                                int payOption = sc.nextInt();
                                PaymentMethod payment;
                                if (payOption == 1) {
                                    payment = new GcashPayment();
                                } else {
                                    payment = new ShopeePayPayment();
                                }
                                currentUser.checkout(payment);
                                break;
                            case 5:
                                currentUser.viewOrders();
                                break; 
                            case 6:
                                System.out.println("👋 Logged out.");
                                break;
                        }
                    } while (option != 6);

                } else {
                    System.out.println("❌ Login failed. Try again.");
                }

            } else if (choice == 3) {
                System.out.println("Exiting app...");
                break;
            }
        }

        sc.close();
    }
}



                    