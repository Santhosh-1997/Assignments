package com.masai.Mar17.SortingtheProductProblem;

public class sortProductId extends SortProductName{

    @Override
    public int compare(Product o1, Product o2){
        return o1.getProductId()>o2.getProductId() ? +1 : -1;
    }
}
