class Product {

    protected String name;
    protected double price;

    
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    
    void displayInfo() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
    }

    
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}



class Electronics extends Product {

    private String brand;

    
    Electronics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

   
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Brand: " + brand);
    }
}


class Clothing extends Product {

    private String size;

   
    Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Size: " + size);
    }
}



public class OnlineShopping {

    public static void main(String[] args) {

        
        Electronics e = new Electronics(
                "Laptop",
                50000,
                "Dell"
        );

        
        Clothing c = new Clothing(
                "T-Shirt",
                1000,
                "M"
        );

        
        System.out.println("Electronics ");
        e.displayInfo();

        int electronicsQuantity = 2;
        System.out.println(
                "Total Cost for " + electronicsQuantity +
                " items: " +
                e.calculateTotalCost(electronicsQuantity)
        );

        
        System.out.println();

        System.out.println("Clothing ");
        c.displayInfo();

        int clothingQuantity = 3;
        System.out.println(
                "Total Cost for " + clothingQuantity +
                " items: " +
                c.calculateTotalCost(clothingQuantity)
        );
    }
}