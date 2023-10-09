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
    }
}
