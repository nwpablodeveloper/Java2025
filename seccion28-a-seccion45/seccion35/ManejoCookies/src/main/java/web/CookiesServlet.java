package web;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "CookiesServlets", urlPatterns = {"/CookiesServlets"})
public class CookiesServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Suponemos que el usuario visita por primera vez nuestro sitio
        boolean nuevoUsuario = true;
        
        // Obtenemos el arreglo de Cookies
        Cookie[] cookies = request.getCookies();
        
        // Bucamos si existe una cookie con anterioridad
        // Llmada visitanteRecurrente
        if (cookies != null) {
            for(Cookie c: cookies){
                if(c.getName().equals("visitanteRecurrente") && c.getValue().equals("si")){
                    nuevoUsuario = false;
                    break;
                }
            }
        }
        
        String mensaje;
        if (nuevoUsuario) {
            // Creamos una nueva Cookie para identirificar al usuario recurrente
            Cookie visitateneCookie = new Cookie("visitanteRecurrente", "si");
            response.addCookie(visitateneCookie);
            mensaje = "Gracias por visitar nuestro sitio Web por primer vez";
        }else{
            mensaje = "Erese usuario recurrente";
        }
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Manejo de Cookies</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Manejo de Cookies</h1>");
            out.println("<p>"+ mensaje +"</p>");
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
