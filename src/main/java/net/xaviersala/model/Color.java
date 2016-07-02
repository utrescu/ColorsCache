package net.xaviersala.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Representació del color amb RGB.
 * 
 * @author xavier
 *
 */
@Entity
public class Color implements Serializable {
  
  /**
   * 
   */
  private static final long serialVersionUID = -4021128349354164813L;

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private long id;
  
  /**
   * Nom del color.
   */
  private String nom;
  /**
   * Valor RGB del color.
   */
  private String rgb;
  
  public Color() {
    // Color
  }
  
  /**
   * Crea un color a partir del nom del color i del valor RGB.
   * 
   * @param nomColor nom del color
   * @param valorRgb valor rgb
   */
  public Color(String nomColor, String valorRgb) {
    nom = nomColor;
    rgb = valorRgb;
  }
  /**
   * @return the id
   */
  public long getId() {
    return id;
  }
  /**
   * @param id the id to set
   */
  public void setId(long id) {
    this.id = id;
  }
  /**
   * @return the nom
   */
  public String getNom() {
    return nom;
  }
  /**
   * @param nom the nom to set
   */
  public void setNom(String nom) {
    this.nom = nom;
  }
  /**
   * @return the rgb
   */
  public String getRgb() {
    return rgb;
  }
  /**
   * @param rgb the rgb to set
   */
  public void setRgb(String rgb) {
    this.rgb = rgb;
  }
  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return nom + "(" + rgb + ")";
  }
    

}
