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
public class Main {
    public static void main(String[] args) {
        Repository<Product> repository = new Repository<>();
        Product p1 = new Product(1, "Shampoo", 100);
        Product p2 = new Product(2, "Bag", 1000);
        Product p3 = new Product(3, "Door", 10000);
        p3.setId(10);
        List<Product> products = repository.getItem();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        for (Product p : products) {
            System.out.println(p.getId() + " " + p.getName() + " " + p.getPrice());
        }
        //adding another type of data in generic

        Repository<Integer> repository2 = new Repository<>();
        repository2.add(100);
        repository2.add(1000);
        repository2.add(1);
        List<Integer> integers = repository2.getItem();
        for (Integer i : integers) {
            System.out.println(i);
        }
        Main m = new Main();
        List<Integer> v1=new ArrayList<>();
        List<Float> v2=new ArrayList<>();
        // this will throw an error because in generic it is type safe and will take only an type of T which is previously define like in this int
       // m.genericMethod(v1,v2);
        m.genericMethod(v1,v1);
        //but inn wild card it is not type safe
        m.wildCardMethod(v1,v2);

        // to use normal generic method
        m.pair(70.584);
    }
    //Creating Generic Method
    public<T extends Number> void pair(T num){
        T val=num;
        System.out.println("This is an upper Bound type of generic which can contain only numbers and its below subclass"+ val);
        //for lower bound we can use super keyword <T super Number> it will be class name and its above classes parent classes and for extends it will be clas name and below
        // we can also use multi bound like <T extends class & interface1& interface2>  it will allow us to give the structure what we want
    }

    //Difference Between Generic and WildCard

    public <T extends Number> void genericMethod(List<T> source, List<T> target){
        System.out.println(source+" "+target);
    }

    public void wildCardMethod(List<? extends Number> source, List<? extends Number> target){
        System.out.println(source+" "+target);
    }
}
