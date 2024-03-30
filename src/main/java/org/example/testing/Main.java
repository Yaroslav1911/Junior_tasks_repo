package org.example.testing;

public class Main {
    public static void main(String[] args) {


        System.out.println(Data.getProductList());

        Data.addProduct(Product.builder().name("Papaya").price(54.1).quantity(3).build());

        System.out.println(Data.getProductList());

    }
}
