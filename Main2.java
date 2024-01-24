import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        String msg = "I'm happy today.";
        int a = 150;
        int o = 0226;
        int h = 0x96;
        double d = 10;
        System.out.println(msg+" "+a);
        System.out.println(o+" "+h+ " "+d);

        
	
        Scanner scanner = new Scanner(System.in);
        System.out.print("kedvenc zenéd: ");
        String name_zene = scanner.nextLine();

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("kedvenc ételed: ");
        String name_etel = scanner1.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("kedvenc hobbid: ");
        String name_hobbi = scanner2.nextLine();

        Scanner scanner3 = new Scanner(System.in);
        System.out.print("kedvenc filmed: ");
        String name_film = scanner3.nextLine();

        Scanner scanner4 = new Scanner(System.in);
        System.out.print("kedvenc uticélod: ");
        String name_cel = scanner4.nextLine();

        System.out.println("kedvenc zenéd: "+name_zene);
        System.out.print("kedvenc ételed: "+name_etel+", "+"kedvenc hobbid: "+name_hobbi);
        System.out.println("kedvenc filmed: "+name_film);
        System.out.println("kedvenc uticélod: "+name_cel);


    }
}