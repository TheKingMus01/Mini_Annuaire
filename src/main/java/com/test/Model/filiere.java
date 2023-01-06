/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.Model;

/**
 *
 * @author MOY
 */
public class filiere {
     int id  ;

    String nom, departement;

    public filiere() {
    }

    @Override
    public String toString() {
        return "filiere{" + "id=" + id + ", nom=" + nom + ", departement=" + departement + '}';
    }

    public filiere(int id, String nom, String departement) {
        this.id = id;
        this.nom = nom;
        this.departement = departement;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }



}
