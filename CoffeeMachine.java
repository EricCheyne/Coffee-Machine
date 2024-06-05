package machine;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {
        final int WATER_PER_CUP = 200;
        final int MILK_PER_CUP = 50;
        final int COFFEE_BEANS_PER_CUP = 15;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Write how many ml of water the coffee machine has: ");
        int water = scanner.nextInt();

        System.out.print("Write how many ml of milk the coffee machine has: ");
        int milk = scanner.nextInt();

        System.out.print("Write how many grams of coffee beans the coffee machine has: ");
        int coffeeBeans = scanner.nextInt();

        System.out.print("Write how many cups of coffee you will need: ");
        int cupsNeeded = scanner.nextInt();

        int maxCupsWater = water / WATER_PER_CUP;
        int maxCupsMilk = milk / MILK_PER_CUP;
        int maxCupsCoffeeBeans = coffeeBeans / COFFEE_BEANS_PER_CUP;

        int maxCups = Math.min(maxCupsWater, Math.min(maxCupsMilk, maxCupsCoffeeBeans));

        if (maxCups == cupsNeeded) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (maxCups > cupsNeeded) {
            int extraCups = maxCups - cupsNeeded;
            System.out.println("Yes, I can make that amount of coffee (and even " + extraCups + " more than that)");
        } else {
            System.out.println("No, I can make only " + maxCups + " cup(s) of coffee");
        }

        scanner.close();
    }
}
