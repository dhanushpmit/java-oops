//1 Write a Java program to create a class called "Student" with name and rollNumber attributes. Create two instances, set attributes using a constructor, and print their values

class Student {
    private String name;
    private int rollNumber;
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    void getName() {
        System.out.println(name);
    }
    void getRollNumber() {
        System.out.println(rollNumber);
    }
    void setName(String name) {
        this.name = name;
    }
    void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}
class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101);
        Student s2 = new Student("Bob", 102);

        s1.getName();
        s2.getName();
        s1.getRollNumber();
        s2.getRollNumber();

        s2.setName("Charlie");
        s2.getName();
    }
}


//2 Write a Java program to create a class called "Book" with title and author attributes. Modify the attributes using setter methods and print the updated values

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void getTitle() {
        System.out.println(title);
    }

    void getAuthor() {
        System.out.println(author);
    }

    void setTitle(String title) {
        this.title = title;
    }

    void setAuthor(String author) {
        this.author = author;
    }
}

class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "John Doe");
        Book b2 = new Book("Python Guide", "Jane Smith");

        b1.getTitle();
        b2.getTitle();
        b1.getAuthor();
        b2.getAuthor();

        b2.setTitle("Advanced Python");
        b2.getTitle();
    }
}

//Write a Java program to create a class called "Laptop" with brand and price attributes. Modify the attributes using setter methods and print the updated values.

class Laptop {
    private String brand;
    private double price;

    public Laptop(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    void getBrand() {
        System.out.println(brand);
    }

    void getPrice() {
        System.out.println(price);
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setPrice(double price) {
        this.price = price;
    }
}

class Main {
    public static void main(String[] args) {
        Laptop l1 = new Laptop("Dell", 75000);
        Laptop l2 = new Laptop("HP", 60000);

        l1.getBrand();
        l2.getBrand();
        l1.getPrice();
        l2.getPrice();

        l2.setPrice(65000);
        l2.getPrice();
    }
}

