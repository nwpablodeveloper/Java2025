package web;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;   
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Enumeration;

@WebServlet(name = "ServletCabeceros", urlPatterns = {"/ServletCabeceros"})
public class ServletCabeceros extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String metodoHttp = request.getMethod();
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html data-bs-theme='dark'>");
            out.println("<head>");
            out.println("<title>Cabeceros Http</title>");            
            out.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css\" rel=\"stylesheet\" "
                            + "integrity=\"sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT\" crossorigin=\"anonymous\">");            
            out.println("</head>");
            out.println("<body class='container m-5'>");
            out.println("<h1 class='mb-4 text-center text-warning table-striped'>Cabeceros Http</h1>");
            out.println("<table class='table table-bordered'>");
            out.println("<tr><th>Cabecero</th><th>Captura</th></tr>");
            
            out.println("<tr><td>Metodo</td><td>"+ metodoHttp +"</td></tr>");
            
            out.println("<tr><td>Uri</td><td>"+ request.getRequestURI() +"</td></tr>");
            
            Enumeration<String> cabeceros = request.getHeaderNames();
            while(cabeceros.hasMoreElements()){ // hasMoreElements es para saber si tenemos elementos para iterar
                
                String nombreCabecero = cabeceros.nextElement();
                out.println("<tr><td>"+ nombreCabecero +"</td>"); // Nombre del cabecero
                
                out.println("<td>"+ request.getHeader(nombreCabecero) +"</td></tr>");
            }
            
            out.println("</table>");
            out.println("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js\" "
                            + "integrity=\"sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO\" crossorigin=\"anonymous\"></script>");
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
