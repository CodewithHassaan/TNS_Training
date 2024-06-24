import java.util.Scanner;

public class AssignmentMain {

    // program to demstrate scanner class
    public static void main(String args[]) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String name, city;
        int id;
        System.out.println("enter the id");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("enter the name");
        name = sc.nextLine();
        System.out.println("enter the city");
        city = sc.nextLine();

        System.out.println("print all" + id + " " + name + " " + city);
    }

}