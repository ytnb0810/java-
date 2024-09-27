/*import java.util.*;

class liu1 {

    static Scanner sc = new Scanner(System.in);

    static public void main(String[] args) {
        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
        System.out.println(x + y + z);
        double ans = (x + y + z) / 3.0;
        System.out.printf("%.2f", ans);
    }
}

    import java.util.*;
    class liu2{

        static Scanner sc = new Scanner(System.in);

        static public void main(String[] args) {
            double s = sc.nextDouble(), t;
            int cmd = (int) s / 1000;
            switch (cmd) {
                case 0:
                    t = 0;
                    break;
                case 1:
                    t = 0.1;
                    break;
                case 2:
                    t = 0.15;
                    break;
                case 3:
                    t = 0.2;
                    break;
                default:
                    t = 0.25;
                    break;
            }
            System.out.printf("%.2f", s * (1 - t));
        }
    }
import java.util.*;

class liu3 {

    static Scanner sc = new Scanner(System.in);

    static public void main(String[] args) {
        double s = sc.nextDouble();
        System.out.println(Math.round(s));
    }
}
import java.util.*;

class liu4{

    static Scanner sc = new Scanner(System.in);

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static public void main(String[] args) {
        int s = sc.nextInt();
        System.out.println(isPrime(s) ? "1" : "0");
    }
}*/
import java.util.*;

class liu4 {

    static Scanner sc = new Scanner(System.in);

    static public void main(String[] args) {
        int s = sc.nextInt();

        for (int i = 1; i <= s; i += 2) {
            for (int j = 1; j <= s - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
