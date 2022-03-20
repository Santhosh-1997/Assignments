package com.masai.Mar17.SortingtheProductProblem;

import java.util.Comparator;

public class SortProductPrice implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getProductPrice()>o2.getProductPrice() ? +1 : -1;
    }
}
