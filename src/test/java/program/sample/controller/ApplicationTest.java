package program.sample.controller;

import junit.framework.Assert;
import junit.framework.TestCase;

public class ApplicationTest extends TestCase {
    Calculator cal = new Calculator();

    public void testAdd() {
        Assert.assertEquals(cal.add(10, 20), 30);
    }

    public void testMultiply() {
        Assert.assertEquals(cal.mul(10, 20), 200);
    }
}