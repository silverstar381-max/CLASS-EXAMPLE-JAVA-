public class Student {
    // Fields (variables)
    String name;
    int age;

    // Method
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method
    public static void main(String[] args) {
        // Create object
        Student s1 = new Student();

        // Assign values
        s1.name = "John";
        s1.age = 16;

        // Call method
        s1.displayInfo();
    }
}