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

/**
 *
 * @author USER
 */
@WebServlet(name = "careerSuggestionServlet", urlPatterns = {"/careerSuggestion"})
public class careerSuggestionServlet extends HttpServlet {

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
            out.println("<title>Servlet careerSuggestionServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet careerSuggestionServlet at " + request.getContextPath() + "</h1>");
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
        suggestCareer(request, response);
    }

    public void suggestCareer(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        String eiivalue, nssvalue, tffvalue, pjjvalue, personality = " ";
        int examscores = Integer.parseInt(request.getParameter("examscores"));
        String field = request.getParameter("field");
        int eivalue = Integer.parseInt(request.getParameter("eivalue"));
        int nsvalue = Integer.parseInt(request.getParameter("nsvalue"));
        int tfvalue = Integer.parseInt(request.getParameter("tfvalue"));
        int pjvalue = Integer.parseInt(request.getParameter("pjvalue"));
        PrintWriter out = response.getWriter();
        if(eivalue >= 500){
            eiivalue = "E";
        }
        else{
            eiivalue = "I";
        }
        if(nsvalue >= 500){
            nssvalue = "N";
        }
        else{
            nssvalue = "S";
        }
        if(tfvalue >= 500){
            tffvalue = "T";
        }
        else{
            tffvalue = "F";
        }
        if(pjvalue >= 500){
            pjjvalue = "P";
        }
        else{
            pjjvalue = "J";
        }
        personality = eiivalue+nssvalue+tffvalue+pjjvalue;
        try{
            String career = careerDao.selectCareers(personality, field);
            String type = careerDao.selectType(personality, field);
            String description = careerDao.selectDescription(personality, field);
            request.setAttribute("career", career);
            request.setAttribute("type", type);
            request.setAttribute("personality", personality);
            request.setAttribute("description", description);
            request.setAttribute("examscores", examscores);
            RequestDispatcher dispatch = request.getRequestDispatcher("home/suggestions.jsp");
            dispatch.forward(request, response);
        }
        catch(Exception e){
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
