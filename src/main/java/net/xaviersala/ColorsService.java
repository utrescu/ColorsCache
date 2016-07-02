package net.xaviersala;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;

import net.xaviersala.model.Color;

/**
 * Obtenir els repositori de la font de dades. 
 * 
 * @author xavier
 *
 */
public interface ColorsService {
  
  /**
   * Obtenir el color a partir del seu nom.
   * 
   * @param nom nom del color
   * @return retorna un objecte Color
   */
  @Cacheable(value="repositori")
  Color getColor(String nom);
  
  /**
   * Obtenir la llista de repositori.
   * @return Llista amb els repositori
   */
  List<Color> getTots();
}
