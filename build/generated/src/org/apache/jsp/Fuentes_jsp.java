package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Fuentes_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Formato de Texto</title>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"yellow\" text=\"#FF0000\">\n");
      out.write("        <h1>La contaminacion</h1>\n");
      out.write("        <p align=\"justify\">La contaminacion ambiental es causada por los <b>Gases de Invernadero </b>\n");
      out.write("            como el CO<sub>2</sub> que afecta al planeta causando el <u>deshielo</u> y aumento del \n");
      out.write("    H<sub>2</sub>O a su vez produce el <i>Calentamiento Global.</i></p>\n");
      out.write("<big>Letras Grandes</big><br>\n");
      out.write("<small>Letras pequeñas</small><br>\n");
      out.write("Ecuacion cuadratica: (A + B)<sup>2</sup> = A<sup>2</sup> + 2AB + B<sup>2</sup><br>\n");
      out.write("<font size=\"7\">Letra de Tamaño 7</font><br>\n");
      out.write("<font face=\"Arial,Impact,Courier\">Letra Arial o Impact o Courier</font><br>\n");
      out.write("<font size=\"5\" color=\"red\">Letra de tamaño 5 y color rojo</font><br>\n");
      out.write("<font style=\"color: #660066; font-size:60pt; font-weight: bold\">Letra con estilo</font>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
