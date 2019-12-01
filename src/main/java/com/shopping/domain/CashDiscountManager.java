package com.shopping.domain;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Saurabh Maina
 * Date: 1/12/19
 * Time: 11:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class CashDiscountManager {

    private Discount discountSlab1;
    private Discount discountSlab2;
    private ArrayList<CashDiscount> cashDiscounts;


    public CashDiscountManager(){
        cashDiscounts = new ArrayList<CashDiscount>();
        discountSlab2 = new CashDiscount(20 , 10000, Long.MAX_VALUE);
        discountSlab1 = new CashDiscount(10, 4999, 10000);
    }

    public long getDiscountedCartValue(long cartValue){
        for (Discount discount : cashDiscounts){
              cartValue = discount.priceAfterDiscount(cartValue);
        }
        return cartValue;
    }
}
