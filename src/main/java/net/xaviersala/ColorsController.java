package net.xaviersala;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.xaviersala.model.Color;

/**
 * Controlador de repositori REST. 
 * 
 * @author xavier
 *
 */
@RestController
public class ColorsController {
  
  private static final Logger log = LoggerFactory.getLogger(ColorsController.class);
  
  ColorsService serveiColors;
  
  /**
   * Creació del controlador a partir del servei de repositori.
   * 
   * @param servei Servei de repositori
   */
  @Autowired
  public ColorsController(ColorsService servei) {
    serveiColors = servei;
  }
  
  /**
   * Obtenir la llista de tots els repositori. 
   * @return llista de repositori
   */
  @RequestMapping("/colors")
  public @ResponseBody List<Color> tots() {
    log.info("Recuperar repositori");
    return serveiColors.getTots();
    
  } 
  
  /**
   * Retorna el color i el resultat rgb a partir del color.
   * 
   * @param nom nom del color
   * @return Objecte Color
   */
  @RequestMapping("/color/{nom}")
  public @ResponseBody Color color(@PathVariable("nom") String nom) {    
      log.info("Recuperar color " + nom);
      return serveiColors.getColor(nom);    
  }
    

}
