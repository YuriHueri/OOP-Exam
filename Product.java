import java.util.*;
// inheritance
public class Product {
    //4 products
    public static String[][] products = {null,
            {"1. Spicy Sriracha Chicken (Php 75)"},
            {"2. Corndog (Pph 39)"},
            {"3. Big Bite (Php 35)"},
            {"4. Gulp (Php 23)"}
    };
    //Price of products
    public static int[] prices = {0, 75, 39, 35, 23};
    //Cart for checkout
    public static int[] final_qty = new int[5];

    public static void main() {
        Scanner r = new Scanner(System.in);
        int choose, quantity;
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        char decision;
        System.out.println("-----------------------");
        do {

            for (String[] product : products) {
                if (product != null)
                    System.out.println(Arrays.toString(product));
            }
            // starting input to order
            System.out.print("Please type the number of the item that you would like to order: ");
            choose = r.nextInt();

            System.out.print("How many pieces?: ");
            quantity = r.nextInt();

            switch (choose) {
                case 1 -> {
                    p1 += quantity;
                    final_qty[1] = p1;
                }
                case 2 -> {
                    p2 += quantity;
                    final_qty[2] = p2;
                }
                case 3 -> {
                    p3 += quantity;
                    final_qty[3] = p3;
                }
                case 4 -> {
                    p4 += quantity;
                    final_qty[4] = p4;
                }
            }
            //do while usage
            System.out.print("Would you like to order again? type y or n: ");
            decision = r.next().charAt(0);
        } while (decision != 'n' && decision != 'N');
        System.out.println("-----------------------");
        System.out.println("Final Cart");
        System.out.println("\t\\ Item \t\\ Quantity \t\\ Total");
        System.out.println("-----------------------");
        int sum = 0;
        for (int i = 0; i < final_qty.length; i++) {
            if (final_qty[i] != 0) {
                System.out.println(Arrays.toString(products[i]) + "\\" + final_qty[i] + "\\" + final_qty[i] * prices[i]);
                sum = sum + final_qty[i] * prices[i];
            }
        }
        System.out.println("Total quantity of chosen items: " + (p1 + p2 + p3 + p4) + " items");
        System.out.println("Total price of allocated orders: Php " + sum);
        int payment;
        do {
            System.out.print("Please enter payment: ");
            payment = r.nextInt();
        } while (sum > payment);
        System.out.println("Thank you for buying at 7-Eleven! \nHere's your change, have a nice day!: Php " + (payment - sum));

    }
}
