/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.DAO;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.test.Model.departement;
import com.test.Model.etudiant;
import com.test.Model.filiere;

/**
 *
 * @author MOY
 */
public class DAOImpl implements IDAO{

    public DAOImpl() {
    }
     @Override
	public  void AddEtudiant(etudiant a){
        try{
        Statement stm=ConnexionBD.getConnection().createStatement();
        String q = "insert into etudiant values(" +a.getCNE()+ ",'" +a.getNom() + "','" +a.getPrenom() + "','" +a.getFiliere() + "','" +a.getDepartement() + "','" +a.getTelephone() + "')";
        int update = stm.executeUpdate(q);

        }
        catch(Exception ex){ex.printStackTrace();}
    }



     @Override
	public  List<etudiant> getAllEtudiant(){
        List<etudiant> listEtudiant=new ArrayList<>();
        try{
        Statement stm=ConnexionBD.getConnection().createStatement();
         String q = "select * from etudiant";
            ResultSet rs = stm.executeQuery(q);

             while(rs.next())
            {
            int CNE=rs.getInt(1);
            String nom=rs.getString(2);
            String prenom=rs.getString(3);
            String filiere=rs.getString(4);
            String departement=rs.getString(5);
            String telephone=rs.getString(6);
           listEtudiant.add(new etudiant(CNE, nom, prenom,filiere, departement,telephone));
            }
                }
        catch(Exception ex){ex.printStackTrace();}
             return listEtudiant;
    }






    @Override
    public void AddDepartement(departement d) {
try{
        Statement stm=ConnexionBD.getConnection().createStatement();
        String q = "insert into departement values(null,'" +d.getNom()+ "')";
        int update = stm.executeUpdate(q);

        }
        catch(Exception ex){ex.printStackTrace();}    }

    @Override
    public void AddFiliere(filiere f) {
try{
        Statement stm=ConnexionBD.getConnection().createStatement();
        String q = "insert into filiere values(null,'" +f.getNom()+ "','" +f.getDepartement() + "')";
        int update = stm.executeUpdate(q);

        }
        catch(Exception ex){ex.printStackTrace();}    }

    @Override
    public List<departement> getAllDepartement() {

List<departement> listDepartement=new ArrayList<>();
        try{
        Statement stm=ConnexionBD.getConnection().createStatement();
         String q = "select * from departement";
            ResultSet rs = stm.executeQuery(q);

             while(rs.next())
            {
            int id=rs.getInt(1);
            String nom=rs.getString(2);

           listDepartement.add(new departement( id,nom));
            }
                }
        catch(Exception ex){ex.printStackTrace();}
             return listDepartement;
    }

    @Override
    public List<filiere> getAllfiliere() {
        List<filiere> listFiliere=new ArrayList<>();
        try{
        Statement stm=ConnexionBD.getConnection().createStatement();
         String q = "select * from filiere";
            ResultSet rs = stm.executeQuery(q);

             while(rs.next())
            {
                        int id=rs.getInt(1);
            String nom=rs.getString(2);
            String departement=rs.getString(3);
           listFiliere.add(new filiere(id,nom, departement));
            }
                }
        catch(Exception ex){ex.printStackTrace();}
             return listFiliere;
    }

    @Override
    public List<departement> getDepartement(String n) {

List<departement> listDepartement=new ArrayList<>();
        try{
        Statement stm=ConnexionBD.getConnection().createStatement();
         String q = "select * from departement where nom like '%"+n+"%'";
            ResultSet rs = stm.executeQuery(q);

             while(rs.next())
            {
            int id=rs.getInt(1);
            String nom=rs.getString(2);

           listDepartement.add(new departement( id,nom));
            }
                }
        catch(Exception ex){ex.printStackTrace();}
             return listDepartement;
  }

    @Override
    public List<filiere> getFiliere(String n) {

          List<filiere> listFiliere=new ArrayList<>();
        try{
        Statement stm=ConnexionBD.getConnection().createStatement();
         String q = "select * from filiere where nom like '%"+n+"%'";
            ResultSet rs = stm.executeQuery(q);

             while(rs.next())
            {
                        int id=rs.getInt(1);
            String nom=rs.getString(2);
            String departement=rs.getString(3);
           listFiliere.add(new filiere(id,nom, departement));
            }
                }
        catch(Exception ex){ex.printStackTrace();}
             return listFiliere;
    }



         @Override
    public List<etudiant> getEtudiantby(String n) {
                    List<etudiant> listEtudiant=new ArrayList<>();
        try{
        Statement stm=ConnexionBD.getConnection().createStatement();
         String q = "select * from etudiant where nom LIKE '%"+n+"%'";
            ResultSet rs = stm.executeQuery(q);

             while(rs.next())
            {
            int CNE=rs.getInt(1);
            String nom=rs.getString(2);
            String prenom=rs.getString(3);
            String filiere=rs.getString(4);
            String departement=rs.getString(5);
            String telephone=rs.getString(6);
           listEtudiant.add(new etudiant(CNE, nom, prenom,filiere, departement,telephone));
            }
                }
        catch(Exception ex){ex.printStackTrace();}
             return listEtudiant;
    }




}
