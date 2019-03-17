package com.example.jenkins;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by manorama on 3/17/19.
 */
public class HelloTest {

    @Test()
    public void testHello() {

        Hello hello = new Hello();
        Assert.assertTrue(hello.isSuccess(), "Success not true");
    }
}
