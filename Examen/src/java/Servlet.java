
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class Servlet extends HttpServlet {

   
   @Override
   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
    
      response.setContentType("text/html");

      PrintWriter out = response.getWriter();
      String title = "Using GET Method to Read Form Data";
      String docType =
         "<!doctype html public \"-//w3c//dtd html 4.0 " +
         "transitional//en\">\n";
         
      out.println(docType +
         "<html>\n" +
            "<head><title>" + title + "</title></head>\n" +
            "<body bgcolor = \"#f0f0f0\">\n" +
               "<h1 align = \"center\">" + title + "</h1>\n" +
               "<ul>\n" +
                  "  <li><b>Nombre</b>: "
                  + request.getParameter("Nombre") + "\n" +
                  "  <li><b>Apellido</b>: "
                  + request.getParameter("Apellido") + "\n" +
                  "  <li><b>Numero Documento</b>: "
                  + request.getParameter("nroDocumento") + "\n" +
               "</ul>\n" +
            "</body>"+
         "</html>"
      );
   }

   // Method to handle POST method request.
   @Override
   public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

      doGet(request, response);
   }
}
