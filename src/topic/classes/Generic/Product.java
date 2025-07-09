package topic.classes.Generic;
/*building a small ORM-like system. Create a generic class Repository<T> to simulate saving and retrieving data.
Requirements:
Repository<T> should have:
    A list of T items.
    void add(T item) method.
    List<T> getAll() method.
Create a class Product with fields: id, name, price.
In main(), create a Repository<Product> and add 2–3 products, then print them.
*/

public class Product {
    private int id;
    private String name;
    private int price;
    Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
