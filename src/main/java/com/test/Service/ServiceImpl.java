/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.Service;

import java.util.List;

import com.test.DAO.DAOImpl;
import com.test.DAO.IDAO;
import com.test.Model.departement;
import com.test.Model.etudiant;
import com.test.Model.filiere;

/**
 *
 * @author MOY
 */
public class ServiceImpl implements IService
{
    IDAO dao = new DAOImpl();

    @Override
    public void AddEtudiant(etudiant a) {
            dao.AddEtudiant(a);
    }

    @Override
    public void AddDepartement(departement d) {
        dao.AddDepartement(d);
    }

    @Override
    public void AddFiliere(filiere f) {
        dao.AddFiliere(f);
    }

    @Override
    public List<etudiant> getAllEtudiant() {
      return  dao.getAllEtudiant();
    }

    @Override
    public List<departement> getAllDepartement() {
        return dao.getAllDepartement();
    }

    @Override
    public List<filiere> getAllfiliere() {
            return dao.getAllfiliere();
    }

    @Override
    public List<departement> getDepartement(String nom) {
        return dao.getDepartement(nom);
    }

    @Override
    public List<filiere> getFiliere(String nom) {
        return dao.getFiliere(nom);
    }


     @Override
  public List<etudiant> getEtudiantby(String n) {
        return dao.getEtudiantby(n);
    }
}
