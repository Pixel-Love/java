import java.util.scanner;
public class Stringek{
    public static void main(String[]args){
        Scanner sc = new Scanner(System in);
        System.out.println("Vezetékneved: ");
        String vezetek =sc.next();

        System.out.println("Keresztneved: ");
        String kereszt =sc.next();

        System.out.println("Születési Városod: ");
        String varos =sc.next();

        System.out.println("Életkorod: ");
        int kor =sc.next();

        String fullname = vezetek.concat(kereszt);
        println(fullname.toUpperCase());
        println(fullname.indexOf(kereszt);)
        println(fullname.toLowerCase()+", "+varos.toLowerCase());
        println( kor+" "+fullname+" "+varos);
        println(kereszt.startsWith("A"));
        println(vezetek.endsWith("t"));
        println(fullname.lenght);
        println(fullname.replaceAll("i", "y"));
        
    }
}