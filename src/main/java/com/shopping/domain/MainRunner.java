package com.shopping.domain;

/**
 * Created with IntelliJ IDEA.
 * User: Saurabh Maina
 * Date: 1/12/19
 * Time: 11:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class MainRunner {

    public static void main(String[] args){
        String cartValue = args[0];
        CashDiscountManager cashDiscountManager = new CashDiscountManager();
        long discountedCartValue = cashDiscountManager.getDiscountedCartValue(Long.valueOf(cartValue));
        System.out.print("Discount Cart value is " + discountedCartValue);
    }
}
