package machine;
import java.util.Scanner;
public class CoffeeMachine {

    static int water = 400;
    static int milk = 540;
    static int coffee = 120;
    static int cups = 9;
    static int pare = 550;
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        String akcija = "";

        while (!akcija.equals("exit")) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            akcija = s.next();
            if (akcija.equals("buy")) {
                buy();
            }
            if (akcija.equals("fill")) {
                fill();
            }
            if (akcija.equals("take")) {
                take();
            }
            if (akcija.equals("remaining")) {
                remaining();
            }
        }
    }

    private static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String a = s.next();
        switch (a) {
            case "1": {
                if (water < 250) {
                    System.out.println("Sorry, not enough water!");
                }
                else if (coffee < 16) {
                    System.out.println("Sorry, not enough coffee!");
                }
                else if ( cups < 1){
                    System.out.println("Sorry, not enough cups!");
                }
                else {
                    System.out.println("I have enough resources, making you a coffee!");
                    water = water - 250;
                    coffee = coffee - 16;
                    cups = cups - 1;
                    pare = pare + 4;
                }
                break;
            }
            case "2": {
                if (water < 350) {
                    System.out.println("Sorry, not enough water!");
                }
                else if (milk < 75) {
                    System.out.println("Sorry, not enough milk!");
                }
                else if (coffee < 20) {
                    System.out.println("Sorry, not enough coffee!");
                }
                else if ( cups < 1){
                    System.out.println("Sorry, not enough cups!");
                }
                else {
                    System.out.println("I have enough resources, making you a coffee!");
                    water = water - 350;
                    milk = milk - 75;
                    coffee = coffee - 20;
                    cups = cups - 1;
                    pare = pare + 7;
                }
                break;
            }
            case "3": {
                if (water < 200) {
                    System.out.println("Sorry, not enough water!");
                }
                else if (milk < 100) {
                    System.out.println("Sorry, not enough milk!");
                }
                else if (coffee < 12) {
                    System.out.println("Sorry, not enough coffee!");
                }
                else if ( cups < 1){
                    System.out.println("Sorry, not enough cups!");
                }
                else {
                    System.out.println("I have enough resources, making you a coffee!");
                    water = water - 200;
                    milk = milk - 100;
                    coffee = coffee - 12;
                    cups = cups - 1;
                    pare = pare + 6;
                }
                break;
            }
            case "back": {
                return;
            }
            default:
                throw new IllegalStateException("Unexpected value: " + a);
        }
    }

    private static void fill() {
        System.out.println("Write how many ml of water you want to add:");
        int addwater = s.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        int addmilk = s.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        int addcoffee = s.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add:");
        int addcups = s.nextInt();

       /* System.out.println("The coffee machine has:");
        System.out.println((water = water + addwater) + " ml of water");
        System.out.println((milk = milk + addmilk) + " ml of milk");
        System.out.println((coffee = coffee + addcoffee) + " g of coffee beans");
        System.out.println((cups = cups + addcups) + " disposable cups");
        System.out.println("$" + pare + " of money");
        */
        water = water + addwater;
        milk = milk + addmilk;
        coffee = coffee + addcoffee;
        cups = cups + addcups;

    }

    private static void take() {

        System.out.println("I gave you $" + pare);
        pare = 0;
    }

    private static void remaining() {

        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffee + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println(pare + " of money");
    }
}