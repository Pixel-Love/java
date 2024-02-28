import java.util.Scanner;;
public class Dolgozat2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("kérek egy számot:");
        int num = sc.nextInt();
        double number = Math.sqrt(num) * Math.PI;
        System.out.printf("The triangle area" +Math.round(number));
        System.out.println("Rounded area:" + Math.ceil(num));
    }
}