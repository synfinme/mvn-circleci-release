package me.synfin.circleci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HelloJavaTest {

    @Test
    public void testGetHello() {
        HelloJava hj = new HelloJava();

        assertTrue("Hello, Java!".equals(hj.getHello()));
    }
}
