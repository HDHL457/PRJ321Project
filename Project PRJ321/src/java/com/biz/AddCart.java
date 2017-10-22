/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biz;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author tanlu
 */
public class AddCart extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String imagePath = request.getParameter("imagePath");
            String name = request.getParameter("name");
            double price = Double.parseDouble(request.getParameter("price"));
            int id = Integer.parseInt(request.getParameter("id"));
            
            CartItem ci = new CartItem(imagePath, 1, name, price, id); //mac dinh co so luong la 1
            
            //lan dau tien se tao gio hang, con tu lan thu 2 chi can lay ra gio hang sau do them vao gio hang
            //de lam duoc thi can kiem tra xem gio hang da duoc tao hay chua
            //-> kiem tra session da ton tai chua
            HttpSession session = request.getSession();
            if (session.getAttribute("Cart") == null) {     //chua ton tai gio hang
                session.setAttribute("Cart", new Cart());
            }
            
            Cart cart = (Cart) session.getAttribute("Cart");
            cart.addCartItem(ci);
            session.setAttribute("Cart", cart);
            
            //chuyen sang trang hien thi gio hang
            response.sendRedirect("AddCart.jsp");
        }
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
