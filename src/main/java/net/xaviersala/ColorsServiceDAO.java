package net.xaviersala;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.xaviersala.model.Color;

/**
 * Serveis de repositori.
 * 
 * @author xavier
 *
 */
@Service
public class ColorsServiceDAO implements ColorsService {
  
  private static final Logger log = LoggerFactory.getLogger(ColorsServiceDAO.class);
  
  @Autowired
  ColorsRepository repositori;
  
  /**
   * @See ColorsService
   */
  @Override
  public List<Color> getTots() {
        
    List<Color> resultat = (List<Color>) repositori.findAll();    
    
    return resultat;
  }
  
  /**
   * @see ColorsService
   */
  @Override
  public Color getColor(String nom) {    
    simulateSlowService();
    Color c = repositori.findByNom(nom);
    if (c == null) {
      c = new Color("No existent", "");
    }
    log.info("Recuperat color " + c.toString());
    return c;
  }
  
  /**
   * La idea és fer que el servei sigui més lent del normal
   * per comprovar que la caché funciona.
   */
  private void simulateSlowService() {
    try {
        long time = 5000L;
        Thread.sleep(time);
    } catch (InterruptedException e) {
      log.error("Failed slowing service", e);      
    }
  }

}
