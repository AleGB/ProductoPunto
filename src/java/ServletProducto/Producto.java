package ServletProducto;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Karla
 */
@WebServlet(name = "Serie", urlPatterns = {"/Serie"})
public class Producto extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    String num1A;
    String num2A;
    String num1B;
    String num2B;
    int primerresultado;
    int segundoresultado;
    int total;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        num1A = request.getParameter("numero1A");
        num2A = request.getParameter("numero2A");
        num1B = request.getParameter("numero1B");
        num2B = request.getParameter("numero2B");

        primerresultado = Integer.parseInt(num1A) * Integer.parseInt(num1B);
        segundoresultado = Integer.parseInt(num2A) * Integer.parseInt(num2B);
        total = primerresultado + segundoresultado;

        PrintWriter out = new PrintWriter(response.getOutputStream());
        out.println("<html>");
        out.println("<head><title>Respuesta</title></head>");
        out.println("<body>");
        out.println("<br><center><B>Vector A:</B></center>");
        out.println("<p><h1><center>" + num1A + "i +" + num2A + "j </center></h1></p>");
        out.println("<br><center><B>Vector B:</B></center>");
        out.println("<p><h1><center>" + num1B + "i + " + num2B + "j </center></h1></p>");
        out.println("<p><h1><center>Su producto punto  A.B es: <B>" + total + "</B> </center></h1></p>");
        out.println("</body></html>");
        out.close();

    }

}
