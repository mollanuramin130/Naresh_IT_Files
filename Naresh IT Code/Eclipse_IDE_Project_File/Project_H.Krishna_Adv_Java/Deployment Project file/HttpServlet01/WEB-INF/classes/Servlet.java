package javax.servlet;

import java.io.IOException;

public interface Servlet {

    // Called once when the servlet is first loaded into memory
    void init(ServletConfig config) throws ServletException;

    // Called for each request; must be implemented to handle the request
    void service(ServletRequest req, ServletResponse res)
            throws ServletException, IOException;

    // Called when the servlet is about to be taken out of service
    void destroy();

    // Returns the ServletConfig object (contains init params and context)
    ServletConfig getServletConfig();

    // Returns information about the servlet (e.g., version, author)
    String getServletInfo();
}
