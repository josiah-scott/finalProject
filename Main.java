package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
	    ArrayList<String> products = new ArrayList<String>();
        ArrayList<Double> prices = new ArrayList<Double>();

        products.add("Red-Hot Spicy Doritos");
        products.add("Cool Ranch Doritos");
        products.add("Coke");
        products.add("Diet Coke");
        products.add("Pepsi");
        products.add("Five Hour Energy");
        products.add("Sunflower Seeds");
        products.add("Peanuts");
        products.add("Mac Book Chargers");
        products.add("Dell Chargers");

        prices.add(2.99);
        prices.add(2.99);
        prices.add(0.99);
        prices.add(0.99);
        prices.add(0.99);
        prices.add(3.99);
        prices.add(0.99);
        prices.add(0.99);
        prices.add(120.00);
        prices.add(50.00);

        Scanner keyboard = new Scanner(System.in);

        double totalCost = 0;

        double itemCost = 0;

        double grandTotal = 0;

        ArrayList<String> purchases = new ArrayList<String>();

        ArrayList<Double> totals = new ArrayList<Double>();

        int a = 1;

        int b = 1;

        while(b == 1)
        {
        System.out.println("What is your first name?");

        String name = keyboard.nextLine();

        while(a == 1) {
            System.out.println("What item would you like to see the price of?");

            String item = keyboard.nextLine();

            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).equals(item)) {
                    itemCost = prices.get(i);
                    totalCost = itemCost + totalCost;
                    System.out.println(itemCost);
                    purchases.add(products.get(i));
                }
            }

            System.out.println("Are you done purchasing items?");

            String answer = keyboard.nextLine();

            if (answer.equals("yes") || answer.equals("Yes")) {
                a = 0;
                System.out.println("Name: " + name);
                System.out.println("Items Purchased: ");
                for (int i = 0; i < purchases.size(); i++) {
                    System.out.println(purchases.get(i));
                }
                System.out.println("Your total cost was: " + Math.round(totalCost * 100.0) / 100.0);

                totals.add(totalCost);

                System.out.println("Is the store closed?");

                String isClosed = keyboard.nextLine();

                if(isClosed.equals("yes") || isClosed.equals("Yes"))
                {
                    for(int i = 0; i < totals.size(); i++)
                    {
                        grandTotal = totals.get(i) + grandTotal;
                    }

                    System.out.println("The grand total for the day was: " + Math.round(grandTotal * 100.0) / 100.0);
                    b = 0;

                }
                if(isClosed.equals("no") || isClosed.equals("No"))
                {
                    a = 1;
                }
            }
        }
        }
    }
}
