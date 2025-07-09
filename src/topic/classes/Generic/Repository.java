package topic.classes.Generic;

import java.util.ArrayList;
import java.util.List;

/*building a small ORM-like system. Create a generic class Repository<T> to simulate saving and retrieving data.
Requirements:
Repository<T> should have:
    A list of T items.
    void add(T item) method.
    List<T> getAll() method.
Create a class Product with fields: id, name, price.
In main(), create a Repository<Product> and add 2–3 products, then print them.
*/
public class Repository<T> {
    private List<T> item;
    public Repository() {
        item = new ArrayList<T>();
    }
    public void add(T item) {
        this.item.add(item);
    }
    public List<T> getItem() {
        return item;
    }
}
