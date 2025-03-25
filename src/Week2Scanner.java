import java.util.Scanner;
public class Week2Scanner {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Ender your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);

        scanner.close();
    }
}
