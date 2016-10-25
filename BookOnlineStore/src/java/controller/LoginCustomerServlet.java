/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Customer;
import model.CustomerLogin;

/**
 *
 * @author nawatsomnuek
 */
@WebServlet(name = "LoginCustomerServlet", urlPatterns = {"/LoginCustomer"})
public class LoginCustomerServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //----- Login -----
        String emailCust = request.getParameter("email");
        String passwordCust = request.getParameter("password");
        String massage = "";
        
        if (emailCust != null && passwordCust != null) {
            List<CustomerLogin> cs = CustomerLogin.loginByEmail(emailCust);
            if (cs != null) {
                CustomerLogin c = cs.get(0);
                if (passwordCust.equals(c.getCustPassword())) {
                    //request.getSession().setAttribute("user", cs);
                    getServletContext().getRequestDispatcher("/Index.jsp").forward(request, response);
                    return;
                } else {
                    massage = "Your password is incorrect";
                }
            } else {
                massage = "User \"" + emailCust + "\" does not exist";
            }
            request.setAttribute("messageLogin", massage);
        }
        
        //----- Register -----
        
        String regisEmail = request.getParameter("regisEmail");
        String regisPassword = request.getParameter("regisPassword");
        String massageNewCust = "";
        HttpSession htss = request.getSession(false);
        
        if (regisEmail != null && regisPassword != null) {
            request.getSession().setAttribute("regisEmail", regisEmail);
            request.getSession().setAttribute("regisPassword", regisPassword);
            getServletContext().getRequestDispatcher("/Register.jsp").forward(request, response);
        }
        
        getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}