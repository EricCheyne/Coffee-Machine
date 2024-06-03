package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        String operation = """
                Starting to make a coffee
                Grinding coffee beans
                Boiling water
                Mixing boiled water with crushed coffee beans
                Pouring coffee into the cup
                Pouring some milk into the cup
                Coffee is ready!""";
        System.out.println(operation);

        System.out.println("Write how many cups of coffee you will need: ");
        Scanner scanner = new Scanner(System.in);
        int drinks = scanner.nextInt();

        int water = 200;
        int milk = 50;
        int beans = 15;

        int totalWater = drinks * water;
        int totalMilk = drinks * milk;
        int totalBeans = drinks * beans;

        System.out.println(totalWater + " ml of water");
        System.out.println(totalMilk + " ml of milk");
        System.out.println(totalBeans + " g of coffee beans");

        scanner.close();
    }
}