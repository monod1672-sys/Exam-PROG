/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.localcompany;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Localcompany {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

     String[] productNames = {
         "Cozy Nights Monarch mattress",
         "Restonic Barbados mattress",
         "Sealy Phuket mattress"
         };

    int[][] monthlySales = new int[3][3];

        String[] months = {
        "month 1",
        "month 2",
         "month 3"
};

        for (int i = 0; i < productNames.length; i++) {
        for (int j = 0; j < months.length; j++) {

while (true) {

    System.out.print(
        "Enter number of sales for "
        + months[j] + " for "
        + productNames[i] + ": "
        );

    if (input.hasNextInt()) {
    int sales = input.nextInt();

    if (sales >= 0) {
        monthlySales[i][j] = sales;
break;

} else {
       System.out.println(
       "Please enter a positive number."
     );
}

} else {

       System.out.println(
      "Invalid input. Please enter a whole number."
      );

input.next();
   }
  }
}

           System.out.println();
}

        Product product = new Product(
        productNames,
        monthlySales
        );

    PrintProduct report = new PrintProduct(product);

    report.PrintSalesReport();

input.close();
}
}