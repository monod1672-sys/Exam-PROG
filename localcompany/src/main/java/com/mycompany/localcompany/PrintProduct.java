/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.localcompany;

/**
 *
 * @author Student
 */
public class PrintProduct {
        private final Product product;

        public PrintProduct(Product product) {
        this.product = product;
    }

    public void PrintTotalProductSales() {

            System.out.println(
            "TOTAL PRODUCT SALES: "
             + product.GetTotalProductsSold()
            );
}

        public void PrintAverageProductSales() {

            System.out.printf(
            "AVERAGE PRODUCT SALES: %.0f%n",
            product.GetAverageProductSold()
            );
    }

        public void PrintMostPopularProduct() {

            System.out.println(
            "MOST POPULAR PRODUCT: "
            + product.GetMostPopularProduct()
            + " ("
            + product.GetMostPopularProductSales()
        + ")"
        );
}

    public void PrintSalesReport() {

            System.out.println();
            System.out.println("PRODUCT SALES REPORT - 2026");

            System.out.println(
            "****************************************"
            );

        PrintTotalProductSales();
        PrintAverageProductSales();
        PrintMostPopularProduct();

            System.out.println(
            "****************************************"
            );
    }
}
