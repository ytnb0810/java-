//用数组来存储学生成绩，数组的长度和成绩均由键盘输入，
// 使用冒泡法排序进行降序排列并输出。
package Absttact;
abstract class Shape {
    public abstract double perimeter();
}
class Circle<define> extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}
public class exp1116 {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        Rectangle rectangle = new Rectangle(2, 3);

        double circlePerimeter = circle.perimeter();
        System.out.println("圆周长为: " + circlePerimeter);

        double rectanglePerimeter = rectangle.perimeter();
        System.out.println("矩形周长为: " + rectanglePerimeter);
    }
}
