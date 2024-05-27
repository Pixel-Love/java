import java.lang.reflect.Array;
import java.util.Dictionary;
import java.util.List;

public class DataStructuresDolgozat {

    public static void main(String[] args) {

        // Hozz létre egy változót, mely fővárosok neveit tárolja.
        // 1 pont

        List<String> Varos_nevek = new List<String>() {};

        // Tartalmazza az alábbi adatokat: "Wien", "Budapest", "Prag", "Bratislava"
        // 2 pont
        
        Varos_nevek.add("Wien");
        Varos_nevek.add("Budapest");
        Varos_nevek.add("Prag");
        Varos_nevek.add("Bratislava");

        // Írasd ki a fővárosokat!
        // 1 pont

        System.out.println(Varos_nevek);

        // Add hozzá a "Ljubljana", "Sarajevo" és "Zagreb" értékeket a fővásrosok listájához
        // az ujElemHozzaadasa() metódussal
        // 3 pont
        ujElemHozzaadasa(Varos_nevek);
        // Írasd ki a fővárosokat!
        // 1 pont
        System.out.println(Varos_nevek);

        // Írasd ki a fővárosokat!
        // 1 pont
        Varos_nevek.clear();

        // Hozz létre egy változót, mely főváros, ország párokat tartalmaz.
        // 1 pont

        Dictionary<String, String> Varos_parok = new Dictionary<String,String>() {
            
        };

        // A tartalma a főváros, ország pároknak a következő legyen:
        // "Wien", "Österreich"
        // "Budapest", "Magyarország"
        // "Ljubljana", "Slovenija"
        // 3 pont
        Varos_parok.put("Wien", "Österreich");
        Varos_parok.put("Budapest", "Magyarország");
        Varos_parok.put("Ljubljana", "Slovenija");

        // Írasd ki a főváros, ország párokat!
        // 1 pont
        for(int i = 0; i< 3;i++){
            System.out.println(Varos_parok);
        }

        fovarosOrszaga("Budapest");
        fovarosOrszaga("Zagreb");
    }
    public static void ujElemHozzaadasa(List<String> Varos_nevek){
        Varos_nevek.add("Ljubljana");
        Varos_nevek.add("Sarajevo");
        // Írad ki a fovarosOrszaga() metódussal, hogy mely ország fővárosa "Zagreb"
        // 1 pont
        Varos_nevek.add("Zagreb");

    }

        // Töröld a fővárosok listából "Sarajevo" elemet a torolElemet() metódussal
        // 1 pont
    public static List torolElemet(List<String> Varos_nevek){
        Varos_nevek.remove("Sarajevo");
    }


        // Írad ki a fovarosOrszaga() metódussal, hogy mely ország fővárosa "Budapest"
        // 1 pont
    public String fovarosOrszaga(Dictionary<String, String> Varos_parok){
        if(Varos_parok.keys().equals(e)){
            System.out.println(Varos_parok.Value);
        }

    }

   


        // Az ujFovarosOrszagPar() metódussal add hozzá a "Zagreb", "Hrvatska" párt a fővárosok országok párokhoz
        // 1 pont
    public static Dictionary ujFovarosOrszagPar(Dictionary<String, String> Varos_parok){
        Varos_parok.put("Zagreb", "Hrvatska");
    }


        // A torolAdatPart() metódussal törld a "Ljubljana" főváros ország párt
        // 1 pont
    public static Dictionary torolAdatPart(Dictionary<String, String> Varos_parok){
        
        Varos_parok.remove("Ljubljana");
    }


        // A torolAdatPart() metódussal törld a "Prag" főváros ország párt
        // kezeld a felmerülő hibát és írd ki a hibát
        // 3 pont
    public static Dictionary torolAdatPart(){
        
        try {
            Varos_parok.remove("Prag");
        } catch (Exception e) {
            System.out.println("hiba, nem lehet törölni");
        }
    }

        // Írasd ki a főváros, ország párokat!
        // 1 pont

};

    /**
     * ujElemHozzaadasa() - egy elemet ad hozzá a megadott listához
     * @param list a lista, melyhez hozzá kell adni az elemet
     * @param elem az új elem
     */
    // 3 pont
    public static List ujElemHozzaadasa(List<String> list, String elem){

    }


    /**
     * torolElemet() - a megadott listából törli a megadott elemet
     * @param list a lista, melyből törölni kell az elemet
     * @param elem a törlendő érték
     */
    // 3 pont


    /**
     * fovarosOrszaga() - a megadott főváros, ország párok és főváros adatokra visszaadja az osztágot és a fővárost,
     * vagy visszaadja, hogy az adott főváros nincs az adatai között.
     * @param countries a főváros ország párok
     * @param capital a főváros
     * @return "country fővárosa capital", ha a párok között szerepel a főváros, egyébként
     * capital nincs az adatok között.
     * Példa:
     * England fővárosa London.
     * London nincs az adatok között.
     */
    // 3 pont


    /**
     * ujFovarosOrszagPar() - A coutries-hoz hozzáadja a főváros ország (capital country) párt.
     * @param coutries a főváros ország párok
     * @param capital a főváros neve
     * @param country az ország neve
     */
    // 3 pont


    /**
     * A coutries főváros ország adatpárok közül törli a capital főváros ország adatpárt, ha szerepel benne.
     * Ha nem szerepel benne, akkor "Nincs " + capital + " főváros az adatok között" hibát dob.
     * @param coutries a főváros ország adatpárok
     * @param capital a főváros neve
     * @throws IllegalArgumentException
     */
    // 5 pont


}
