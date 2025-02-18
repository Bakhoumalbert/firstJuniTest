package com.misid;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    User userManup;

    @Before
    public void setUp() {
        userManup = new User();
    }

    @After
    public void tearDown() {
        userManup = null;
        System.out.println("Nettoyage de la class UserManipulation  terminé");
    }

    @Test
    public void isActivTest() {
        assertEquals(true, userManup.isActiv());
    }
}
