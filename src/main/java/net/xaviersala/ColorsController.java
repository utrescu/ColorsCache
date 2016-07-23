package net.xaviersala;
import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import net.xaviersala.model.Color;

import javax.servlet.http.HttpServletResponse;

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

  /**
   * Captura l'error de Bad Request.
   * @param e Excepció
   * @param response Resposta HTTP
   * @throws IOException Excepció d'entrada/Sortida
   */
  @ExceptionHandler
  void handleIllegalArgumentException(IllegalArgumentException e, HttpServletResponse response) throws IOException {
    response.sendError(HttpStatus.NOT_FOUND.value());
  }


}
