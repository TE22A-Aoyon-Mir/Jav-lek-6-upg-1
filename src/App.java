import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //a
        System.out.println("Del a");
        Scanner t = new Scanner(System.in);
        System.out.println("Ange tal1: ");
        int tal1 = t.nextInt();
        System.out.println("Ange tal2: ");
        int tal2 = t.nextInt();
        System.out.println("tal1=tal2 är: ");
        System.out.println(tal1==tal2);
        System.out.println("tal1<tal2 är: ");
        System.out.println(tal1<tal2);
        System.out.println("tal1>tal2 är: ");
        System.out.println(tal1>tal2);

        //b
        System.out.println("Del b");
        int[] fält = new int[3];
        fält[0] = 4;
        fält[1] = 5;
        fält[2] = 2;
        System.out.println("fält[0]>fält[2] är: ");
        System.out.println(fält[0]>fält[2]);
        System.out.println("fält[0]<fält[1] är: ");
        System.out.println(fält[0]<fält[1]);
        System.out.println("fält[0]==fält[2] är: ");
        System.out.println(fält[0]==fält[2]);
    }
}
