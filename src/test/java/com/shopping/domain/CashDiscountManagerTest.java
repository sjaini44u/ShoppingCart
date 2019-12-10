package com.shopping.domain;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Saurabh Maina
 * Date: 1/12/19
 * Time: 11:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class CashDiscountManagerTest {

    private CashDiscountManager discountManager = new CashDiscountManager();

    @Test
    public void  test_discountedCartValue_when_cartPriceIs_lessThan_5000(){
        long finalCartValue = discountManager.getDiscountedCartValue(4999);
        Assert.assertEquals(4999, finalCartValue);
    }

    @Test
    public void  test_discountedCartValue_when_cartPriceIs_greaterThan_5000(){
        long finalCartValue = discountManager.getDiscountedCartValue(6000);
        Assert.assertEquals(5900, finalCartValue);
    }

    @Test
    public void  test_discountedCartValue_when_cartPriceIs_greaterThan_10000(){
        long finalCartValue = discountManager.getDiscountedCartValue(12000);
        Assert.assertEquals(11100, finalCartValue);
    }

    @Test
    public void  test_discountedCartValue_when_cartPriceIs_10000(){
        long finalCartValue = discountManager.getDiscountedCartValue(10000);
        Assert.assertEquals(9500, finalCartValue);
    }
    @Test
    public void  test_discountedCartValue_when_cartPriceIs_greaterThan_15000(){
        long finalCartValue = discountManager.getDiscountedCartValue(15000);
        Assert.assertEquals(13500, finalCartValue);
    }
}
