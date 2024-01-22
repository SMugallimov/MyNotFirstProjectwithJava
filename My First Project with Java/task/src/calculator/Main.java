package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bubblegum = 202;
        int toffee = 118;
        int iceCream = 2250;
        int milkChocolate = 1680;
        int doughnut = 1075;
        int pancake =  80;
        int income = bubblegum + toffee + iceCream + milkChocolate + doughnut +
                pancake;
        System.out.println("Earned amount:");
        System.out.printf("Bubblegum: $%d", bubblegum);
        System.out.printf("\nToffee: $%d", toffee);
        System.out.printf("\nIce cream: $%d", iceCream);
        System.out.printf("\nMilk chocolate: $%d", milkChocolate);
        System.out.printf("\nDoughnut: $%d", doughnut);
        System.out.printf("\nPancake: $%d", pancake);
        System.out.println();
        System.out.printf("\nIncome: $%d", income);
        System.out.println();
        System.out.println("Staff expenses: ");
        int staffExpenses = scanner.nextInt();
        System.out.println("Other expenses: ");
        int otherExpenses = scanner.nextInt();
        int netIncome = income - staffExpenses - otherExpenses;
        System.out.printf("Net income: $%d", netIncome);
    }
}