import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Support extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        PrintWriter out= resp.getWriter();
    }
    public void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ServletContext sc= this.getServletContext();
        String support_email=sc.getInitParameter("support-email");
        String support_id="tckt"+(int)(Math.random() * 50 + 1);
        req.setAttribute("support_email", support_email);
        req.setAttribute("support_id", support_id);
        req.getRequestDispatcher("success.jsp").forward(req,resp);
    }
}
