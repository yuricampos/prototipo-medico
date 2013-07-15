/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import dao.ClinicaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Clinica;

/**
 *
 * @author yuricampos
 */
public class CadastrarClinica extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String nome = request.getParameter("nome");
            String endereco = request.getParameter("endereco");
            String telefone = request.getParameter("telefone");
            String cidade = request.getParameter("cidade");
            String estado = request.getParameter("estado");
            String email = request.getParameter("email");
            String login = request.getParameter("login");
            String senha = request.getParameter("senha");
            Clinica c = new Clinica();
            c.setClinicaNome(nome);
            c.setClinicaEndereco(endereco);
            c.setClinicaTelefone(telefone);
            c.setClinicaCidade(cidade);
            c.setClinicaEstado(estado);
            c.setClinicaEmail(email);
            c.setClinicaLogin(login);
            c.setClinicaSenha(senha);
            ClinicaDAO cdao = new ClinicaDAO();
            try{
                cdao.cadastrar(c);
            }catch(Exception e){
                
            }
            
            
            
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
