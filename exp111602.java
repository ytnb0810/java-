package importjava.util.Scanner;
class Person1 {
private String name;
private int age;
public Person1() {
}
public Person1(String name, int age) {
this.name = name;
this.age = age;
}

public String getName() {
return name;
}
public int getAge() {
return age;
}

public void setName(String name) {
this.name = name;
}
public void setAge(int age) {
this.age = age;
}

public String toString() {
return "Person [name=" + name + ", age=" + age + "]";
}
}
class Student1 extends Person1 {
private double score;
public Student1() {
}
public Student1(String name, int age, double score) {
super(name, age);
this.score = score;
}

public double getScore() {
return score;
}

public void setScore(double score) {
this.score = score;
}
public String toString() {
return "Student [name=" + getName() + ", age=" + getAge() + ", score=" + score + "]";
}
}
public class Main1 {
public static void main(String[] args) {
Student1 student = new Student1("Alice", 20, 85.5);

System.out.println("学生信息：" + student);

student.setName("Lijj");
student.setAge(25);
student.setScore(99.0);
System.out.println("修改后的学生信息：" + student);
}
}