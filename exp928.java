//1.Arrays 类的 copyOf() 方法
/*import java.util.Arrays;
public class exp928 {
    public static void main(String[]  args) {
        int srcArray[]={1,2,3};
        int a[] =Arrays.copyOf(srcArray, 3);
        System.out.println(Arrays.toString(a));
        //Arrays.copyOf(dataType[] srcArray,int length);
        //srcArray 表示要进行复制的数组，length 表示复制后的新数组的长度。

    }
}*/
//2.clone 方法
/*import java.util.Arrays;
public class exp928{
    public static void main(String[]  args) {
        int[] a1 = {1, 3};
    int[] a2 = a1.clone();
        System.out.println(Arrays.toString(a2));
    }
}*/
//3.System.arraycopy方法
/*import java.util.Scanner;
public class exp928 {
    public static class ArrayCopy {
        public static void main(String[] args) {
            int[] array1 = { 1, 2, 3, 4, 5 };
            int[] array2 = new int[array1.length];
            System.arraycopy(array1, 0, array2, 0, array1.length);
            for (int i = 0; i < array2.length; i++) {
                System.out.print(array2[i] + ",");
            }
        }
    }
}
//4.循环
//第二题
import java.util.Scanner;
class exp92802 {
    public static class ArrayCopy {
        public static void main(String[] args) {
            int[] array1 ={1,2,3,4,5};
            int[] array2 = new int[array1.length];
            for (int i = 0; i < array1.length; i++) {
                array2[i] = array1[i];
                System.out.print(array2[i] + ",");
            }
        }
    }
}
//第三题
/*import java.util.Arrays;
class exp92803{
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name[] = new String[100];
        int score[] = new int[100];
        int n;
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            name[i] = sc.next();
            score[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                if (score[j] > score[i]) {
                    int temp = score[i];
                    score[i] = score[j];
                    score[j] = temp;
                    String temp1 = name[i];
                    name[i] = name[j];
                    name[j] = temp1;
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.printf("%15s %5d\n", name[i], score[i]);
        }
    }
}
//第四题
import java.util.Scanner;
import java.util.Arrays;
class exp92804 {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), n2;
        int a[] = new int[10000];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        n2 = sc.nextInt();
        for (int i = n; i < n + n2; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a, 0, n + n2);
        for (int i = 0; i < n + n2; i++)
            System.out.print(a[i] + " ");
    }
}*/
//第五题
import java.util.*;
class exp92805 {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean[] vis = new boolean[100];
        int[] a = new int[10];
        int pos = 0;
        for (int i = 1; i <= 7; i++) {
            int x = rand.nextInt(29);
            x += 1;
            while (vis[x]) {
                x = rand.nextInt(29);
                x += 1;
            }
            a[pos++] = x;
            vis[x] = true;
        }
        Arrays.sort(a, 0, 6);
        for (int i = 0; i < 7; i++) {
            System.out.print(a[i] + " ");
        }
    }
}






