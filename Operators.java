import java.util.Scanner;

public class Operators{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("kérek egy strinet: ");
        String Mystring = sc.next();
        
        System.out.println("Kérek egy karaktert: ");
        char myCharacter = sc.next().charAt(0);

        System.out.println("Kérek egy másik karaktert: ");
        char myCharacter2 = sc.next().charAt(0);

        System.out.println("Kérek egy intigert: ");
        int myInteger = sc.nextInt();

        System.out.println("Kérek egy másik intigert: ");
        int myInteger2 = sc.nextInt();

        System.out.println("Kérek egy doublet: ");
        double myDouble = sc.nextDouble();

        System.out.println("Kérek egy másik doublet: ");
        double myDouble2 = sc.nextDouble();

        sc.close();

        System.out.println(Mystring + myCharacter + myCharacter2);
        System.out.println(myInteger/myInteger2);
        System.out.println(myDouble + myDouble2);
        System.out.println(myInteger - myDouble);
        System.out.println(myInteger2 * myDouble2);
    }
    
}