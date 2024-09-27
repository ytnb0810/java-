/*class Box{
    private double length;
    private double width;
    private double helight;
    public Box(double x,double y,double z){
        length=x;
        width=y;
        helight=z;
    }
    public double Volume(){
        return length*width*helight;
    }
    public static class xm {
        public static void main(String[] args) {
            Box b=new Box(6,8,10);
            System.out.println(b.Volume());
        }
    }
}
//Point类 编写Point类，有两个属性x、y，一个方法distance(Point p1,Point p2)，计算两者之间的距离。//
// 说明：注意方法参数为引用类型//
class Point {
    private double x;
    private double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public static double distance(Point p1, Point p2) {
        return Math.sqrt((Math.pow(p1.x - p2.x, 2) + Math.pow(p2.y - p1.y, 2)));
    }
    public static class xm {
        public static void main (String[]args){
            Point p1 = new Point(3, 5);
            Point p2 = new Point(6, 9);
            System.out.println(Point.distance(p1, p2));
        }

    }
}
class Flower {
    private String name;
    private String type;
    private String color;
    private double price;
    public Flower(String name, String type, String color, double price){
        this.name = name;
        this.type = type;
        this.color = color;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public String getColor() {
        return color;
    }
    public double getPrice() {
        return price;
    }
}
class exp03 {
    public static void main(String[] args) {
        Flower f1 = new Flower("玫瑰花", "路易十四", "深紫色", 400);
        Flower f2 = new Flower("玫瑰花", "朱丽叶", "淡茶色", 300);
        Flower f3 = new Flower("百合花", "地平线", "花橙色", 450);
        Flower[] arr = new Flower[3];
        arr[0]=f1;
        arr[1]=f2;
        arr[2]=f3;
        for(int i=0;i<arr.length;i++){
            Flower temp=arr[i];
            System.out.println(temp.getName()+","+temp.getType()+","+temp.getColor()+","+temp.getPrice());
        }
    }
}*/
import java.util.ArrayList;
        import java.util.Collections;
        import java.util.Comparator;
        import java.util.HashMap;
        import java.util.Scanner;
        class exp04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n > 50) {
            System.out.print("No more than 50 contacts");
            in.close();
            return ;
        }
        ArrayList<HashMap.Entry<String, String>> list;
        HashMap<String, String> map = new HashMap<>();
        for(int i = 0; i < n; i ++) {
            String [] temp = new String [2];
            temp[0] = in.next();
            if(temp[0].length() > 10) {
                temp[0] = temp[0].substring(0, 10);
            }
            temp[1] = in.next();
            if(temp[1].length() > 10) {
                temp[1] = temp[1].substring(0, 10);
            }
            map.put(temp[0], temp[1]);
        }
        in.close();
        list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Compare());
        for(int i = 0; i < n; i ++) {
            System.out.println(format(list.get(i).getKey()) + format(list.get(i).getValue()));
        }
    }
    static String format(String s) {
        char [] c = new char[12 - s.length()];
        for(int i = 0; i < c.length; i ++) {
            c[i] = '#';
        }
        return String.valueOf(c) + s;
    }
    static class Compare implements Comparator<HashMap.Entry<String, String>> {
        public int compare(HashMap.Entry<String, String> o1, HashMap.Entry<String, String> o2) {
            int temp = o1.getKey().compareTo(o2.getKey());
            if (temp > 0) {
                return 1;
            } else if (temp == 0) {
                return 0;
            } else {
                return -1;
            }
        }
    }
}
class Student {
    private String name;
    private int age;
    public Student() {
    }
    public Student(String n) {
        name = n;
        System.out.println("调用了一个参数的构造方法");
    }
    public Student(String n, int a) {
        name = n;
        age = a;
        System.out.println("调用了两个参数的构造方法");
    }
    public void read() {
        System.out.println("我是：" + name + "，年龄：" + age);
    }
}
class exp05 {
    public static void main(String[] args) {
        Student stu1 = new Student("张三");
        Student stu2 = new Student("张三", 18);
        stu1.read();
        stu2.read();
    }
}
