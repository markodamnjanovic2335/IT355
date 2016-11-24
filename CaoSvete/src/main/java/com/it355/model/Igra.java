/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.model;

/**
 *
 * @author Marko
 */
public class Igra {
    private String imeIgre;
    private Double cenaIgre;
    private Double velicinaIgrice;
    private String opisIgre;
    private Double OcenaIgre;

    public Igra(String imeIgre, Double cenaIgre, Double velicinaIgrice, String opisIgre, Double OcenaIgre) {
        this.imeIgre = imeIgre;
        this.cenaIgre = cenaIgre;
        this.velicinaIgrice = velicinaIgrice;
        this.opisIgre = opisIgre;
        this.OcenaIgre = OcenaIgre;
    }

    public Igra() {
    }

    
      
    public String getImeIgre() {
        return imeIgre;
    }

    public void setImeIgre(String imeIgre) {
        this.imeIgre = imeIgre;
    }

    public Double getCenaIgre() {
        return cenaIgre;
    }

    public void setCenaIgre(Double cenaIgre) {
        this.cenaIgre = cenaIgre;
    }

    public Double getVelicinaIgrice() {
        return velicinaIgrice;
    }

    public void setVelicinaIgrice(Double velicinaIgrice) {
        this.velicinaIgrice = velicinaIgrice;
    }

    public String getOpisIgre() {
        return opisIgre;
    }

    public void setOpisIgre(String opisIgre) {
        this.opisIgre = opisIgre;
    }

    public Double getOcenaIgre() {
        return OcenaIgre;
    }

    public void setOcenaIgre(Double OcenaIgre) {
        this.OcenaIgre = OcenaIgre;
    }

    

  
    
    
}
