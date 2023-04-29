package pl.coderslab.oop.methods;

public class Main02 {

    public static void main(String[] args) {
        Product product = new Product();
        product.setName("product01");
        System.out.println(product.getName());

        Person person = new Person();
        person.setAge(12);
        person.setGender('M');
        person.setName("Wojtek");
        person.setSurname("eS");
        System.out.println(person.getAge());
        person.increaseAge();
        System.out.println(person.getAge());

        Car car = new Car();
        car.brand = "VV";
        car.model = "golf";
        car.price = 10000;
        System.out.println(car);
    }
}
