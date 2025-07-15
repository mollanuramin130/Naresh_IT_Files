package javax.servlet.http;

import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

public abstract class HttpServlet extends GenericServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "GET method not supported");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "POST method not supported");
    }

    protected void doPut(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "PUT method not supported");
    }

    protected void doDelete(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "DELETE method not supported");
    }

    protected void doHead(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // Calls doGet by default
        doGet(req, resp);
    }

    protected void doOptions(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setHeader("Allow", "GET, HEAD, POST, PUT, DELETE, OPTIONS");
    }

    protected void doTrace(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // Sends a simple trace response
        resp.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "TRACE method not supported");
    }

    @Override
    protected void service(ServletRequest req, ServletResponse res)
            throws ServletException, IOException {

        if (!(req instanceof HttpServletRequest) || !(res instanceof HttpServletResponse)) {
            throw new ServletException("non-HTTP request or response");
        }

        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;

        String method = request.getMethod();

        switch (method) {
            case "GET":
                doGet(request, response);
                break;
            case "POST":
                doPost(request, response);
                break;
            case "PUT":
                doPut(request, response);
                break;
            case "DELETE":
                doDelete(request, response);
                break;
            case "HEAD":
                doHead(request, response);
                break;
            case "OPTIONS":
                doOptions(request, response);
                break;
            case "TRACE":
                doTrace(request, response);
                break;
            default:
                response.sendError(HttpServletResponse.SC_NOT_IMPLEMENTED, "Method not supported");
                break;
        }
    }
}
