package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class imagenes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Imagenes</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Imagen a Tamaño normal</h1>\n");
      out.write("        <img src=\"barrymore.jpg\" alt=\"Barrymoore\">\n");
      out.write("        <h1>Imagen con borde 2, ancho 180px y altura 160px alineado a la derecha</h1>\n");
      out.write("        <img src=\"jolie.jpg\" border=\"2\" width=\"180\" height=\"160\" align=\"left\" alt=\"jolie\"><p align=\"justify\">\n");
      out.write("         Angelina Jolie Voight, DCMG (honoraria) (Los Ángeles, 4 de junio de 1975) es una actriz, modelo, \n");
      out.write("        filántropa, actriz de voz, Directora y guionista estadounidense, que también posee la nacionalidad \n");
      out.write("        camboyana. A lo largo de su carrera, Jolie ha recibido múltiples reconocimientos por sus logros \n");
      out.write("        actorales, entre ellos un Premio Óscar y tres Globos de Oro. Actualmente forma parte del Alto \n");
      out.write("        Comisario de las Naciones Unidas para los Refugiados.\n");
      out.write("Aunque comenzó actuando en 1982 junto con su padre Jon Voight, se le atribuye como debut oficial su \n");
      out.write("papel en la película Cyborg 2 de 1993. La primera interpretación principal que hizo fue en la película \n");
      out.write("Hackers de 1995. En 1997 actuó en la polémica película George Wallace. Interpretó a un personaje \n");
      out.write("principal en el filme para televisión GIA de 1998. Su reconocimiento mundial comenzó a desarrollarse \n");
      out.write("después de que ganara un premio Óscar como mejor actriz de reparto, en 2000, gracias a su trabajo en la \n");
      out.write("película Inocencia interrumpida.</p>\n");
      out.write("        <h1>Imagenes animadas GIF</h1>\n");
      out.write("        <img src=\"calvin.gif\" alt=\"calvin\">\n");
      out.write("        <h1>Imagen de enlace sitio web</h1>\n");
      out.write("        <a href=\"http://es.wikipedia.org/wiki/Angelina_Jolie\"><img src=\"jolieicono.jpg\"></a>\n");
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
