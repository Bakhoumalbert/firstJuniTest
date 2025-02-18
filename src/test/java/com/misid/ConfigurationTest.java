package com.misid;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ConfigurationTest {
  
  // Exercice 19
  //Écris un test JUnit pour vérifier que la méthode getInstance() retourne bien une instance de Configuration.
  @Test
  void testGetInstance() {
    Configuration config = Configuration.getInstance();
    assertNotNull(config);
  }

  //Écris un test JUnit pour vérifier que deux appels à Configuration.getInstance() retournent bien la même instance.
  @Test
  void testSingleton() {
    Configuration config1 = Configuration.getInstance();
    Configuration config2 = Configuration.getInstance();
    assertEquals(config1, config2);
  }
}
