import java.util.LinkedList;

/**
 * Linked_List
 */
// public class Linked_List {

    // public static void main(String[] args) {
    //     LinkedList<String> cars = new LinkedList<>();

    //     cars.add("Volvo");
    //     cars.add("BMW");
    //     cars.add("Ford");
    //     cars.add("Mazda");
    //     System.out.println(cars);

    //     String car = cars.get(2);
    //     System.out.println(car);

    //     car = cars.getFirst();
    //     System.out.println(car);

    //     car = cars.peek();
    //     System.out.println(car);

    //     car = cars.getLast();
    //     System.out.println(car);

    //     cars.addFirst("Skoda");
    //     System.out.println(cars);

    //     cars.removeFirst();
    //     System.out.println(cars);

    //     cars.removeLast();
    //     System.out.println(cars);

    //     cars.remove("BMW");
    //     System.out.println(cars);

    //     boolean answer = cars.contains("Volvo");
    //     System.out.println(answer);
    // }
    public class ShoppingList {
    //We are going to represent a shopping list by a list containing strings.
    //
    //Create a linked list with the following items:
    // eggs, milk, fish, apples, bread and chicken
    //Create an application which prints out the answers to the following questions:
    // - Do we have milk in the shopping list? (yes/no)
    // - Do we have bananas in the shopping list? (yes/no)
    //The full output of your main method should be the following:
    //
    //yes
    //no
    //
    // The question have to be a method.
    public static void main(String[] args) {
        LinkedList <String> shoppingList = new LinkedList<>();

        shoppingList.add("eggs");
        shoppingList.add("milk");
        shoppingList.add("fish");
        shoppingList.add("apples");
        shoppingList.add("bread");
        shoppingList.add("chicken");

    }
    public String eldontendo(LinkedList <String> shoppList){
        boolean milk = shoppingList.contains("milk");
        boolean banana = shoppingList.contains("banana");
        
        if (milk == true) {
            System.out.println("yes");
        }
        if (banana == false) {
            System.out.println("no");
        }
        else{
            
        }

    }
        


}
