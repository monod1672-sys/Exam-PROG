/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.localcompany;

/**
 *
 * @author Student
 */
public class Product implements IProduct {

     private final String[] productNames;
     private final int[][] monthlySales;
     private final int[] productTotals;

     public Product(String[] productNames, int[][] monthlySales) {

         this.productNames = productNames.clone();

         this.monthlySales = new int[monthlySales.length][];

    for (int i = 0; i < monthlySales.length; i++) {
         this.monthlySales[i] = monthlySales[i].clone();
    }

         this.productTotals = new int[productNames.length];

for (int i = 0; i < productNames.length; i++) {

         for (int j = 0; j < monthlySales[i].length; j++) {
         productTotals[i] += monthlySales[i][j];
    }
   }
}

@Override
    public int GetTotalProductsSold() {
    int total = 0;

    for (int sales : productTotals) {
    total += sales;
    }

         return total;
    }

@Override
    public double GetAverageProductSold() {

        int total = GetTotalProductsSold();
        int numberOfSales = 0;

    for (int[] sales : monthlySales) {
    numberOfSales += sales.length;
}

         if (numberOfSales == 0) {
         return 0.0;
    }

         return (double) total / numberOfSales;
}

@Override
    public String GetMostPopularProduct() {

        if (productNames.length == 0) {
        return "No products available";
    }

    int highestSales = productTotals[0];
    int popularIndex = 0;

    for (int i = 1; i < productTotals.length; i++) {

        if (productTotals[i] > highestSales) {
        highestSales = productTotals[i];
        popularIndex = i;
    }
}

    return productNames[popularIndex];
}

    public int GetMostPopularProductSales() {

        if (productTotals.length == 0) {
    return 0;
    }

    int highestSales = productTotals[0];

    for (int sales : productTotals) {
         if (sales > highestSales) {
         highestSales = sales;
    }
}

         return highestSales;
  }
}