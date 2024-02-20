import java.util.Random;

public class Matek {
    public static void main(String[] args) 
    {
        Random rand = new Random();
        double rand_int1 = rand.nextInt(201);
        double rand_int2 = rand.nextInt(201);
        if(rand_int1 > rand_int2){
            System.out.println(rand_int1 + " nagyobb" + rand_int2 + "kisebb");
        }
        else{
            System.out.println(rand_int2 + " nagyobb" + rand_int1 + "kisebb");
        }
        System.out.println(Math.sqrt(rand_int1));
        System.out.println(Math.sqrt(rand_int2));
        System.out.println(rand_int1 - rand_int2 * 1);
        System.out.println(rand_int1 * rand_int1);
        System.out.println(rand_int2 * rand_int2);
        System.out.println(Math.round(rand_int1 / rand_int2));
        System.out.println(Math.ceil(rand_int1 / rand_int2));
        System.out.println(Math.floor(rand_int1 / rand_int2));

    }
}