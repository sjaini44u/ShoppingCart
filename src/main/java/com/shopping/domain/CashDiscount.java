package com.shopping.domain;

/**
 * Created with IntelliJ IDEA.
 * User: Saurabh Maina
 * Date: 1/12/19
 * Time: 11:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class CashDiscount implements Discount {

    private long discountPercent;
    private long minCartAmount;
    private long maxCartAmount;

    public CashDiscount(long discountPercent, long minCartAmount, long maxCartAmount) {
        this.discountPercent = discountPercent;
        this.minCartAmount = minCartAmount;
        this.maxCartAmount = maxCartAmount;
    }

    @Override
    public long priceAfterDiscount(long cartValue) {
        if (cartValue > minCartAmount && cartValue >= maxCartAmount) {
            return (maxCartAmount - minCartAmount)* discountPercent/100;

        }
        if(cartValue > minCartAmount && cartValue < maxCartAmount){
            return (cartValue - minCartAmount) * discountPercent/100;
        }
        return 0;
    }
}
