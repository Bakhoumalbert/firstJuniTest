package com.misid;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;

public class GenerateurIDTest {

  GenerateurID gen;

  @BeforeEach
  public void setUp() {
    gen = new GenerateurID();
  }

  // Exercice 18
  // L’identifiant généré n’est jamais null. 
  @Test
  public void testGenererNotNull() {
    String id = gen.generer();
    assertNotNull(id);
  }

  // L’identifiant généré est de 10 caractères.
  @Test
  public void testGenerer() {
    String id = gen.generer();
    assertEquals(10, id.length());
  }
}
