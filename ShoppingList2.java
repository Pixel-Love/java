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
        else{
            System.out.println("no");
        }
        if (banana == false) {
            System.out.println("no");
        }
        else{
            System.out.println("yes");
        }

    }
