package com.tw;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HomePageTest {

    private HomePage homePage;

    @Before
    public void setUp() {
        homePage = new HomePage();
    }

    @Test
    public void shouldReturnHomePageTemplateName() {
        String templateName = homePage.home();

        assertEquals("home", templateName);
    }
}