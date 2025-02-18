package com.misid;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import static org.junit.jupiter.api.Assertions.*;

class GenerateurIDTest {

    @Test
    void testGenerateurID_NonNull() {
        String id = GenerateurID.generer();
        assertNotNull(id, "L'identifiant généré ne doit pas être null.");
    }

    @Test
    void testGenerateurID_Longueur() {
        String id = GenerateurID.generer();
        assertEquals(10, id.length(), "L'identifiant généré doit contenir exactement 10 caractères.");
    }

    @RepeatedTest(100)
    void testGenerateurID_Uniqueness() {
        HashSet<String> ids = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            String id = GenerateurID.generer();
            assertFalse(ids.contains(id), "L'identifiant généré ne doit pas être dupliqué.");
            ids.add(id);
        }
    }
}
