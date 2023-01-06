/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.Service;

import java.util.List;

import com.test.Model.departement;
import com.test.Model.etudiant;
import com.test.Model.filiere;

/**
 *
 * @author MOY
 */
public interface IService {
    //ADD
    public  void AddEtudiant(etudiant a);
    public  void AddDepartement(departement d);
    public  void AddFiliere(filiere f);
    //GetAll
    public  List<etudiant> getAllEtudiant();
    public  List<departement> getAllDepartement();
    public  List<filiere> getAllfiliere();
    //GetById
    public List<departement> getDepartement(String nom);
    public List<filiere> getFiliere(String nom);
        public List<etudiant> getEtudiantby(String nom);

}
