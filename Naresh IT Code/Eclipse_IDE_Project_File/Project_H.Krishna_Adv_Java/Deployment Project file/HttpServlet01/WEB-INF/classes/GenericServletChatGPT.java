package javax.servlet;

import java.io.IOException;
import java.util.Enumeration;

public abstract class GenericServlet implements Servlet, ServletConfig, java.io.Serializable {
    private transient ServletConfig config;

    public GenericServlet() {
        // Default constructor
    }

    // Called by the servlet container to indicate to a servlet that the servlet is being placed into service.
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
        this.init();  // Calls the no-arg init method for subclass convenience
    }

    // Subclasses override this method instead of init(ServletConfig)
    public void init() throws ServletException {
        // Default empty implementation
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public String getServletName() {
        return config != null ? config.getServletName() : null;
    }

    @Override
    public ServletContext getServletContext() {
        return config != null ? config.getServletContext() : null;
    }

    @Override
    public String getInitParameter(String name) {
        return config != null ? config.getInitParameter(name) : null;
    }

    @Override
    public Enumeration<String> getInitParameterNames() {
        return config != null ? config.getInitParameterNames() : null;
    }

    @Override
    public void destroy() {
        // Subclasses can override to perform cleanup
    }

    // The service() method must be implemented by the subclass.
    @Override
    public abstract void service(ServletRequest req, ServletResponse res)
            throws ServletException, IOException;

    @Override
    public String toString() {
        return getClass().getName();
    }

    @Override
    public void log(String msg) {
        getServletContext().log(getServletName() + ": " + msg);
    }

    @Override
    public void log(String message, Throwable t) {
        getServletContext().log(getServletName() + ": " + message, t);
    }
}
