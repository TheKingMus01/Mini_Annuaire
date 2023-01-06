package com.test.servlets;

import java.io.IOException;

import com.test.Model.departement;
import com.test.Model.etudiant;
import com.test.Model.filiere;
import com.test.Service.IService;
import com.test.Service.ServiceImpl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class test extends HttpServlet {

	@Override
	public void doGet( HttpServletRequest request, HttpServletResponse response )
			throws ServletException, IOException{

    doPost(request, response);


	}
	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        IService ser = new ServiceImpl();
etudiant a=new etudiant();
filiere f = new filiere();
departement d = new departement();
      String action=request.getParameter("action");
      String page = "";
      int aa = 0;
      if(action==null){
          page = "Accueil.jsp";
    


      }
          else {
      switch(action){

           case "Menu_utilisation": 			page = "Utilisation.jsp";

                                                  	break;
          case "Menu_administration": 			page = "Administration.jsp";
                                                  	break;


          case "ShowStudents":  request.setAttribute("listeE", ser.getAllEtudiant());
       	  										page = "ListerE.jsp";
       	  								break;

          case "Showfilieres":  request.setAttribute("listeF", ser.getAllfiliere());
												page = "ListerF.jsp";
												break;

           case "Showdepartements":  request.setAttribute("listeD", ser.getAllDepartement());
        	  									page = "ListerD.jsp";
        	  									break;


           case "InsertEtudiant.html": 						page = "InsertEtudiant.html";
           													aa=1;
   														break;

           case "Insert_D": 						page = "InsertDepartement.html";
														aa=1;

           												break;

           case "Insert_F": 						page = "InsertFiliere.html";
														aa=1;

           												break;

      }

      }
      if (aa==0) {
      RequestDispatcher dd=request.getRequestDispatcher(page);
	  dd.forward(request, response);}
      else {
    	  //request.getRequestDispatcher(page).include( request, response);
    	  //request.getRequestDispatcher(page).forward(request, response);
    	  response.sendRedirect(page);
      }



    }



}
