//1) Write a Java program to create a class called "Student" with name and rollNumber attributes. Create two instances, set attributes using a constructor, and print their values

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