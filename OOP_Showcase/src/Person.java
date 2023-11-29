import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private int height;
    private double weight;
    
    LeftEye leftEye= new LeftEye("Left Eye", "Normal");
    RightEye rightEye= new RightEye("Right Eye", "Normal");
    Heart heart= new Heart("Heart", "Normal");

    
    static Scanner sc= new Scanner(System.in);
    public Person(String name, int age, int height, double weight) {
        this.name = name;
        this.age = age;
        this.height= height;
        this.weight= weight;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public void setName() {
        System.out.println("Enter name of user :");
        this.name= sc.next();
    }

    public void setAge() {
        System.out.println("Enter age of user (Years) :");
        this.age= sc.nextInt();
    }

    public void setHeight() {
        System.out.println("Enter height of user (Centimeters) :");
        this.height= sc.nextInt();
    }

    public void setWeight() {
        System.out.println("Enter weight of user (Kilograms):");
        this.weight= sc.nextDouble();
    }
    
}
