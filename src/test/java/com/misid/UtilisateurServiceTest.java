package com.misid;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilisateurServiceTest {

    @Test
    void testSuppressionUtilisateurAvecIdValide() {
        assertDoesNotThrow(() -> UtilisateurService.supprimerUtilisateur("12345"));
    }

    @Test
    void testSuppressionUtilisateurAvecIdNull() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            UtilisateurService.supprimerUtilisateur(null);
        });
        assertEquals("L'ID de l'utilisateur ne peut pas être null ou vide.", exception.getMessage());
    }

    @Test
    void testSuppressionUtilisateurAvecIdVide() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            UtilisateurService.supprimerUtilisateur(" ");
        });
        assertEquals("L'ID de l'utilisateur ne peut pas être null ou vide.", exception.getMessage());
    }
}
