package org.example.testing;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public interface Data {

    List<Product> productList = new ArrayList<>(
            List.of(
                    Product.builder().name("Orange").price(12.2).quantity(23).build(),
                    Product.builder().name("Banana").price(15.4).quantity(42).build(),
                    Product.builder().name("Apple").price(5.11).quantity(94).build()
            )
    );

    static void addProduct(Product product){
        productList.add(product);
    }
    static List<Product> getProductList(){
        return productList;
    }
}
