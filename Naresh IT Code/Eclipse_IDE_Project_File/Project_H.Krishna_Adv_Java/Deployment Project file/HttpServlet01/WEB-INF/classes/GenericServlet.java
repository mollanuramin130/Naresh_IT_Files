package javax.servlet;

import java.io.IOException;
import java.util.Enumeration;
import java.util.ResourceBundle;

public abstract class GenericServlet implements Servlet, ServletConfig, java.io.Serializable {
    private transient ServletConfig config;
    private static final String LSTRING_FILE = "javax.servlet.LocalStrings";
    private static ResourceBundle lStrings = ResourceBundle.getBundle(LSTRING_FILE);

    public GenericServlet() {}

    @Override
    public void destroy() {}

    @Override
    public String getInitParameter(String name) {
        ServletConfig sc = getServletConfig();
        if (sc == null) {
            throw new IllegalStateException(lStrings.getString("err.servlet_config_not_initialized"));
        }
        return sc.getInitParameter(name);
    }

    @Override
    public Enumeration<String> getInitParameterNames() {
        ServletConfig sc = getServletConfig();
        if (sc == null) {
            throw new IllegalStateException(lStrings.getString("err.servlet_config_not_initialized"));
        }
        return sc.getInitParameterNames();
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public ServletContext getServletContext() {
        ServletConfig sc = getServletConfig();
        if (sc == null) {
            throw new IllegalStateException(lStrings.getString("err.servlet_config_not_initialized"));
        }
        return sc.getServletContext();
    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
        init();
    }

    public void init() throws ServletException {}

    public void log(String msg) {
        getServletContext().log(getServletName() + ": " + msg);
    }

    public void log(String msg, Throwable t) {
        getServletContext().log(getServletName() + ": " + msg, t);
    }

    @Override
    public abstract void service(ServletRequest req, ServletResponse res) throws ServletException, IOException;

    @Override
    public String getServletName() {
        ServletConfig sc = getServletConfig();
        if (sc == null) {
            throw new IllegalStateException(lStrings.getString("err.servlet_config_not_initialized"));
        }
        return sc.getServletName();
    }
}