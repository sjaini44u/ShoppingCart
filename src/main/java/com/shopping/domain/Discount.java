package com.shopping.domain;

/**
 * Created with IntelliJ IDEA.
 * User: Saurabh Maina
 * Date: 1/12/19
 * Time: 11:08 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Discount {

    long priceAfterDiscount(long cartValue);
}
