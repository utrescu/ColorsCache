package net.xaviersala;

import org.springframework.data.repository.CrudRepository;

import net.xaviersala.model.Color;

/**
 * Repositori de repositori basat en CRUD.
 * 
 * @author xavier
 *
 */
public interface ColorsRepository extends CrudRepository<Color, Long> {

  /**
   * Obtenir el color a partir del seu nom.
   * @param nom nom del color
   * @return retorna un objecte Color
   */
  Color findByNom(String nom);

}
