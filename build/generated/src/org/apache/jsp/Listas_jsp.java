package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Listas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Listas</title>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"fondo1.jpg\" text=\"blue\">\n");
      out.write("        <h1>Listas Desordenadas</h1>\n");
      out.write("        Paises\n");
      out.write("        <ul type=\"circle\">\n");
      out.write("            <li>Perú</li>\n");
      out.write("            <li>Argentina</li>\n");
      out.write("            <li>Brasil</li>\n");
      out.write("            <li>Colombia</li>\n");
      out.write("        </ul>\n");
      out.write("        <h1>Listas Ordenadas</h1>\n");
      out.write("        Jugadores\n");
      out.write("        <ol type=\"1\">\n");
      out.write("            <li>Pizarro</li>\n");
      out.write("            <li>Messi</li>\n");
      out.write("            <li>Ronaldo</li>\n");
      out.write("            <li>Neymar</li>\n");
      out.write("            <li>Robbens</li>\n");
      out.write("        </ol>\n");
      out.write("        Equipos\n");
      out.write("        <ol type=\"A\">\n");
      out.write("            <li>Alianza</li>\n");
      out.write("            <li>Universitario</li>\n");
      out.write("            <li>Cristal</li>\n");
      out.write("            <li>Vallejo</li>\n");
      out.write("            <li>SanMartin</li>\n");
      out.write("        </ol>\n");
      out.write("        <h1>Listas Multinivel</h1>\n");
      out.write("        <ol type=\"I\">\n");
      out.write("            <li>Capitulo Primero</li>\n");
      out.write("            <ol type=\"A\">\n");
      out.write("                <li>Conceptos Basicos</li>\n");
      out.write("                <ol type=\"1\">\n");
      out.write("                    <li>Internet</li>\n");
      out.write("                    <li>Protocolos</li>\n");
      out.write("                    <li>Servicios</li>\n");
      out.write("                    <ul type=\"disc\">\n");
      out.write("                        <li>WWW</li>\n");
      out.write("                        <li>Email</li>\n");
      out.write("                        <li>Telnet</li>\n");
      out.write("                        <li>Chat</li>\n");
      out.write("                    </ul>\n");
      out.write("                </ol>\n");
      out.write("                <li>Programacion</li>\n");
      out.write("                <ol type=\"1\">\n");
      out.write("                    <li>Java Script</li>\n");
      out.write("                    <li>C++</li>\n");
      out.write("                </ol>\n");
      out.write("            </ol>\n");
      out.write("            <li>Capitulo Segundo</li>\n");
      out.write("        </ol>\n");
      out.write("        <h1>Listas de definicion (Vocabularios o Glosarios)</h1>\n");
      out.write("        <dl>\n");
      out.write("            <dt>Hardware</dt>\n");
      out.write("            <dd>Es la parte fisica del computador, formado por la Unidad Central de Proceso o Microprocesador,\n");
      out.write("            las memorias RAM y ROM, los Buses de datos y los Dispositivos Perifericos adicionalmente tambien\n");
      out.write("            lo componen los dispositivos de almacenamiento y multimedia</dd>\n");
      out.write("            <dt>Software</dt>\n");
      out.write("            <dd>Es la parte logica del computador formada por los programas y archivos instalados en la PC,\n");
      out.write("            El software mas importante es el sistema operativo, los lenguajes de programacion, los programas \n");
      out.write("            de diseño, las aplicaciones comerciales, las bases de datos y el software creado por los usuarios</dd>\n");
      out.write("            <dt>Redes</dt>\n");
      out.write("            <dd>Son un conjunto de dispositivos conectados mediante cables de red o en forma inhalambrica\n");
      out.write("            para compartir informacion entre ellos. las redes pueden ser locales, departamentales o entre paises\n");
      out.write("            o a nivel mundial como Internet</dd>\n");
      out.write("        </dl>\n");
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
