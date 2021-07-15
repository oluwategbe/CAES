/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import dao.CareerDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Career;

/**
 *
 * @author USER
 */
@WebServlet(name = "saveCareerServlet", urlPatterns = {"/saveCareer"})
public class saveCareerServlet extends HttpServlet {

    private static final long SerialVersionUID = 1L;
    private CareerDao careerDao;
    public void init(){
        careerDao = new CareerDao();
    }
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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet saveCareerServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet saveCareerServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        saveCareer(request, response);
    }

    public void saveCareer(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        String personality = request.getParameter("personality");
        String field = request.getParameter("field");
        String careers = request.getParameter("careers");
        String type = request.getParameter("type");
        String description = request.getParameter("description");
        Career career = new Career(personality, field, careers, type, description);
        try{
            int result = careerDao.saveCareer(career);
            if(result == 1){
                request.setAttribute("NOTIFICATION", "Saved");
                RequestDispatcher dispatch = request.getRequestDispatcher("home/admin/homepage.jsp");
                dispatch.include(request, response);
            }
            else{
                request.setAttribute("NOTIFICATION", "Not Saved");
                RequestDispatcher dispatch = request.getRequestDispatcher("home/admin/homepage.jsp");
                dispatch.include(request, response);
            }
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
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
