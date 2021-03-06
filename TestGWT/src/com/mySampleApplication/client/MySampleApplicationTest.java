package com.mySampleApplication.client;


import com.google.gwt.junit.client.GWTTestCase;

/**
 * @author dmme1016
 * @since 10/27/2016
 */
public class MySampleApplicationTest extends GWTTestCase {                       // <span style="color:black;">**(1)**</span>

    /**
     * Must refer to a valid module that sources this class.
     */
    public String getModuleName() {                                         // <span style="color:black;">**(2)**</span>
        return "com.mySampleApplication.MySampleApplication";
    }

    /**
     * Add as many tests as you like.
     */
    public void testSimple() {                                              // <span style="color:black;">**(3)**</span>
        assertTrue(true);
    }

    /**
     * Verify that the instance fields in the StockPrice class are set correctly.
     */
    public void testStockPriceCtor() {
        String symbol = "XYZ";
        double price = 70.0;
        double change = 2.0;
        double changePercent = 100.0 * change / price;

        StockPrice sp = new StockPrice(symbol, price, change);
        assertNotNull(sp);
        assertEquals(symbol, sp.getSymbol());
        assertEquals(price, sp.getPrice(), 0.001);
        assertEquals(change, sp.getChange(), 0.001);
        assertEquals(changePercent, sp.getChangePercent(), 0.001);
    }

}