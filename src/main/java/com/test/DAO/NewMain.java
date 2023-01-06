/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.DAO;

import java.util.List;

import com.test.Model.etudiant;
import com.test.Service.IService;
import com.test.Service.ServiceImpl;
/**
 *
 * @author MOY
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

            DAOImpl t = new DAOImpl();
            IService ser = new ServiceImpl() ;

            ser.AddEtudiant(new etudiant(8,"aaaa","bbbb","ccccc","ddddd","eeeee"));
          // t.deleteEtudiant(5);
          //t.updateEtudiant(new etudiant(5,"testtt1","bbbb","ccccc","ddddd","06006"));
       // System.out.println(t.getEtudiantbyid(1));
        //System.out.println(t.getEtudiantby("b"));
       List<etudiant> listS = ser.getAllEtudiant();
		for(etudiant s:listS)
		System.out.println(s);

               /* List<etudiant> listx = t.getEtudiantby("b");
		for(etudiant s:listx)
		System.out.println(s);*/
    //t.AddDepartement(new departement(5,"nn"));


    }

}
