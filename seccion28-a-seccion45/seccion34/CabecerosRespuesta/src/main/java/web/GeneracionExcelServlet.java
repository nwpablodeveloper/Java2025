package web;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "GeneracionExcelServlet", urlPatterns = {"/GeneracionExcelServlet"})
public class GeneracionExcelServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Utilizar apache poi para un uso más profesional de archivos de tipo Excel
        // Respondemos con contenido de tipo Excel
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("content-Disposition", "attachment;filename=excelEjemplo.xls");
        
        // Decirle al navegador que no guarde Cache
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-control", "no-store");
        response.setDateHeader("Expires", -1); // Que expire de manera inmediata
        
        
        
        try (PrintWriter out = response.getWriter()) {
            out.println("\tvalores"); // El tabulador equivale a una celda vacia
            out.println("\t1");
            out.println("\t2");
            out.println("Total\t=SUMA(B2:B3)");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
