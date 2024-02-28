import java.util.Scanner;;
public class Dolgozat3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("kérek egy számot 10 és 90 között:");
        int num = sc.nextInt();
        if(num < 10 || num > 90){
            System.out.println(num + "nem helyes");
        }
        else{
            if(num / 3 == 0){
                System.out.print("Fizz");
            };
            if(num / 5 == 0){
                System.out.print("Buzz");
            };
            if(num / 5 == 0 || num / 3 == 0){
                System.out.print("Fizz Buzz");
            };
            if(num / 5 != 0 || num / 3 != 0){
                System.out.println(num);
            };
        }
        
    }
        
}