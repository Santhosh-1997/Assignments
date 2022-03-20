package com.masai.Mar17.SortingtheProductProblem;

import java.util.Comparator;

public class SortProductName implements Comparator<Product>{
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getProductName().compareTo(o2.getProductName());
    }
}
