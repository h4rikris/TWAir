package com.tw;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.ui.Model;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class HomePageTest {

    private HomePage homePage;

    @Mock
    private Model model;

    @Before
    public void setUp() {
        homePage = new HomePage();
    }

    @Test
    public void shouldReturnHomePageTemplateName() {
        String templateName = homePage.home(model);

        assertEquals("home", templateName);
    }

    @Test
    public void shouldAddSourceLocationsToModel() {

        homePage.home(model);

        verify(model, times(1)).addAttribute(eq("sourceLocations"), anyCollection());
    }
}