//Author : Jayendra Matarage

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("BILL SYSTEM WITH ARRAYS");
        System.out.println("Enter item count : ");
        int item_count = Integer.parseInt(scanner.nextLine());
        String[][] data = new String[item_count][4];


        for (int item = 0; item < data.length; item++) {

            System.out.print("Enter item Name : ");
            String item_name = scanner.nextLine();
            data[item][0] = item_name;

            System.out.print("Enter item Quantity : ");
            String item_quan = scanner.nextLine();
            data[item][1] = item_quan;

            System.out.print("Enter item Price : ");
            String price = scanner.nextLine();

            data[item][2] = price;
            data[item][3] = Integer.toString((Integer.parseInt(item_quan) * Integer.parseInt(price)));


            System.out.println("Enter new item (Y)yes or (N)o");
            String choice = scanner.nextLine();

            if (choice.equals("N")) {
                print_bill(data);
            }
        }
    }

    private static void print_bill(String[][] bill_information) {
        int total = 0;
        System.out.println("|\tItem name\t|\tItem Quantity\t|\tItem price\t|\tTotal\t|");
        for (int x = 0; x < bill_information.length; x++) {
            System.out.println("|\t" + bill_information[x][0] + "\t|\t" + bill_information[x][1] + "\t|\t" + bill_information[x][2] + "\t|\t" + bill_information[x][3] + "\t|");
            total = total + Integer.parseInt(bill_information[x][3]);
        }
        System.out.println("|\tTotal : " + total + "\t|");
    }
}
